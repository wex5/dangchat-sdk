package im.actor.core.entity;

import com.google.j2objc.annotations.Property;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;

import im.actor.core.api.ApiRegisteredUser;
import im.actor.runtime.bser.BserCreator;
import im.actor.runtime.bser.BserValues;
import im.actor.runtime.bser.BserWriter;
import im.actor.runtime.storage.KeyValueItem;

public class RegisteredUser extends WrapperEntity<ApiRegisteredUser> implements KeyValueItem {

    private static final int RECORD_ID = 10;

    public static BserCreator<RegisteredUser> CREATOR = RegisteredUser::new;


    @Property("readonly, nonatomic")
    private int userId;
    private String outUserId;
    private boolean isNewUser;


    public RegisteredUser(@NotNull ApiRegisteredUser registerUser) {
        super(RECORD_ID, registerUser);
    }

    public RegisteredUser(@NotNull byte[] data) throws IOException {
        super(RECORD_ID, data);
    }

    public static RegisteredUser createInstance(int userId, String outUserId, boolean isNewUser) {
        RegisteredUser user = new RegisteredUser();
        user.setUserId(userId);
        user.setOutuserId(outUserId);
        user.setIsNewUser(isNewUser);
        return user;
    }

    private RegisteredUser() {
        super(RECORD_ID);
    }


    public int getUserId() {
        return this.userId;
    }
    private void setUserId(int userId) { this.userId = userId; }

    public String getOutUserId() {
        return this.outUserId;
    }
    private void setOutuserId(String outuserId) { this.outUserId = outuserId; }

    public boolean getIsNewUser() { return this.isNewUser; }
    public void setIsNewUser(boolean isNewUser) { this.isNewUser = isNewUser; }


    @Override
    protected void applyWrapped(@NotNull ApiRegisteredUser wrapped) {
        this.userId = wrapped.getId();
        this.outUserId = wrapped.getOutId();
        this.isNewUser = wrapped.getIsNewUser();
    }

    @Override
    public void parse(BserValues values) throws IOException {
        // Is Wrapper Layout
        if (values.getBool(4, false)) {
            // Parse wrapper layout
            super.parse(values);
        } else {
            // Convert old layout
            throw new IOException("Unsupported obsolete format");
        }
    }

    @Override
    public void serialize(BserWriter writer) throws IOException {
        // Mark as wrapper layout
        writer.writeBool(4, true);
        // Serialize wrapper layout
        super.serialize(writer);
    }

    @Override
    public long getEngineId() {
        return this.userId;
    }

    @Override
    @NotNull
    protected ApiRegisteredUser createInstance() {
        return new ApiRegisteredUser();
    }

}