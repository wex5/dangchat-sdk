package im.actor.runtime.js.mvvm;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import org.timepedia.exporter.client.Exporter;
import org.timepedia.exporter.client.ExporterUtil;

public class JsDisplayListCallbackExporterImpl implements Exporter, im.actor.runtime.js.mvvm.JsDisplayListCallback {
    private com.google.gwt.core.client.JavaScriptObject jso;
    
    public boolean equals(Object obj) {
      return obj != null && obj instanceof JsDisplayListCallbackExporterImpl && jso.equals(((JsDisplayListCallbackExporterImpl)obj).jso);
    }
    public JsDisplayListCallbackExporterImpl() { export(); }
    public JsDisplayListCallbackExporterImpl(com.google.gwt.core.client.JavaScriptObject jso) {
      this.jso = jso;
    }
    
    public static JsDisplayListCallbackExporterImpl makeClosure(com.google.gwt.core.client.JavaScriptObject closure) {
      return new JsDisplayListCallbackExporterImpl(closure);
    }
    
    public void onCollectionChanged(com.google.gwt.core.client.JsArray a0, com.google.gwt.core.client.JsArray a1) {
      invoke(jso ,a0, a1);
    }
    public native void invoke(com.google.gwt.core.client.JavaScriptObject closure, com.google.gwt.core.client.JsArray a0, com.google.gwt.core.client.JsArray a1) /*-{
      closure.apply(a0 ,[a0, a1]);
    }-*/;
    
    public native void export0() /*-{
      var pkg = @org.timepedia.exporter.client.ExporterUtil::declarePackage(Ljava/lang/String;)('im.actor.runtime.js.mvvm.JsDisplayListCallback');
      var _;
      $wnd.im.actor.runtime.js.mvvm.JsDisplayListCallback = $entry(function() {
        var g, j = this;
        if (@org.timepedia.exporter.client.ExporterUtil::isAssignableToInstance(Ljava/lang/Class;Lcom/google/gwt/core/client/JavaScriptObject;)(@im.actor.runtime.js.mvvm.JsDisplayListCallback::class, arguments))
          g = arguments[0];
        j.g = g;
        @org.timepedia.exporter.client.ExporterUtil::setWrapper(Ljava/lang/Object;Lcom/google/gwt/core/client/JavaScriptObject;)(g, j);
        return j;
      });
      _ = $wnd.im.actor.runtime.js.mvvm.JsDisplayListCallback.prototype = new Object();
      _.onCollectionChanged = $entry(function(a0,a1) { 
        this.g.@im.actor.runtime.js.mvvm.JsDisplayListCallback::onCollectionChanged(Lcom/google/gwt/core/client/JsArray;Lcom/google/gwt/core/client/JsArray;)(a0,a1);
      });
      
      @org.timepedia.exporter.client.ExporterUtil::addTypeMap(Ljava/lang/Class;Lcom/google/gwt/core/client/JavaScriptObject;)
       (@im.actor.runtime.js.mvvm.JsDisplayListCallback::class, $wnd.im.actor.runtime.js.mvvm.JsDisplayListCallback);
      
      if(pkg) for (p in pkg) if ($wnd.im.actor.runtime.js.mvvm.JsDisplayListCallback[p] === undefined) $wnd.im.actor.runtime.js.mvvm.JsDisplayListCallback[p] = pkg[p];
    }-*/;
    private static boolean exported;
    public void export() { 
      if(!exported) {
        exported=true;
        export0();
      }
    }
}
