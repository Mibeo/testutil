package com.mibeo.utils.util

import android.util.Log

object LogUtil {
    fun e(
        className: String,
        methodName: String,
        content: String
    ) {
        Log.e("zbj", className + "_" + methodName + ": " + content)
    }
}