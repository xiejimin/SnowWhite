package com.snow.white.util;

import android.util.Log;

public class LogUtil {

<<<<<<< HEAD
    //55
    //66
=======
    //5
    //6
    //7

>>>>>>> 6f66375... "2020-04-22 rebase test:log+5"
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
