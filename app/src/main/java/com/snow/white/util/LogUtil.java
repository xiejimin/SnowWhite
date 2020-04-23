package com.snow.white.util;

import android.util.Log;

public class LogUtil {
//1
//2


    private static final boolean isDebug = true;

    public void d(String tag, String message) {
        if(isDebug){
            Log.d(tag, message);
        }
    }

    public void e(String tag, String message) {
        if(isDebug){
            Log.e(tag, message);
        }
    }

    public void i(String tag, String message) {
        if(isDebug){
            Log.i(tag, message);
        }
    }
}
