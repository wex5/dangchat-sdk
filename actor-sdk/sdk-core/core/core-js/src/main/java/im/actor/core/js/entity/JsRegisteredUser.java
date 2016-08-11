package im.actor.core.js.entity;

import com.google.gwt.core.client.JavaScriptObject;
import im.actor.core.js.JsMessenger;
import im.actor.core.viewmodel.RegisteredUserVM;

public class JsRegisteredUser extends JavaScriptObject {

    public static JsRegisteredUser fromRegisteredUserVM(RegisteredUserVM registeredUserVM, JsMessenger messenger) {
        return create(registeredUserVM.getId(), registeredUserVM.getOutId().get(), registeredUserVM.getIsNewUser());
    }

    public static native JsRegisteredUser create(int userId, String outUserId, boolean isNewUser)/*-{
        return {
            id: userId, outId: outUserId, isNewUser: isNewUser
        };
    }-*/;

    protected JsRegisteredUser() {

    }

    public native final int getGid()/*-{
        return this.id;
    }-*/;

}