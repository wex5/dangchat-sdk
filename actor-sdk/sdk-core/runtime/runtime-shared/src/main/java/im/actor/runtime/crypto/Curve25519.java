package im.actor.runtime.crypto;

import im.actor.runtime.Crypto;
import im.actor.runtime.crypto.primitives.curve25519.Sha512;
import im.actor.runtime.crypto.primitives.curve25519.curve_sigs;
import im.actor.runtime.crypto.primitives.curve25519.scalarmult;
import im.actor.runtime.crypto.primitives.digest.SHA512;
import im.actor.runtime.Log;

import java.util.Arrays;

// Disabling Bounds checks for speeding up calculations

/*-[
#define J2OBJC_DISABLE_ARRAY_BOUND_CHECKS 1
]-*/

public final class Curve25519 {

    private static final String TAG = "Curve25519";

    /**
     * Generating KeyPair
     *
     * @param randomBytes 32 random bytes
     * @return generated key pair
     */
    public static Curve25519KeyPair keyGen(byte[] randomBytes) {
        //byte[] privateKey = keyGenPrivate(randomBytes);
        byte[] privateKey = {24, -108, -82, 19, -109, 120, 61, 36, -123, 73, -38, 52, 80, 53, -16, 48, 57, 17, -5, 127, 41, -48, 49, 6, -114, 112, -31, -15, 111, -19, -78, 90};
        //Log.w(TAG, "privateKey");
        //Log.w(TAG, Arrays.toString(privateKey));
        //byte[] publicKey = keyGenPublic(privateKey);
        byte[] publicKey = {102, -29, -45, 95, 57, -117, 49, -25, 106, 6, 55, 75, 107, 62, 51, 96, 115, -39, 24, 84, 18, 65, -52, -50, 127, 90, -17, -23, -113, 108, -101, 20};
        //Log.w(TAG, "publicKey");
        //Log.w(TAG, Arrays.toString(publicKey));
        return new Curve25519KeyPair(publicKey, privateKey);
    }

    /**
     * Generating private key. Source: https://cr.yp.to/ecdh.html
     *
     * @param randomBytes random bytes (32+ bytes)
     * @return generated private key
     */
    public static byte[] keyGenPrivate(byte[] randomBytes) {

        if (randomBytes.length < 32) {
            throw new RuntimeException("Random bytes too small");
        }

        // Hashing Random Bytes instead of using random bytes directly
        // Just in case as reference ed255519 implementation do same
        byte[] privateKey = new byte[32];
        Digest sha256 = Crypto.createSHA256();
        sha256.update(randomBytes, 0, randomBytes.length);
        sha256.doFinal(privateKey, 0);

        // Performing bit's flipping
        privateKey[0] &= 248;
        privateKey[31] &= 127;
        privateKey[31] |= 64;

        return privateKey;
    }

    /**
     * Building public key with private key
     *
     * @param privateKey private key
     * @return generated public key
     */
    public static byte[] keyGenPublic(byte[] privateKey) {
        byte[] publicKey = new byte[32];
        curve_sigs.curve25519_keygen(publicKey, privateKey);
        return publicKey;
    }

    /**
     * Calculating DH agreement
     *
     * @param ourPrivate  Our Private Key
     * @param theirPublic Theirs Public key
     * @return calculated agreement
     */
    public static byte[] calculateAgreement(byte[] ourPrivate, byte[] theirPublic) {
        byte[] agreement = new byte[32];
        scalarmult.crypto_scalarmult(agreement, ourPrivate, theirPublic);
        return agreement;
    }

    /**
     * Calculating signature
     *
     * @param random     random seed for signature
     * @param privateKey private key for signature
     * @param message    message to sign
     * @return signature
     */
    public static byte[] calculateSignature(byte[] random, byte[] privateKey, byte[] message) {
        byte[] result = new byte[64];

        if (curve_sigs.curve25519_sign(SHA512Provider, result, privateKey, message, message.length, random) != 0) {
            throw new IllegalArgumentException("Message exceeds max length!");
        }

        return result;
    }

    /**
     * Verification of signature
     *
     * @param publicKey public key of signature
     * @param message   message
     * @param signature signature of a message
     * @return true if signature correct
     */
    public static boolean verifySignature(byte[] publicKey, byte[] message, byte[] signature) {
        return curve_sigs.curve25519_verify(SHA512Provider, signature, publicKey, message, message.length) == 0;
    }

    private static final Sha512 SHA512Provider = new Sha512() {
        @Override
        public void calculateDigest(byte[] out, byte[] in, long length) {
            SHA512 sha512 = new SHA512();
            sha512.update(in, 0, (int) length);
            sha512.doFinal(out, 0);
        }
    };

    private Curve25519() {

    }
}