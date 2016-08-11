package im.actor.core.api;

import im.actor.runtime.bser.*;
import im.actor.runtime.collections.*;
import static im.actor.runtime.bser.Utils.*;
import im.actor.core.network.parser.*;
import com.google.j2objc.annotations.ObjectiveCName;
import java.io.IOException;

public class ApiRegisteredUser extends BserObject {

    private int id;
    private String outId;
    private boolean isNewUser;

    public ApiRegisteredUser(int id, String outId, boolean isNewUser) {
        this.id = id;
        this.outId = outId;
        this.isNewUser = isNewUser;
    }

    public ApiRegisteredUser() {}


    public int getId() {
        return this.id;
    }

    public String getOutId() {
        return this.outId;
    }

    public boolean getIsNewUser() { return this.isNewUser; }


    @Override
    public void parse(BserValues values) throws IOException {
        this.id = values.getInt(1);
        this.outId = values.getString(2);
        this.isNewUser = values.getBool(3);
    }

    @Override
    public void serialize(BserWriter writer) throws IOException {
        writer.writeInt(1, this.id);
        writer.writeString(2, this.outId);
        writer.writeBool(3, this.isNewUser);
    }

    @Override
    public String toString() {
        String res = "struct RegisterUser{";
        res += "id=" + this.id;
        res += ", outId=" + this.outId;
        res += ", isNewUser=" + this.isNewUser;
        res += "}";
        return res;
    }

}