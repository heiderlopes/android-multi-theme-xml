package br.com.heiderlopes.androidmultthemexml

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.content.res.Resources
import android.content.res.TypedArray
import android.graphics.Color
import android.os.Bundle
import android.util.TypedValue
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var tvHello: TextView
    private lateinit var btNext: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        //ThemeManager[this] = R.style.Theme_AndroidMultThemeXML_Loyalty;
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvHello = findViewById(R.id.tvHello)
        btNext = findViewById(R.id.btNext)

        btNext.setOnClickListener {
            startActivity(
                Intent(this, LoyaltyHomeActivity::class.java)
            )
        }

        tvHello.setTextColor(getColorByThemeAttr(this, R.attr.primaryTextColor, R.color.colorOnPrimary))
        //setColor()
    }

    private fun setColor() {
        val attrs = intArrayOf(R.attr.primaryTextColor)
        try { //getPackageManager() can throw an exeption
            val themeId = this.packageManager.getActivityInfo(this.componentName, 0).theme
            val ta: TypedArray = this.obtainStyledAttributes(themeId, attrs)
            val color = ta.getColor(0, Color.BLACK) //I set Black as the default color
            tvHello.setTextColor(color)
            ta.recycle()
        } catch (e: PackageManager.NameNotFoundException) {
            e.printStackTrace()
        }
    }

    private fun getColorByThemeAttr(context: Context, attr: Int, defaultColor: Int): Int {
        val typedValue = TypedValue()
        val theme: Resources.Theme = context.theme
        val got: Boolean = theme.resolveAttribute(attr, typedValue, true)
        return if (got) typedValue.data else defaultColor
    }
}