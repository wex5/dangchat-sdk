package com.google.gwt.i18n.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import java.util.HashMap;

public class LocaleInfoImpl_shared extends com.google.gwt.i18n.client.impl.LocaleInfoImpl {
  private static native String getLocaleNativeDisplayName(
      JavaScriptObject nativeDisplayNamesNative,String localeName) /*-{
    return nativeDisplayNamesNative[localeName];
  }-*/;
  
  HashMap<String,String> nativeDisplayNamesJava;
  private JavaScriptObject nativeDisplayNamesNative;
  
  @Override
  public String[] getAvailableLocaleNames() {
    return new String[] {
      "default",
      "ar",
      "cn",
      "en",
      "es",
      "pt",
      "ru",
    };
  }
  
  @Override
  public String getLocaleNativeDisplayName(String localeName) {
    if (GWT.isScript()) {
      if (nativeDisplayNamesNative == null) {
        nativeDisplayNamesNative = loadNativeDisplayNamesNative();
      }
      return getLocaleNativeDisplayName(nativeDisplayNamesNative, localeName);
    } else {
      if (nativeDisplayNamesJava == null) {
        nativeDisplayNamesJava = new HashMap<String, String>();
        nativeDisplayNamesJava.put("ar", "العربية");
        nativeDisplayNamesJava.put("en", "English");
        nativeDisplayNamesJava.put("es", "español");
        nativeDisplayNamesJava.put("pt", "português");
        nativeDisplayNamesJava.put("ru", "русский");
      }
      return nativeDisplayNamesJava.get(localeName);
    }
  }
  
  @Override
  public boolean hasAnyRTL() {
    return true;
  }
  
  private native JavaScriptObject loadNativeDisplayNamesNative() /*-{
    return {
      "ar": "العربية",
      "en": "English",
      "es": "español",
      "pt": "português",
      "ru": "русский"
    };
  }-*/;
}
