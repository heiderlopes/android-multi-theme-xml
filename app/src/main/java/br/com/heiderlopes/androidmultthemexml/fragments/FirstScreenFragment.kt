package br.com.heiderlopes.androidmultthemexml.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import br.com.heiderlopes.androidmultthemexml.R
import br.com.heiderlopes.androidmultthemexml.databinding.FragmentFirstScreenBinding
import br.com.heiderlopes.androidmultthemexml.getColorByThemeAttr

class FirstScreenFragment : Fragment() {
    private lateinit var binding: FragmentFirstScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstScreenBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            tvHeader.setTextColor(
                requireContext().getColorByThemeAttr(R.attr.primary_700, android.R.color.black)
            )

            btNext.setOnClickListener {
                findNavController().navigate(R.id.action_first_screen_to_second_screen)
            }
        }
    }
}