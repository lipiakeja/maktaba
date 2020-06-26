package com.jnyakush.maktaba.viewutils

import android.view.View
import androidx.annotation.StringRes
import com.google.android.material.snackbar.Snackbar

/**
 *  Creates basic Snackbar Message
 * */

fun View.snackbar(
    @StringRes messageStringRes: Int,
    duration: Int = Snackbar.LENGTH_LONG
): Snackbar {
    return this.snackbar(this.resources.getString(messageStringRes), duration)
}

/**
 * Creates basic Snackbar Message
 * */

fun View.snackbar(
    msg: String,
    duration: Int = Snackbar.LENGTH_LONG
): Snackbar {
    return Snackbar.make(this, msg, duration).apply { show() }
}

/**
 *  Sets an action for snackbar
 * */
fun Snackbar.action(
    @StringRes actionTextStringRes: Int,
    actionTextColor: Int? = null,
    listener: (View) -> Unit
) {
    action(view.resources.getString(actionTextStringRes), actionTextColor, listener)
}

/**
 * Sets an action for snackbar
 * */
fun Snackbar.action(
    actionText: String,
    actionTextColor: Int? = null,
    listener: (View) -> Unit
) {
    setAction(actionText, listener)
    actionTextColor?.let { setActionTextColor(actionTextColor) }
}