package im.actor.core.api.rpc;

import im.actor.runtime.bser.*;
import im.actor.runtime.collections.*;
import static im.actor.runtime.bser.Utils.*;
import im.actor.core.network.parser.*;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import com.google.j2objc.annotations.ObjectiveCName;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import im.actor.core.api.*;

public class ResponseRegisterUsers extends Response {

    public static final int HEADER = 0x1771;
    public static ResponseRegisterUsers fromBytes(byte[] data) throws IOException {
        return Bser.parse(new ResponseRegisterUsers(), data);
    }

    private List<ApiRegisteredUser> users;

    public ResponseRegisterUsers(@NotNull List<ApiRegisteredUser> users) {
        this.users = users;
    }

    public ResponseRegisterUsers() {
    }

    @NotNull
    public List<ApiRegisteredUser> getUsers() {
        return this.users;
    }

    @Override
    public void parse(BserValues values) throws IOException {
        List<ApiRegisteredUser> users = new ArrayList<ApiRegisteredUser>();
        for (int i = 0; i < values.getRepeatedCount(1); i ++) {
            users.add(new ApiRegisteredUser());
        }
        this.users = values.getRepeatedObj(1, users);
    }

    @Override
    public void serialize(BserWriter writer) throws IOException {
        writer.writeRepeatedObj(1, this.users);
    }

    @Override
    public String toString() {
        String res = "tuple RegisterUsers{";
        res += "}";
        return res;
    }

    @Override
    public int getHeaderKey() {
        return HEADER;
    }
}