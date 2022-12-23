package br.com.heiderlopes.androidmultthemexml.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.heiderlopes.androidmultthemexml.R
import br.com.heiderlopes.androidmultthemexml.databinding.FragmentSecondScreenBinding
import br.com.heiderlopes.androidmultthemexml.getColorByThemeAttr

class SecondScreenFragment : Fragment() {
    private lateinit var binding: FragmentSecondScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondScreenBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvHeader.setTextColor(
            requireContext().getColorByThemeAttr(R.attr.primary_700, android.R.color.black)
        )
    }
}