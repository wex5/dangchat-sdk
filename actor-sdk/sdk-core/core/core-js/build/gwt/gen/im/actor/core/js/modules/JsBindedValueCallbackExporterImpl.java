package im.actor.core.js.modules;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import org.timepedia.exporter.client.Exporter;
import org.timepedia.exporter.client.ExporterUtil;

public class JsBindedValueCallbackExporterImpl implements Exporter, im.actor.core.js.modules.JsBindedValueCallback {
    private com.google.gwt.core.client.JavaScriptObject jso;
    
    public boolean equals(Object obj) {
      return obj != null && obj instanceof JsBindedValueCallbackExporterImpl && jso.equals(((JsBindedValueCallbackExporterImpl)obj).jso);
    }
    public JsBindedValueCallbackExporterImpl() { export(); }
    public JsBindedValueCallbackExporterImpl(com.google.gwt.core.client.JavaScriptObject jso) {
      this.jso = jso;
    }
    
    public static JsBindedValueCallbackExporterImpl makeClosure(com.google.gwt.core.client.JavaScriptObject closure) {
      return new JsBindedValueCallbackExporterImpl(closure);
    }
    
    public void onChanged(java.lang.Object a0) {
      invoke(jso ,a0);
    }
    public native void invoke(com.google.gwt.core.client.JavaScriptObject closure, java.lang.Object a0) /*-{
      closure.apply(null ,[a0]);
    }-*/;
    
    public native void export0() /*-{
      var pkg = @org.timepedia.exporter.client.ExporterUtil::declarePackage(Ljava/lang/String;)('im.actor.core.js.modules.JsBindedValueCallback');
      var _;
      $wnd.im.actor.core.js.modules.JsBindedValueCallback = $entry(function() {
        var g, j = this;
        if (@org.timepedia.exporter.client.ExporterUtil::isAssignableToInstance(Ljava/lang/Class;Lcom/google/gwt/core/client/JavaScriptObject;)(@im.actor.core.js.modules.JsBindedValueCallback::class, arguments))
          g = arguments[0];
        j.g = g;
        @org.timepedia.exporter.client.ExporterUtil::setWrapper(Ljava/lang/Object;Lcom/google/gwt/core/client/JavaScriptObject;)(g, j);
        return j;
      });
      _ = $wnd.im.actor.core.js.modules.JsBindedValueCallback.prototype = new Object();
      _.onChanged = $entry(function(a0) { 
        @org.timepedia.exporter.client.ExporterUtil::runDispatch(Ljava/lang/Object;Ljava/lang/Class;ILcom/google/gwt/core/client/JsArray;ZZ)
         (this.g, @im.actor.core.js.modules.JsBindedValueCallback::class, 0 , arguments, false, false)[0];
      });
      
      @org.timepedia.exporter.client.ExporterUtil::addTypeMap(Ljava/lang/Class;Lcom/google/gwt/core/client/JavaScriptObject;)
       (@im.actor.core.js.modules.JsBindedValueCallback::class, $wnd.im.actor.core.js.modules.JsBindedValueCallback);
      
      if(pkg) for (p in pkg) if ($wnd.im.actor.core.js.modules.JsBindedValueCallback[p] === undefined) $wnd.im.actor.core.js.modules.JsBindedValueCallback[p] = pkg[p];
    }-*/;
    private static boolean exported;
    public void export() { 
      if(!exported) {
        exported=true;
        export0();
      }
    }
}
