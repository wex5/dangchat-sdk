package org.timepedia.exporter.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import org.timepedia.exporter.client.Exporter;
import org.timepedia.exporter.client.ExporterUtil;

public class ExportAllExporterImpl implements Exporter {
  public ExportAllExporterImpl() { export(); } 
  public void export() { 
    GWT.create(im.actor.core.js.entity.JsAuthErrorClosure.class);
    GWT.create(im.actor.core.js.entity.JsAuthSuccessClosure.class);
    GWT.create(im.actor.core.js.entity.JsEventBusCallback.class);
    GWT.create(im.actor.core.js.entity.JsMessagesBindClosure.class);
    GWT.create(im.actor.core.js.modules.JsBindedValueCallback.class);
    GWT.create(im.actor.runtime.js.mvvm.JsDisplayListCallback.class);
    GWT.create(im.actor.core.js.JsFacade.class);
  }
}
