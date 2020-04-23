package com.snow.white.util;

import android.util.Log;

public class LogUtil {

    public static final boolean isDebug = true;

    public void d(String tag, String message) {
        if(isDebug){
            Log.d(tag, message);
        }
    }
}
