package com.example.uana

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.uana.databinding.FragmentFormBinding

class FormFragment : Fragment() {

    private lateinit var binding : FragmentFormBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        binding = FragmentFormBinding.inflate(layoutInflater,container, false)

        binding.buttonSalvar.setOnClickListener{
            findNavController().navigate(R.id.action_formFragment_to_produtoFragment)
        }

        binding.buttonCancelar.setOnClickListener {
            findNavController().navigate(R.id.action_formFragment_to_produtoFragment)
        }

        return binding.root
    }

}