package im.actor.core.viewmodel;

import com.google.j2objc.annotations.ObjectiveCName;
import com.google.j2objc.annotations.Property;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

import im.actor.core.entity.RegisteredUser;
import im.actor.core.viewmodel.generics.StringValueModel;
import im.actor.runtime.annotations.MainThread;
import im.actor.runtime.mvvm.BaseValueModel;
import im.actor.runtime.mvvm.ModelChangedListener;
import im.actor.runtime.mvvm.ValueModel;
import im.actor.runtime.mvvm.ValueModelCreator;


public class RegisteredUserVM extends BaseValueModel<RegisteredUser> {

    public static ValueModelCreator<RegisteredUser, RegisteredUserVM> CREATOR(final int myUid) {
        return new ValueModelCreator<RegisteredUser, RegisteredUserVM>() {
            @Override
            public RegisteredUserVM create(RegisteredUser baseValue) {
                return new RegisteredUserVM(baseValue);
            }
        };
    }

    @Property("nonatomic, readonly")
    private int userId;

    @Property("nonatomic, readonly")
    private StringValueModel outUserId;

    @Property("nonatomic, readonly")
    private boolean isNewUser;

    @NotNull
    private ArrayList<ModelChangedListener<RegisteredUserVM>> listeners = new ArrayList<ModelChangedListener<RegisteredUserVM>>();

    public RegisteredUserVM(@NotNull RegisteredUser rawObj) {
        super(rawObj);
        this.userId = rawObj.getUserId();
        this.outUserId = new StringValueModel("user." + userId + ".outUserId", rawObj.getOutUserId());
        this.isNewUser = rawObj.getIsNewUser();
    }

    @ObjectiveCName("getId")
    public int getId() {
        return this.userId;
    }

    @ObjectiveCName("getOutId")
    public StringValueModel getOutId() { return this.outUserId; }

    @ObjectiveCName("getIsNewUser")
    public boolean getIsNewUser() { return this.isNewUser; }

    @Override
    protected void updateValues(@NotNull RegisteredUser rawObj) {
        boolean isChanged = this.userId != rawObj.getUserId();
        isChanged |= outUserId.change(rawObj.getOutUserId());

        if (isChanged) {
            notifyChange();
        }
    }

    private void notifyChange() {
        im.actor.runtime.Runtime.postToMainThread(new Runnable() {
            @Override
            public void run() {
                for (ModelChangedListener<RegisteredUserVM> l : listeners.toArray(new ModelChangedListener[listeners.size()])) {
                    l.onChanged(RegisteredUserVM.this);
                }
            }
        });
    }

}