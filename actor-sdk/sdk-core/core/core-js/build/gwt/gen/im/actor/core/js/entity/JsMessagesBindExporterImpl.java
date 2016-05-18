package im.actor.core.js.entity;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import org.timepedia.exporter.client.Exporter;
import org.timepedia.exporter.client.ExporterUtil;

public class JsMessagesBindExporterImpl implements Exporter {
    public JsMessagesBindExporterImpl() { export(); }
    public native void export0() /*-{
      var pkg = @org.timepedia.exporter.client.ExporterUtil::declarePackage(Ljava/lang/String;)('im.actor.core.js.entity.JsMessagesBind');
      var _;
      $wnd.im.actor.core.js.entity.JsMessagesBind = $entry(function() {
        var g, j = this;
        if (@org.timepedia.exporter.client.ExporterUtil::isAssignableToInstance(Ljava/lang/Class;Lcom/google/gwt/core/client/JavaScriptObject;)(@im.actor.core.js.entity.JsMessagesBind::class, arguments))
          g = arguments[0];
        else if (arguments.length == 3)
          g = @im.actor.core.js.entity.JsMessagesBindExporterImpl::___create(Lim/actor/core/js/entity/JsMessagesBindClosure;Lim/actor/runtime/js/mvvm/JsDisplayList;Lim/actor/core/viewmodel/ConversationVM;)(arguments[0] == null ? null : (arguments[0].constructor == $wnd.im.actor.core.js.entity.JsMessagesBindClosure ? arguments[0].g : @im.actor.core.js.entity.JsMessagesBindClosureExporterImpl::makeClosure(Lcom/google/gwt/core/client/JavaScriptObject;)(arguments[0])),@org.timepedia.exporter.client.ExporterUtil::gwtInstance(Ljava/lang/Object;)(arguments[1]),@org.timepedia.exporter.client.ExporterUtil::gwtInstance(Ljava/lang/Object;)(arguments[2]));
        j.g = g;
        @org.timepedia.exporter.client.ExporterUtil::setWrapper(Ljava/lang/Object;Lcom/google/gwt/core/client/JavaScriptObject;)(g, j);
        return j;
      });
      _ = $wnd.im.actor.core.js.entity.JsMessagesBind.prototype = new Object();
      _.initAll = $entry(function() { 
        this.g.@im.actor.core.js.entity.JsMessagesBind::initAll()();
      });
      _.onCollectionChanged = $entry(function(a0,a1) { 
        this.g.@im.actor.core.js.entity.JsMessagesBind::onCollectionChanged(Lcom/google/gwt/core/client/JsArray;Lcom/google/gwt/core/client/JsArray;)(a0,a1);
      });
      _.unbind = $entry(function() { 
        this.g.@im.actor.core.js.entity.JsMessagesBind::unbind()();
      });
      
      @org.timepedia.exporter.client.ExporterUtil::addTypeMap(Ljava/lang/Class;Lcom/google/gwt/core/client/JavaScriptObject;)
       (@im.actor.core.js.entity.JsMessagesBind::class, $wnd.im.actor.core.js.entity.JsMessagesBind);
      
      if(pkg) for (p in pkg) if ($wnd.im.actor.core.js.entity.JsMessagesBind[p] === undefined) $wnd.im.actor.core.js.entity.JsMessagesBind[p] = pkg[p];
    }-*/;
    public static im.actor.core.js.entity.JsMessagesBind ___create(im.actor.core.js.entity.JsMessagesBindClosure a0, im.actor.runtime.js.mvvm.JsDisplayList a1, im.actor.core.viewmodel.ConversationVM a2) {
      return new im.actor.core.js.entity.JsMessagesBind(a0, a1, a2);
    }
    private static boolean exported;
    public void export() { 
      if(!exported) {
        exported=true;
        export0();
      }
    }
}
