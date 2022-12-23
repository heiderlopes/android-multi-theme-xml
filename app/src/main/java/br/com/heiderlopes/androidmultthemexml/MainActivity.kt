package br.com.heiderlopes.androidmultthemexml

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.heiderlopes.androidmultthemexml.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btNext.setOnClickListener {
            startActivity(
                Intent(this, LoyaltyHomeActivity::class.java)
            )
        }

        binding.tvHello.setTextColor(
            getColorByThemeAttr(R.attr.primary_700, android.R.color.black)
        )
    }
}