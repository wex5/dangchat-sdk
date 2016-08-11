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

public class RequestRegisterUsers extends Request<ResponseRegisterUsers> {

    public static final int HEADER = 0x1770;
    public static RequestRegisterUsers fromBytes(byte[] data) throws IOException {
        return Bser.parse(new RequestRegisterUsers(), data);
    }

    private List<String> userIds;
    private List<String> userNames;

    public RequestRegisterUsers(List<String> userIds, List<String> userNames) {
        this.userIds = userIds;
        this.userNames = userNames;
    }

    public RequestRegisterUsers() {}

    @NotNull
    public List<String> getUserIds() {
        return this.userIds;
    }

    @NotNull
    public List<String> getUserNames() {
        return this.userNames;
    }

    @Override
    public void parse(BserValues values) throws IOException {
        this.userIds = values.getRepeatedString(1);
        this.userNames = values.getRepeatedString(2);
    }

    @Override
    public void serialize(BserWriter writer) throws IOException {
        writer.writeRepeatedString(1, this.userIds);
        writer.writeRepeatedString(2, this.userNames);
    }

    @Override
    public String toString() {
        String res = "rpc RequestRegisterUsers{";
        res += "userIds=" + this.userIds;
        res += ",userNames=" + this.userNames;
        res += "}";
        return res;
    }

    @Override
    public int getHeaderKey() {
        return HEADER;
    }

}