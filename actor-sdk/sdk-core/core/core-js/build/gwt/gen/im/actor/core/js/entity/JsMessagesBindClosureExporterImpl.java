package im.actor.core.js.entity;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import org.timepedia.exporter.client.Exporter;
import org.timepedia.exporter.client.ExporterUtil;

public class JsMessagesBindClosureExporterImpl implements Exporter, im.actor.core.js.entity.JsMessagesBindClosure {
    private com.google.gwt.core.client.JavaScriptObject jso;
    
    public boolean equals(Object obj) {
      return obj != null && obj instanceof JsMessagesBindClosureExporterImpl && jso.equals(((JsMessagesBindClosureExporterImpl)obj).jso);
    }
    public JsMessagesBindClosureExporterImpl() { export(); }
    public JsMessagesBindClosureExporterImpl(com.google.gwt.core.client.JavaScriptObject jso) {
      this.jso = jso;
    }
    
    public static JsMessagesBindClosureExporterImpl makeClosure(com.google.gwt.core.client.JavaScriptObject closure) {
      return new JsMessagesBindClosureExporterImpl(closure);
    }
    
    public void onBind(com.google.gwt.core.client.JsArray a0, com.google.gwt.core.client.JsArray a1, boolean a2, double a3, double a4, double a5) {
      invoke(jso ,a0, a1, a2, a3, a4, a5);
    }
    public native void invoke(com.google.gwt.core.client.JavaScriptObject closure, com.google.gwt.core.client.JsArray a0, com.google.gwt.core.client.JsArray a1, boolean a2, double a3, double a4, double a5) /*-{
      closure.apply(a0 ,[a0, a1, a2, a3, a4, a5]);
    }-*/;
    
    public native void export0() /*-{
      var pkg = @org.timepedia.exporter.client.ExporterUtil::declarePackage(Ljava/lang/String;)('im.actor.core.js.entity.JsMessagesBindClosure');
      var _;
      $wnd.im.actor.core.js.entity.JsMessagesBindClosure = $entry(function() {
        var g, j = this;
        if (@org.timepedia.exporter.client.ExporterUtil::isAssignableToInstance(Ljava/lang/Class;Lcom/google/gwt/core/client/JavaScriptObject;)(@im.actor.core.js.entity.JsMessagesBindClosure::class, arguments))
          g = arguments[0];
        j.g = g;
        @org.timepedia.exporter.client.ExporterUtil::setWrapper(Ljava/lang/Object;Lcom/google/gwt/core/client/JavaScriptObject;)(g, j);
        return j;
      });
      _ = $wnd.im.actor.core.js.entity.JsMessagesBindClosure.prototype = new Object();
      _.onBind = $entry(function(a0,a1,a2,a3,a4,a5) { 
        this.g.@im.actor.core.js.entity.JsMessagesBindClosure::onBind(Lcom/google/gwt/core/client/JsArray;Lcom/google/gwt/core/client/JsArray;ZDDD)(a0,a1,a2,a3,a4,a5);
      });
      
      @org.timepedia.exporter.client.ExporterUtil::addTypeMap(Ljava/lang/Class;Lcom/google/gwt/core/client/JavaScriptObject;)
       (@im.actor.core.js.entity.JsMessagesBindClosure::class, $wnd.im.actor.core.js.entity.JsMessagesBindClosure);
      
      if(pkg) for (p in pkg) if ($wnd.im.actor.core.js.entity.JsMessagesBindClosure[p] === undefined) $wnd.im.actor.core.js.entity.JsMessagesBindClosure[p] = pkg[p];
    }-*/;
    private static boolean exported;
    public void export() { 
      if(!exported) {
        exported=true;
        export0();
      }
    }
}
