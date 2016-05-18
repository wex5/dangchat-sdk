package im.actor.core.js;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import org.timepedia.exporter.client.Exporter;
import org.timepedia.exporter.client.ExporterUtil;

public class JsFacadeExporterImpl implements Exporter {
    public static im.actor.runtime.js.utils.JsPromise __static_wrapper_createGroup(im.actor.core.js.JsFacade instance, java.lang.String a0, im.actor.runtime.js.fs.JsFile a1, JavaScriptObject a2) {
      return instance.createGroup(a0, a1, ExporterUtil.toArrInt(a2));
    }
    public JsFacadeExporterImpl() { export(); }
    public native void export0() /*-{
      var pkg = @org.timepedia.exporter.client.ExporterUtil::declarePackage(Ljava/lang/String;)('actor.ActorApp');
      var _;
      $wnd.actor.ActorApp = $entry(function() {
        var g, j = this;
        if (@org.timepedia.exporter.client.ExporterUtil::isAssignableToInstance(Ljava/lang/Class;Lcom/google/gwt/core/client/JavaScriptObject;)(@im.actor.core.js.JsFacade::class, arguments))
          g = arguments[0];
        else if (arguments.length == 0)
          g = @im.actor.core.js.JsFacadeExporterImpl::___create()();
        j.g = g;
        @org.timepedia.exporter.client.ExporterUtil::setWrapper(Ljava/lang/Object;Lcom/google/gwt/core/client/JavaScriptObject;)(g, j);
        return j;
      });
      _ = $wnd.actor.ActorApp.prototype = new Object();
      _.addContact = $entry(function(a0) { 
        return this.g.@im.actor.core.js.JsFacade::addContact(I)(a0);
      });
      _.addLike = $entry(function(a0,a1) { 
        return this.g.@im.actor.core.js.JsFacade::addLike(Lim/actor/core/js/entity/JsPeer;Ljava/lang/String;)(a0,a1);
      });
      _.answerCall = $entry(function(a0) { 
        this.g.@im.actor.core.js.JsFacade::answerCall(Ljava/lang/String;)(a0);
      });
      _.archiveChat = $entry(function(a0) { 
        return this.g.@im.actor.core.js.JsFacade::archiveChat(Lim/actor/core/js/entity/JsPeer;)(a0);
      });
      _.bindCall = $entry(function(a0,a1) { 
        this.g.@im.actor.core.js.JsFacade::bindCall(Ljava/lang/String;Lim/actor/core/js/modules/JsBindedValueCallback;)(a0,a1 == null ? null : (a1.constructor == $wnd.im.actor.core.js.modules.JsBindedValueCallback ? a1.g : @im.actor.core.js.modules.JsBindedValueCallbackExporterImpl::makeClosure(Lcom/google/gwt/core/client/JavaScriptObject;)(a1)));
      });
      _.bindConnectState = $entry(function(a0) { 
        this.g.@im.actor.core.js.JsFacade::bindConnectState(Lim/actor/core/js/modules/JsBindedValueCallback;)(a0 == null ? null : (a0.constructor == $wnd.im.actor.core.js.modules.JsBindedValueCallback ? a0.g : @im.actor.core.js.modules.JsBindedValueCallbackExporterImpl::makeClosure(Lcom/google/gwt/core/client/JavaScriptObject;)(a0)));
      });
      _.bindContacts = $entry(function(a0) { 
        this.g.@im.actor.core.js.JsFacade::bindContacts(Lim/actor/runtime/js/mvvm/JsDisplayListCallback;)(a0 == null ? null : (a0.constructor == $wnd.im.actor.runtime.js.mvvm.JsDisplayListCallback ? a0.g : @im.actor.runtime.js.mvvm.JsDisplayListCallbackExporterImpl::makeClosure(Lcom/google/gwt/core/client/JavaScriptObject;)(a0)));
      });
      _.bindDialogs = $entry(function(a0) { 
        this.g.@im.actor.core.js.JsFacade::bindDialogs(Lim/actor/runtime/js/mvvm/JsDisplayListCallback;)(a0 == null ? null : (a0.constructor == $wnd.im.actor.runtime.js.mvvm.JsDisplayListCallback ? a0.g : @im.actor.runtime.js.mvvm.JsDisplayListCallbackExporterImpl::makeClosure(Lcom/google/gwt/core/client/JavaScriptObject;)(a0)));
      });
      _.bindEventBus = $entry(function(a0) { 
        this.g.@im.actor.core.js.JsFacade::bindEventBus(Lim/actor/core/js/entity/JsEventBusCallback;)(a0 == null ? null : (a0.constructor == $wnd.im.actor.core.js.entity.JsEventBusCallback ? a0.g : @im.actor.core.js.entity.JsEventBusCallbackExporterImpl::makeClosure(Lcom/google/gwt/core/client/JavaScriptObject;)(a0)));
      });
      _.bindGlobalCounter = $entry(function(a0) { 
        this.g.@im.actor.core.js.JsFacade::bindGlobalCounter(Lim/actor/core/js/modules/JsBindedValueCallback;)(a0 == null ? null : (a0.constructor == $wnd.im.actor.core.js.modules.JsBindedValueCallback ? a0.g : @im.actor.core.js.modules.JsBindedValueCallbackExporterImpl::makeClosure(Lcom/google/gwt/core/client/JavaScriptObject;)(a0)));
      });
      _.bindGroup = $entry(function(a0,a1) { 
        this.g.@im.actor.core.js.JsFacade::bindGroup(ILim/actor/core/js/modules/JsBindedValueCallback;)(a0,a1 == null ? null : (a1.constructor == $wnd.im.actor.core.js.modules.JsBindedValueCallback ? a1.g : @im.actor.core.js.modules.JsBindedValueCallbackExporterImpl::makeClosure(Lcom/google/gwt/core/client/JavaScriptObject;)(a1)));
      });
      _.bindGroupDialogs = $entry(function(a0) { 
        this.g.@im.actor.core.js.JsFacade::bindGroupDialogs(Lim/actor/core/js/modules/JsBindedValueCallback;)(a0 == null ? null : (a0.constructor == $wnd.im.actor.core.js.modules.JsBindedValueCallback ? a0.g : @im.actor.core.js.modules.JsBindedValueCallbackExporterImpl::makeClosure(Lcom/google/gwt/core/client/JavaScriptObject;)(a0)));
      });
      _.bindGroupOnline = $entry(function(a0,a1) { 
        this.g.@im.actor.core.js.JsFacade::bindGroupOnline(ILim/actor/core/js/modules/JsBindedValueCallback;)(a0,a1 == null ? null : (a1.constructor == $wnd.im.actor.core.js.modules.JsBindedValueCallback ? a1.g : @im.actor.core.js.modules.JsBindedValueCallbackExporterImpl::makeClosure(Lcom/google/gwt/core/client/JavaScriptObject;)(a1)));
      });
      _.bindMessages = $entry(function(a0,a1) { 
        return @org.timepedia.exporter.client.ExporterUtil::wrap(Ljava/lang/Object;)(this.g.@im.actor.core.js.JsFacade::bindMessages(Lim/actor/core/js/entity/JsPeer;Lim/actor/core/js/entity/JsMessagesBindClosure;)(a0,a1 == null ? null : (a1.constructor == $wnd.im.actor.core.js.entity.JsMessagesBindClosure ? a1.g : @im.actor.core.js.entity.JsMessagesBindClosureExporterImpl::makeClosure(Lcom/google/gwt/core/client/JavaScriptObject;)(a1))));
      });
      _.bindSearch = $entry(function(a0) { 
        this.g.@im.actor.core.js.JsFacade::bindSearch(Lim/actor/runtime/js/mvvm/JsDisplayListCallback;)(a0 == null ? null : (a0.constructor == $wnd.im.actor.runtime.js.mvvm.JsDisplayListCallback ? a0.g : @im.actor.runtime.js.mvvm.JsDisplayListCallbackExporterImpl::makeClosure(Lcom/google/gwt/core/client/JavaScriptObject;)(a0)));
      });
      _.bindStickers = $entry(function(a0) { 
        this.g.@im.actor.core.js.JsFacade::bindStickers(Lim/actor/core/js/modules/JsBindedValueCallback;)(a0 == null ? null : (a0.constructor == $wnd.im.actor.core.js.modules.JsBindedValueCallback ? a0.g : @im.actor.core.js.modules.JsBindedValueCallbackExporterImpl::makeClosure(Lcom/google/gwt/core/client/JavaScriptObject;)(a0)));
      });
      _.bindTempGlobalCounter = $entry(function(a0) { 
        this.g.@im.actor.core.js.JsFacade::bindTempGlobalCounter(Lim/actor/core/js/modules/JsBindedValueCallback;)(a0 == null ? null : (a0.constructor == $wnd.im.actor.core.js.modules.JsBindedValueCallback ? a0.g : @im.actor.core.js.modules.JsBindedValueCallbackExporterImpl::makeClosure(Lcom/google/gwt/core/client/JavaScriptObject;)(a0)));
      });
      _.bindTyping = $entry(function(a0,a1) { 
        this.g.@im.actor.core.js.JsFacade::bindTyping(Lim/actor/core/js/entity/JsPeer;Lim/actor/core/js/modules/JsBindedValueCallback;)(a0,a1 == null ? null : (a1.constructor == $wnd.im.actor.core.js.modules.JsBindedValueCallback ? a1.g : @im.actor.core.js.modules.JsBindedValueCallbackExporterImpl::makeClosure(Lcom/google/gwt/core/client/JavaScriptObject;)(a1)));
      });
      _.bindUser = $entry(function(a0,a1) { 
        this.g.@im.actor.core.js.JsFacade::bindUser(ILim/actor/core/js/modules/JsBindedValueCallback;)(a0,a1 == null ? null : (a1.constructor == $wnd.im.actor.core.js.modules.JsBindedValueCallback ? a1.g : @im.actor.core.js.modules.JsBindedValueCallbackExporterImpl::makeClosure(Lcom/google/gwt/core/client/JavaScriptObject;)(a1)));
      });
      _.bindUserBlocked = $entry(function(a0,a1) { 
        this.g.@im.actor.core.js.JsFacade::bindUserBlocked(ILim/actor/core/js/modules/JsBindedValueCallback;)(a0,a1 == null ? null : (a1.constructor == $wnd.im.actor.core.js.modules.JsBindedValueCallback ? a1.g : @im.actor.core.js.modules.JsBindedValueCallbackExporterImpl::makeClosure(Lcom/google/gwt/core/client/JavaScriptObject;)(a1)));
      });
      _.bindUserOnline = $entry(function(a0,a1) { 
        this.g.@im.actor.core.js.JsFacade::bindUserOnline(ILim/actor/core/js/modules/JsBindedValueCallback;)(a0,a1 == null ? null : (a1.constructor == $wnd.im.actor.core.js.modules.JsBindedValueCallback ? a1.g : @im.actor.core.js.modules.JsBindedValueCallbackExporterImpl::makeClosure(Lcom/google/gwt/core/client/JavaScriptObject;)(a1)));
      });
      _.blockUser = $entry(function(a0) { 
        return this.g.@im.actor.core.js.JsFacade::blockUser(I)(a0);
      });
      _.changeGroupAvatar = $entry(function(a0,a1) { 
        this.g.@im.actor.core.js.JsFacade::changeGroupAvatar(ILim/actor/runtime/js/fs/JsFile;)(a0,a1);
      });
      _.changeGroupNotificationsEnabled = $entry(function(a0) { 
        this.g.@im.actor.core.js.JsFacade::changeGroupNotificationsEnabled(Z)(a0);
      });
      _.changeIsOnlyMentionNotifications = $entry(function(a0) { 
        this.g.@im.actor.core.js.JsFacade::changeIsOnlyMentionNotifications(Z)(a0);
      });
      _.changeIsShowNotificationTextEnabled = $entry(function(a0) { 
        this.g.@im.actor.core.js.JsFacade::changeIsShowNotificationTextEnabled(Z)(a0);
      });
      _.changeMyAvatar = $entry(function(a0) { 
        this.g.@im.actor.core.js.JsFacade::changeMyAvatar(Lim/actor/runtime/js/fs/JsFile;)(a0);
      });
      _.changeNotificationsEnabled = $entry(function(a0,a1) { 
        this.g.@im.actor.core.js.JsFacade::changeNotificationsEnabled(Lim/actor/core/js/entity/JsPeer;Z)(a0,a1);
      });
      _.changeSendByEnter = $entry(function(a0) { 
        this.g.@im.actor.core.js.JsFacade::changeSendByEnter(Z)(a0);
      });
      _.changeSoundEffectsEnabled = $entry(function(a0) { 
        this.g.@im.actor.core.js.JsFacade::changeSoundEffectsEnabled(Z)(a0);
      });
      _.clearChat = $entry(function(a0) { 
        return this.g.@im.actor.core.js.JsFacade::clearChat(Lim/actor/core/js/entity/JsPeer;)(a0);
      });
      _.createGroup = $entry(function(a0,a1,a2) { 
        return @im.actor.core.js.JsFacadeExporterImpl::__static_wrapper_createGroup(Lim/actor/core/js/JsFacade;Ljava/lang/String;Lim/actor/runtime/js/fs/JsFile;Lcom/google/gwt/core/client/JavaScriptObject;)(this.g, a0,a1,a2);
      });
      _.deleteChat = $entry(function(a0) { 
        return this.g.@im.actor.core.js.JsFacade::deleteChat(Lim/actor/core/js/entity/JsPeer;)(a0);
      });
      _.deleteMessage = $entry(function(a0,a1) { 
        this.g.@im.actor.core.js.JsFacade::deleteMessage(Lim/actor/core/js/entity/JsPeer;Ljava/lang/String;)(a0,a1);
      });
      _.doCall = $entry(function(a0) { 
        return this.g.@im.actor.core.js.JsFacade::doCall(I)(a0);
      });
      _.doGroupCall = $entry(function(a0) { 
        return this.g.@im.actor.core.js.JsFacade::doGroupCall(I)(a0);
      });
      _.editGroupAbout = $entry(function(a0,a1) { 
        return this.g.@im.actor.core.js.JsFacade::editGroupAbout(ILjava/lang/String;)(a0,a1);
      });
      _.editGroupTitle = $entry(function(a0,a1) { 
        return this.g.@im.actor.core.js.JsFacade::editGroupTitle(ILjava/lang/String;)(a0,a1);
      });
      _.editMessage = $entry(function(a0,a1,a2) { 
        return this.g.@im.actor.core.js.JsFacade::editMessage(Lim/actor/core/js/entity/JsPeer;Ljava/lang/String;Ljava/lang/String;)(a0,a1,a2);
      });
      _.editMyAbout = $entry(function(a0) { 
        return this.g.@im.actor.core.js.JsFacade::editMyAbout(Ljava/lang/String;)(a0);
      });
      _.editMyName = $entry(function(a0) { 
        return this.g.@im.actor.core.js.JsFacade::editMyName(Ljava/lang/String;)(a0);
      });
      _.editMyNick = $entry(function(a0) { 
        return this.g.@im.actor.core.js.JsFacade::editMyNick(Ljava/lang/String;)(a0);
      });
      _.editName = $entry(function(a0,a1) { 
        return this.g.@im.actor.core.js.JsFacade::editName(ILjava/lang/String;)(a0,a1);
      });
      _.endCall = $entry(function(a0) { 
        this.g.@im.actor.core.js.JsFacade::endCall(Ljava/lang/String;)(a0);
      });
      _.favoriteChat = $entry(function(a0) { 
        return this.g.@im.actor.core.js.JsFacade::favoriteChat(Lim/actor/core/js/entity/JsPeer;)(a0);
      });
      _.findAllDocs = $entry(function(a0) { 
        return this.g.@im.actor.core.js.JsFacade::findAllDocs(Lim/actor/core/js/entity/JsPeer;)(a0);
      });
      _.findAllLinks = $entry(function(a0) { 
        return this.g.@im.actor.core.js.JsFacade::findAllLinks(Lim/actor/core/js/entity/JsPeer;)(a0);
      });
      _.findAllPhotos = $entry(function(a0) { 
        return this.g.@im.actor.core.js.JsFacade::findAllPhotos(Lim/actor/core/js/entity/JsPeer;)(a0);
      });
      _.findAllText = $entry(function(a0,a1) { 
        return this.g.@im.actor.core.js.JsFacade::findAllText(Lim/actor/core/js/entity/JsPeer;Ljava/lang/String;)(a0,a1);
      });
      _.findBotCommands = $entry(function(a0,a1) { 
        return this.g.@im.actor.core.js.JsFacade::findBotCommands(ILjava/lang/String;)(a0,a1);
      });
      _.findGroups = $entry(function() { 
        return this.g.@im.actor.core.js.JsFacade::findGroups()();
      });
      _.findMentions = $entry(function(a0,a1) { 
        return this.g.@im.actor.core.js.JsFacade::findMentions(ILjava/lang/String;)(a0,a1);
      });
      _.findUsers = $entry(function(a0) { 
        return this.g.@im.actor.core.js.JsFacade::findUsers(Ljava/lang/String;)(a0);
      });
      _.getAuthPhone = $entry(function() { 
        return this.g.@im.actor.core.js.JsFacade::getAuthPhone()();
      });
      _.getAuthState = $entry(function() { 
        return this.g.@im.actor.core.js.JsFacade::getAuthState()();
      });
      _.getGroup = $entry(function(a0) { 
        return this.g.@im.actor.core.js.JsFacade::getGroup(I)(a0);
      });
      _.getGroupPeer = $entry(function(a0) { 
        return this.g.@im.actor.core.js.JsFacade::getGroupPeer(I)(a0);
      });
      _.getIntegrationToken = $entry(function(a0) { 
        return this.g.@im.actor.core.js.JsFacade::getIntegrationToken(I)(a0);
      });
      _.getInviteLink = $entry(function(a0) { 
        return this.g.@im.actor.core.js.JsFacade::getInviteLink(I)(a0);
      });
      _.getStickers = $entry(function() { 
        return this.g.@im.actor.core.js.JsFacade::getStickers()();
      });
      _.getTyping = $entry(function(a0) { 
        return this.g.@im.actor.core.js.JsFacade::getTyping(Lim/actor/core/js/entity/JsPeer;)(a0);
      });
      _.getUid = $entry(function() { 
        return this.g.@im.actor.core.js.JsFacade::getUid()();
      });
      _.getUser = $entry(function(a0) { 
        return this.g.@im.actor.core.js.JsFacade::getUser(I)(a0);
      });
      _.getUserPeer = $entry(function(a0) { 
        return this.g.@im.actor.core.js.JsFacade::getUserPeer(I)(a0);
      });
      _.handleLinkClick = $entry(function(a0) { 
        this.g.@im.actor.core.js.JsFacade::handleLinkClick(Lcom/google/gwt/user/client/Event;)(a0);
      });
      _.init = $entry(function(a0) { 
        this.g.@im.actor.core.js.JsFacade::init(Lim/actor/core/js/entity/JsConfig;)(a0);
      });
      _.inviteMember = $entry(function(a0,a1) { 
        return this.g.@im.actor.core.js.JsFacade::inviteMember(II)(a0,a1);
      });
      _.isElectron = $entry(function() { 
        return this.g.@im.actor.core.js.JsFacade::isElectron()();
      });
      _.isGroupsNotificationsEnabled = $entry(function() { 
        return this.g.@im.actor.core.js.JsFacade::isGroupsNotificationsEnabled()();
      });
      _.isLoggedIn = $entry(function() { 
        return this.g.@im.actor.core.js.JsFacade::isLoggedIn()();
      });
      _.isNotificationsEnabled = $entry(function(a0) { 
        return this.g.@im.actor.core.js.JsFacade::isNotificationsEnabled(Lim/actor/core/js/entity/JsPeer;)(a0);
      });
      _.isOnlyMentionNotifications = $entry(function() { 
        return this.g.@im.actor.core.js.JsFacade::isOnlyMentionNotifications()();
      });
      _.isSendByEnterEnabled = $entry(function() { 
        return this.g.@im.actor.core.js.JsFacade::isSendByEnterEnabled()();
      });
      _.isShowNotificationsTextEnabled = $entry(function() { 
        return this.g.@im.actor.core.js.JsFacade::isShowNotificationsTextEnabled()();
      });
      _.isSoundEffectsEnabled = $entry(function() { 
        return this.g.@im.actor.core.js.JsFacade::isSoundEffectsEnabled()();
      });
      _.isStarted = $entry(function(a0) { 
        return this.g.@im.actor.core.js.JsFacade::isStarted(I)(a0);
      });
      _.joinGroupViaLink = $entry(function(a0) { 
        return this.g.@im.actor.core.js.JsFacade::joinGroupViaLink(Ljava/lang/String;)(a0);
      });
      _.kickMember = $entry(function(a0,a1) { 
        return this.g.@im.actor.core.js.JsFacade::kickMember(II)(a0,a1);
      });
      _.leaveGroup = $entry(function(a0) { 
        return this.g.@im.actor.core.js.JsFacade::leaveGroup(I)(a0);
      });
      _.loadArchivedDialogs = $entry(function() { 
        return this.g.@im.actor.core.js.JsFacade::loadArchivedDialogs()();
      });
      _.loadBlockedUsers = $entry(function() { 
        return this.g.@im.actor.core.js.JsFacade::loadBlockedUsers()();
      });
      _.loadDraft = $entry(function(a0) { 
        return this.g.@im.actor.core.js.JsFacade::loadDraft(Lim/actor/core/js/entity/JsPeer;)(a0);
      });
      _.loadMoreArchivedDialogs = $entry(function() { 
        return this.g.@im.actor.core.js.JsFacade::loadMoreArchivedDialogs()();
      });
      _.loadSessions = $entry(function() { 
        return this.g.@im.actor.core.js.JsFacade::loadSessions()();
      });
      _.onAppHidden = $entry(function() { 
        this.g.@im.actor.core.js.JsFacade::onAppHidden()();
      });
      _.onAppVisible = $entry(function() { 
        this.g.@im.actor.core.js.JsFacade::onAppVisible()();
      });
      _.onChatEnd = $entry(function(a0) { 
        this.g.@im.actor.core.js.JsFacade::onChatEnd(Lim/actor/core/js/entity/JsPeer;)(a0);
      });
      _.onConversationClosed = $entry(function(a0) { 
        this.g.@im.actor.core.js.JsFacade::onConversationClosed(Lim/actor/core/js/entity/JsPeer;)(a0);
      });
      _.onConversationOpen = $entry(function(a0) { 
        this.g.@im.actor.core.js.JsFacade::onConversationOpen(Lim/actor/core/js/entity/JsPeer;)(a0);
      });
      _.onDialogsClosed = $entry(function() { 
        this.g.@im.actor.core.js.JsFacade::onDialogsClosed()();
      });
      _.onDialogsEnd = $entry(function() { 
        this.g.@im.actor.core.js.JsFacade::onDialogsEnd()();
      });
      _.onDialogsOpen = $entry(function() { 
        this.g.@im.actor.core.js.JsFacade::onDialogsOpen()();
      });
      _.onProfileClosed = $entry(function(a0) { 
        this.g.@im.actor.core.js.JsFacade::onProfileClosed(I)(a0);
      });
      _.onProfileOpen = $entry(function(a0) { 
        this.g.@im.actor.core.js.JsFacade::onProfileOpen(I)(a0);
      });
      _.onTyping = $entry(function(a0) { 
        this.g.@im.actor.core.js.JsFacade::onTyping(Lim/actor/core/js/entity/JsPeer;)(a0);
      });
      _.preInitChat = $entry(function(a0) { 
        this.g.@im.actor.core.js.JsFacade::preInitChat(Lim/actor/core/js/entity/JsPeer;)(a0);
      });
      _.removeContact = $entry(function(a0) { 
        return this.g.@im.actor.core.js.JsFacade::removeContact(I)(a0);
      });
      _.removeGroupAvatar = $entry(function(a0) { 
        this.g.@im.actor.core.js.JsFacade::removeGroupAvatar(I)(a0);
      });
      _.removeLike = $entry(function(a0,a1) { 
        return this.g.@im.actor.core.js.JsFacade::removeLike(Lim/actor/core/js/entity/JsPeer;Ljava/lang/String;)(a0,a1);
      });
      _.removeMyAvatar = $entry(function() { 
        this.g.@im.actor.core.js.JsFacade::removeMyAvatar()();
      });
      _.renderMarkdown = $entry(function(a0) { 
        return this.g.@im.actor.core.js.JsFacade::renderMarkdown(Ljava/lang/String;)(a0);
      });
      _.requestCodeEmail = $entry(function(a0,a1,a2) { 
        this.g.@im.actor.core.js.JsFacade::requestCodeEmail(Ljava/lang/String;Lim/actor/core/js/entity/JsAuthSuccessClosure;Lim/actor/core/js/entity/JsAuthErrorClosure;)(a0,a1 == null ? null : (a1.constructor == $wnd.im.actor.core.js.entity.JsAuthSuccessClosure ? a1.g : @im.actor.core.js.entity.JsAuthSuccessClosureExporterImpl::makeClosure(Lcom/google/gwt/core/client/JavaScriptObject;)(a1)),a2 == null ? null : (a2.constructor == $wnd.im.actor.core.js.entity.JsAuthErrorClosure ? a2.g : @im.actor.core.js.entity.JsAuthErrorClosureExporterImpl::makeClosure(Lcom/google/gwt/core/client/JavaScriptObject;)(a2)));
      });
      _.requestSms = $entry(function(a0,a1,a2) { 
        this.g.@im.actor.core.js.JsFacade::requestSms(Ljava/lang/String;Lim/actor/core/js/entity/JsAuthSuccessClosure;Lim/actor/core/js/entity/JsAuthErrorClosure;)(a0,a1 == null ? null : (a1.constructor == $wnd.im.actor.core.js.entity.JsAuthSuccessClosure ? a1.g : @im.actor.core.js.entity.JsAuthSuccessClosureExporterImpl::makeClosure(Lcom/google/gwt/core/client/JavaScriptObject;)(a1)),a2 == null ? null : (a2.constructor == $wnd.im.actor.core.js.entity.JsAuthErrorClosure ? a2.g : @im.actor.core.js.entity.JsAuthErrorClosureExporterImpl::makeClosure(Lcom/google/gwt/core/client/JavaScriptObject;)(a2)));
      });
      _.revokeIntegrationToken = $entry(function(a0) { 
        return this.g.@im.actor.core.js.JsFacade::revokeIntegrationToken(I)(a0);
      });
      _.revokeInviteLink = $entry(function(a0) { 
        return this.g.@im.actor.core.js.JsFacade::revokeInviteLink(I)(a0);
      });
      _.saveDraft = $entry(function(a0,a1) { 
        this.g.@im.actor.core.js.JsFacade::saveDraft(Lim/actor/core/js/entity/JsPeer;Ljava/lang/String;)(a0,a1);
      });
      _.sendClipboardPhoto = $entry(function(a0,a1) { 
        this.g.@im.actor.core.js.JsFacade::sendClipboardPhoto(Lim/actor/core/js/entity/JsPeer;Lim/actor/runtime/js/fs/JsBlob;)(a0,a1);
      });
      _.sendCode = $entry(function(a0,a1,a2) { 
        this.g.@im.actor.core.js.JsFacade::sendCode(Ljava/lang/String;Lim/actor/core/js/entity/JsAuthSuccessClosure;Lim/actor/core/js/entity/JsAuthErrorClosure;)(a0,a1 == null ? null : (a1.constructor == $wnd.im.actor.core.js.entity.JsAuthSuccessClosure ? a1.g : @im.actor.core.js.entity.JsAuthSuccessClosureExporterImpl::makeClosure(Lcom/google/gwt/core/client/JavaScriptObject;)(a1)),a2 == null ? null : (a2.constructor == $wnd.im.actor.core.js.entity.JsAuthErrorClosure ? a2.g : @im.actor.core.js.entity.JsAuthErrorClosureExporterImpl::makeClosure(Lcom/google/gwt/core/client/JavaScriptObject;)(a2)));
      });
      _.sendFile = $entry(function(a0,a1) { 
        this.g.@im.actor.core.js.JsFacade::sendFile(Lim/actor/core/js/entity/JsPeer;Lim/actor/runtime/js/fs/JsFile;)(a0,a1);
      });
      _.sendMessage = $entry(function(a0,a1) { 
        this.g.@im.actor.core.js.JsFacade::sendMessage(Lim/actor/core/js/entity/JsPeer;Ljava/lang/String;)(a0,a1);
      });
      _.sendPhoto = $entry(function(a0,a1) { 
        this.g.@im.actor.core.js.JsFacade::sendPhoto(Lim/actor/core/js/entity/JsPeer;Lim/actor/runtime/js/fs/JsFile;)(a0,a1);
      });
      _.sendSticker = $entry(function(a0,a1) { 
        this.g.@im.actor.core.js.JsFacade::sendSticker(Lim/actor/core/js/entity/JsPeer;Lim/actor/core/js/entity/JsSticker;)(a0,a1);
      });
      _.sendVoiceMessage = $entry(function(a0,a1,a2) { 
        this.g.@im.actor.core.js.JsFacade::sendVoiceMessage(Lim/actor/core/js/entity/JsPeer;ILim/actor/runtime/js/fs/JsBlob;)(a0,a1,a2);
      });
      _.signUp = $entry(function(a0,a1,a2) { 
        this.g.@im.actor.core.js.JsFacade::signUp(Ljava/lang/String;Lim/actor/core/js/entity/JsAuthSuccessClosure;Lim/actor/core/js/entity/JsAuthErrorClosure;)(a0,a1 == null ? null : (a1.constructor == $wnd.im.actor.core.js.entity.JsAuthSuccessClosure ? a1.g : @im.actor.core.js.entity.JsAuthSuccessClosureExporterImpl::makeClosure(Lcom/google/gwt/core/client/JavaScriptObject;)(a1)),a2 == null ? null : (a2.constructor == $wnd.im.actor.core.js.entity.JsAuthErrorClosure ? a2.g : @im.actor.core.js.entity.JsAuthErrorClosureExporterImpl::makeClosure(Lcom/google/gwt/core/client/JavaScriptObject;)(a2)));
      });
      _.terminateAllSessions = $entry(function() { 
        return this.g.@im.actor.core.js.JsFacade::terminateAllSessions()();
      });
      _.terminateSession = $entry(function(a0) { 
        return this.g.@im.actor.core.js.JsFacade::terminateSession(I)(a0);
      });
      _.toggleCallMute = $entry(function(a0) { 
        this.g.@im.actor.core.js.JsFacade::toggleCallMute(Ljava/lang/String;)(a0);
      });
      _.unbindCall = $entry(function(a0,a1) { 
        this.g.@im.actor.core.js.JsFacade::unbindCall(Ljava/lang/String;Lim/actor/core/js/modules/JsBindedValueCallback;)(a0,a1 == null ? null : (a1.constructor == $wnd.im.actor.core.js.modules.JsBindedValueCallback ? a1.g : @im.actor.core.js.modules.JsBindedValueCallbackExporterImpl::makeClosure(Lcom/google/gwt/core/client/JavaScriptObject;)(a1)));
      });
      _.unbindConnectState = $entry(function(a0) { 
        this.g.@im.actor.core.js.JsFacade::unbindConnectState(Lim/actor/core/js/modules/JsBindedValueCallback;)(a0 == null ? null : (a0.constructor == $wnd.im.actor.core.js.modules.JsBindedValueCallback ? a0.g : @im.actor.core.js.modules.JsBindedValueCallbackExporterImpl::makeClosure(Lcom/google/gwt/core/client/JavaScriptObject;)(a0)));
      });
      _.unbindContacts = $entry(function(a0) { 
        this.g.@im.actor.core.js.JsFacade::unbindContacts(Lim/actor/runtime/js/mvvm/JsDisplayListCallback;)(a0 == null ? null : (a0.constructor == $wnd.im.actor.runtime.js.mvvm.JsDisplayListCallback ? a0.g : @im.actor.runtime.js.mvvm.JsDisplayListCallbackExporterImpl::makeClosure(Lcom/google/gwt/core/client/JavaScriptObject;)(a0)));
      });
      _.unbindDialogs = $entry(function(a0) { 
        this.g.@im.actor.core.js.JsFacade::unbindDialogs(Lim/actor/runtime/js/mvvm/JsDisplayListCallback;)(a0 == null ? null : (a0.constructor == $wnd.im.actor.runtime.js.mvvm.JsDisplayListCallback ? a0.g : @im.actor.runtime.js.mvvm.JsDisplayListCallbackExporterImpl::makeClosure(Lcom/google/gwt/core/client/JavaScriptObject;)(a0)));
      });
      _.unbindEventBus = $entry(function(a0) { 
        this.g.@im.actor.core.js.JsFacade::unbindEventBus(Lim/actor/core/js/entity/JsEventBusCallback;)(a0 == null ? null : (a0.constructor == $wnd.im.actor.core.js.entity.JsEventBusCallback ? a0.g : @im.actor.core.js.entity.JsEventBusCallbackExporterImpl::makeClosure(Lcom/google/gwt/core/client/JavaScriptObject;)(a0)));
      });
      _.unbindGlobalCounter = $entry(function(a0) { 
        this.g.@im.actor.core.js.JsFacade::unbindGlobalCounter(Lim/actor/core/js/modules/JsBindedValueCallback;)(a0 == null ? null : (a0.constructor == $wnd.im.actor.core.js.modules.JsBindedValueCallback ? a0.g : @im.actor.core.js.modules.JsBindedValueCallbackExporterImpl::makeClosure(Lcom/google/gwt/core/client/JavaScriptObject;)(a0)));
      });
      _.unbindGroup = $entry(function(a0,a1) { 
        this.g.@im.actor.core.js.JsFacade::unbindGroup(ILim/actor/core/js/modules/JsBindedValueCallback;)(a0,a1 == null ? null : (a1.constructor == $wnd.im.actor.core.js.modules.JsBindedValueCallback ? a1.g : @im.actor.core.js.modules.JsBindedValueCallbackExporterImpl::makeClosure(Lcom/google/gwt/core/client/JavaScriptObject;)(a1)));
      });
      _.unbindGroupDialogs = $entry(function(a0) { 
        this.g.@im.actor.core.js.JsFacade::unbindGroupDialogs(Lim/actor/core/js/modules/JsBindedValueCallback;)(a0 == null ? null : (a0.constructor == $wnd.im.actor.core.js.modules.JsBindedValueCallback ? a0.g : @im.actor.core.js.modules.JsBindedValueCallbackExporterImpl::makeClosure(Lcom/google/gwt/core/client/JavaScriptObject;)(a0)));
      });
      _.unbindGroupOnline = $entry(function(a0,a1) { 
        this.g.@im.actor.core.js.JsFacade::unbindGroupOnline(ILim/actor/core/js/modules/JsBindedValueCallback;)(a0,a1 == null ? null : (a1.constructor == $wnd.im.actor.core.js.modules.JsBindedValueCallback ? a1.g : @im.actor.core.js.modules.JsBindedValueCallbackExporterImpl::makeClosure(Lcom/google/gwt/core/client/JavaScriptObject;)(a1)));
      });
      _.unbindSearch = $entry(function(a0) { 
        this.g.@im.actor.core.js.JsFacade::unbindSearch(Lim/actor/runtime/js/mvvm/JsDisplayListCallback;)(a0 == null ? null : (a0.constructor == $wnd.im.actor.runtime.js.mvvm.JsDisplayListCallback ? a0.g : @im.actor.runtime.js.mvvm.JsDisplayListCallbackExporterImpl::makeClosure(Lcom/google/gwt/core/client/JavaScriptObject;)(a0)));
      });
      _.unbindStickers = $entry(function(a0) { 
        this.g.@im.actor.core.js.JsFacade::unbindStickers(Lim/actor/core/js/modules/JsBindedValueCallback;)(a0 == null ? null : (a0.constructor == $wnd.im.actor.core.js.modules.JsBindedValueCallback ? a0.g : @im.actor.core.js.modules.JsBindedValueCallbackExporterImpl::makeClosure(Lcom/google/gwt/core/client/JavaScriptObject;)(a0)));
      });
      _.unbindTempGlobalCounter = $entry(function(a0) { 
        this.g.@im.actor.core.js.JsFacade::unbindTempGlobalCounter(Lim/actor/core/js/modules/JsBindedValueCallback;)(a0 == null ? null : (a0.constructor == $wnd.im.actor.core.js.modules.JsBindedValueCallback ? a0.g : @im.actor.core.js.modules.JsBindedValueCallbackExporterImpl::makeClosure(Lcom/google/gwt/core/client/JavaScriptObject;)(a0)));
      });
      _.unbindTyping = $entry(function(a0,a1) { 
        this.g.@im.actor.core.js.JsFacade::unbindTyping(Lim/actor/core/js/entity/JsPeer;Lim/actor/core/js/modules/JsBindedValueCallback;)(a0,a1 == null ? null : (a1.constructor == $wnd.im.actor.core.js.modules.JsBindedValueCallback ? a1.g : @im.actor.core.js.modules.JsBindedValueCallbackExporterImpl::makeClosure(Lcom/google/gwt/core/client/JavaScriptObject;)(a1)));
      });
      _.unbindUser = $entry(function(a0,a1) { 
        this.g.@im.actor.core.js.JsFacade::unbindUser(ILim/actor/core/js/modules/JsBindedValueCallback;)(a0,a1 == null ? null : (a1.constructor == $wnd.im.actor.core.js.modules.JsBindedValueCallback ? a1.g : @im.actor.core.js.modules.JsBindedValueCallbackExporterImpl::makeClosure(Lcom/google/gwt/core/client/JavaScriptObject;)(a1)));
      });
      _.unbindUserBlocked = $entry(function(a0,a1) { 
        this.g.@im.actor.core.js.JsFacade::unbindUserBlocked(ILim/actor/core/js/modules/JsBindedValueCallback;)(a0,a1 == null ? null : (a1.constructor == $wnd.im.actor.core.js.modules.JsBindedValueCallback ? a1.g : @im.actor.core.js.modules.JsBindedValueCallbackExporterImpl::makeClosure(Lcom/google/gwt/core/client/JavaScriptObject;)(a1)));
      });
      _.unbindUserOnline = $entry(function(a0,a1) { 
        this.g.@im.actor.core.js.JsFacade::unbindUserOnline(ILim/actor/core/js/modules/JsBindedValueCallback;)(a0,a1 == null ? null : (a1.constructor == $wnd.im.actor.core.js.modules.JsBindedValueCallback ? a1.g : @im.actor.core.js.modules.JsBindedValueCallbackExporterImpl::makeClosure(Lcom/google/gwt/core/client/JavaScriptObject;)(a1)));
      });
      _.unblockUser = $entry(function(a0) { 
        return this.g.@im.actor.core.js.JsFacade::unblockUser(I)(a0);
      });
      _.unfavoriteChat = $entry(function(a0) { 
        return this.g.@im.actor.core.js.JsFacade::unfavoriteChat(Lim/actor/core/js/entity/JsPeer;)(a0);
      });
      
      @org.timepedia.exporter.client.ExporterUtil::addTypeMap(Ljava/lang/Class;Lcom/google/gwt/core/client/JavaScriptObject;)
       (@im.actor.core.js.JsFacade::class, $wnd.actor.ActorApp);
      
      if(pkg) for (p in pkg) if ($wnd.actor.ActorApp[p] === undefined) $wnd.actor.ActorApp[p] = pkg[p];
    }-*/;
    public static im.actor.core.js.JsFacade ___create() {
      return new im.actor.core.js.JsFacade();
    }
    private static boolean exported;
    public void export() { 
      if(!exported) {
        exported=true;
        GWT.create(im.actor.core.js.entity.JsMessagesBind.class);
        export0();
      }
    }
}
