package im.actor.core.js.entity;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import org.timepedia.exporter.client.Exporter;
import org.timepedia.exporter.client.ExporterUtil;

public class JsEventBusCallbackExporterImpl implements Exporter, im.actor.core.js.entity.JsEventBusCallback {
    private com.google.gwt.core.client.JavaScriptObject jso;
    
    public boolean equals(Object obj) {
      return obj != null && obj instanceof JsEventBusCallbackExporterImpl && jso.equals(((JsEventBusCallbackExporterImpl)obj).jso);
    }
    public JsEventBusCallbackExporterImpl() { export(); }
    public JsEventBusCallbackExporterImpl(com.google.gwt.core.client.JavaScriptObject jso) {
      this.jso = jso;
    }
    
    public static JsEventBusCallbackExporterImpl makeClosure(com.google.gwt.core.client.JavaScriptObject closure) {
      return new JsEventBusCallbackExporterImpl(closure);
    }
    
    public void onEvent(java.lang.String a0, com.google.gwt.core.client.JavaScriptObject a1) {
      invoke(jso ,a0, a1);
    }
    public native void invoke(com.google.gwt.core.client.JavaScriptObject closure, java.lang.String a0, com.google.gwt.core.client.JavaScriptObject a1) /*-{
      closure.apply(a1 ,[a0, a1]);
    }-*/;
    
    public native void export0() /*-{
      var pkg = @org.timepedia.exporter.client.ExporterUtil::declarePackage(Ljava/lang/String;)('im.actor.core.js.entity.JsEventBusCallback');
      var _;
      $wnd.im.actor.core.js.entity.JsEventBusCallback = $entry(function() {
        var g, j = this;
        if (@org.timepedia.exporter.client.ExporterUtil::isAssignableToInstance(Ljava/lang/Class;Lcom/google/gwt/core/client/JavaScriptObject;)(@im.actor.core.js.entity.JsEventBusCallback::class, arguments))
          g = arguments[0];
        j.g = g;
        @org.timepedia.exporter.client.ExporterUtil::setWrapper(Ljava/lang/Object;Lcom/google/gwt/core/client/JavaScriptObject;)(g, j);
        return j;
      });
      _ = $wnd.im.actor.core.js.entity.JsEventBusCallback.prototype = new Object();
      _.onEvent = $entry(function(a0,a1) { 
        this.g.@im.actor.core.js.entity.JsEventBusCallback::onEvent(Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(a0,a1);
      });
      
      @org.timepedia.exporter.client.ExporterUtil::addTypeMap(Ljava/lang/Class;Lcom/google/gwt/core/client/JavaScriptObject;)
       (@im.actor.core.js.entity.JsEventBusCallback::class, $wnd.im.actor.core.js.entity.JsEventBusCallback);
      
      if(pkg) for (p in pkg) if ($wnd.im.actor.core.js.entity.JsEventBusCallback[p] === undefined) $wnd.im.actor.core.js.entity.JsEventBusCallback[p] = pkg[p];
    }-*/;
    private static boolean exported;
    public void export() { 
      if(!exported) {
        exported=true;
        export0();
      }
    }
}
