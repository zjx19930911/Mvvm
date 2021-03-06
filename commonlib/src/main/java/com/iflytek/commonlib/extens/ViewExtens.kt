package com.iflytek.commonlib.extens

import android.app.Activity
import android.os.Handler

import android.util.Log
import android.widget.Toast
import androidx.annotation.ColorRes
import androidx.annotation.DimenRes
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.iflytek.commonlib.BuildConfig
import com.qmuiteam.qmui.widget.dialog.QMUITipDialog


/**
 * description：some extens
 *
 * Created by ditclear on 2017/9/29.
 */

fun Activity.getCompactColor(@ColorRes colorRes: Int): Int = ContextCompat.getColor(this, colorRes)

fun Activity.dpToPx(@DimenRes resID: Int): Int = this.resources.getDimensionPixelOffset(resID)

fun Any.logD(msg: String?) {
    if (BuildConfig.DEBUG) {
        Log.d(javaClass.simpleName, msg)
    }
}

fun Activity.toast(msg: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(applicationContext, msg, Toast.LENGTH_SHORT).show()
}

fun Activity.showSuccessDialog(msg: String?, callback: (() -> Unit)? = null) {
    val dialog = QMUITipDialog.Builder(this)
        .setIconType(QMUITipDialog.Builder.ICON_TYPE_SUCCESS)
        .setTipWord(msg)
        .create()
    dialog.show()
    Handler().postDelayed({
        dialog.dismiss()
        callback?.invoke()
    }, 1500)
}

fun Activity.showFailedDialog(msg: String?, callback: (() -> Unit)? = null) {
    val dialog = QMUITipDialog.Builder(this)
        .setIconType(QMUITipDialog.Builder.ICON_TYPE_FAIL)
        .setTipWord(msg)
        .create()
    dialog.show()
    Handler().postDelayed({
        dialog.dismiss()
        callback?.invoke()
    }, 1500)
}

fun Activity.showWarningDialog(msg: String?, callback: (() -> Unit)? = null) {
    val dialog = QMUITipDialog.Builder(this)
        .setIconType(QMUITipDialog.Builder.ICON_TYPE_INFO)
        .setTipWord(msg)
        .create()
    dialog.show()
    Handler().postDelayed({
        dialog.dismiss()
        callback?.invoke()
    }, 1500)
}

fun Fragment.showSuccessDialog(msg: String?, callback: (() -> Unit)? = null) {
    val dialog = QMUITipDialog.Builder(activity)
        .setIconType(QMUITipDialog.Builder.ICON_TYPE_SUCCESS)
        .setTipWord(msg)
        .create()
    dialog.show()
    Handler().postDelayed({
        dialog.dismiss()
        callback?.invoke()
    }, 1500)
}

fun Fragment.showFailedDialog(msg: String?, callback: (() -> Unit)? = null) {
    val dialog = QMUITipDialog.Builder(activity)
        .setIconType(QMUITipDialog.Builder.ICON_TYPE_FAIL)
        .setTipWord(msg)
        .create()
    dialog.show()
    Handler().postDelayed({
        dialog.dismiss()
        callback?.invoke()
    }, 1500)
}

fun Fragment.showWarningDialog(msg: String?, callback: (() -> Unit)? = null) {
    val dialog = QMUITipDialog.Builder(activity)
        .setIconType(QMUITipDialog.Builder.ICON_TYPE_INFO)
        .setTipWord(msg)
        .create()
    dialog.show()
    Handler().postDelayed({
        dialog.dismiss()
        callback?.invoke()
    }, 1500)
}


