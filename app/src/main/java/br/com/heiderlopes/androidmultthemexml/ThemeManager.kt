package br.com.heiderlopes.androidmultthemexml

import android.content.Context

internal object ThemeManager {
//    operator fun set(context: Context, activeTheme: String) {
////        var themeRecourseID: Int = R.style.DarK
////        if (activeTheme == "DarkMode") {
////            themeRecourseID = R.style.DarkMode
////        }
//        //context.setTheme(themeRecourseID)
//        //context.setTheme(R.style.Theme_AndroidMultThemeXML)
//        context.setTheme(R.style.Theme_AndroidMultThemeXML_Loyalty)
//    }

    operator fun set(context: Context, themeId: Int) {
//        var themeRecourseID: Int = R.style.DarK
//        if (activeTheme == "DarkMode") {
//            themeRecourseID = R.style.DarkMode
//        }
        //context.setTheme(themeRecourseID)
        //context.setTheme(R.style.Theme_AndroidMultThemeXML)
        context.setTheme(themeId)
    }
}