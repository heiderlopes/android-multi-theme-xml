package br.com.heiderlopes.androidmultthemexml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.heiderlopes.androidmultthemexml.databinding.ActivityLoyaltyHomeBinding

class LoyaltyHomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoyaltyHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoyaltyHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvHello.setTextColor(getColorByThemeAttr(R.attr.primary_700, android.R.color.black))
    }
}