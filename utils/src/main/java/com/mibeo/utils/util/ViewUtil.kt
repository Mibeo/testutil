package com.mibeo.utils.util

import android.view.View

object ViewUtil {
    fun setHeight(v: View, height: Int) {
        val layoutParams = v.layoutParams
        if (layoutParams != null) {
            layoutParams.height = height
            v.layoutParams = layoutParams
        }
    }

    fun setWidth(v: View, width: Int) {
        val layoutParams = v.layoutParams
        if (layoutParams != null) {
            layoutParams.width = width
            v.layoutParams = layoutParams
        }
    }

    fun setWidthAndHeight(v: View, width: Int, height: Int) {
        val layoutParams = v.layoutParams
        if (layoutParams != null) {
            layoutParams.width = width
            layoutParams.height = height
            v.layoutParams = layoutParams
        }
    }
}