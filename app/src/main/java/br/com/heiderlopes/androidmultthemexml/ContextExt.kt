package br.com.heiderlopes.androidmultthemexml

import android.content.Context
import android.util.TypedValue

fun Context.getColorByThemeAttr(attr: Int, defaultColor: Int): Int {
    val typedValue = TypedValue()
    val got: Boolean = theme.resolveAttribute(attr, typedValue, true)
    return if (got) typedValue.data else defaultColor
}