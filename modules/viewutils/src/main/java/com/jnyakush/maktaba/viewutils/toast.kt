package com.jnyakush.maktaba.viewutils

import android.content.Context
import android.widget.Toast


/**
 *  Extension for simplify create basic Toast Message
 *  */
fun Context.toast(msg: String, duration: Int = Toast.LENGTH_SHORT): Toast {
    return Toast.makeText(this, msg, duration).apply {
        show()
    }
}

/**
 * Extension for simplify create basic Toast Message with String resource
 * */
fun Context.toastStr(resId: Int, duration: Int = Toast.LENGTH_SHORT): Toast {
    return Toast.makeText(this, this.getString(resId), duration).apply {
        show()
    }
}
