package com.example.sqlitecomroom

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.sqlitecomroom.data.Usuario
import com.example.sqlitecomroom.databinding.FragmentAddBinding


class AddFragment : Fragment() {

    private lateinit var binding: FragmentAddBinding
    private lateinit var mainViewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentAddBinding.inflate(layoutInflater, container, false)

        mainViewModel = ViewModelProvider(this).get(mainViewModel::class.java)

        binding.buttonAdd.setOnClickListener {
            inserirNoBanco()
        }

        return binding.root
    }

    fun verificarCampos(nome: String, sobrenome: String, idade: String): Boolean {

        return !(nome == "" || sobrenome == "" || idade == "")
    }

    fun inserirNoBanco() {
        val nome = binding.editNome.text.toString()
        val sobrenome = binding.editSobrenome.text.toString()
        val idade = binding.editIdade.text.toString()

        if (verificarCampos(nome, sobrenome, idade)) {

            val user = Usuario(0, nome, sobrenome, idade.toInt())
            mainViewModel.addUser(user)

            Toast.makeText(context, "Usuário Adicionado!", Toast.LENGTH_LONG).show()

            findNavController().navigate(R.id.action_addFragment_to_listFragment)

        } else {

            Toast.makeText(context, "Insira todos os Campos!", Toast.LENGTH_LONG).show()

        }
    }


}