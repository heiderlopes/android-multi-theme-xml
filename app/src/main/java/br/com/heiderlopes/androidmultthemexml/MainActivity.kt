package br.com.heiderlopes.androidmultthemexml

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import br.com.heiderlopes.androidmultthemexml.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setNavigationController()

        binding.tvHeader.setTextColor(
            getColorByThemeAttr(R.attr.primary_700, android.R.color.black)
        )

        binding.btNext.setOnClickListener {
            startActivity(
                Intent(this, LoyaltyHomeActivity::class.java)
            )
        }
    }

    private fun setNavigationController() {
        navController = Navigation.findNavController(this, R.id.nav_host_fragment_main)
    }
}