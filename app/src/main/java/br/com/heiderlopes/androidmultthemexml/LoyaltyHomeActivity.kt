package br.com.heiderlopes.androidmultthemexml

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import br.com.heiderlopes.androidmultthemexml.databinding.ActivityLoyaltyHomeBinding

class LoyaltyHomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoyaltyHomeBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoyaltyHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setNavigationController()

        binding.tvHeader.setTextColor(
            getColorByThemeAttr(R.attr.primary_700, android.R.color.black)
        )
    }

    private fun setNavigationController() {
        navController = Navigation.findNavController(this, R.id.nav_host_fragment_loyalty)
    }
}