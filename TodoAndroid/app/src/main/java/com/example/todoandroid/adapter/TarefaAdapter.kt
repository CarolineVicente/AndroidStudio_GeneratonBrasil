package com.example.todoandroid.adapter

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.todoandroid.MainViewModel
import com.example.todoandroid.databinding.CardLayoutBinding
import com.example.todoandroid.model.Tarefa
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class TarefaAdapter(

    val taskClickListener: TaskClickListener,
    val mainViewModel: MainViewModel,
    val context : Context

) : RecyclerView.Adapter<TarefaAdapter.TarefaViewHolder>() {


    private var listTarefa = emptyList<Tarefa>()

    class TarefaViewHolder(val binding: CardLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarefaViewHolder {
        return TarefaViewHolder(
            CardLayoutBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: TarefaViewHolder, position: Int) {
        val tarefa = listTarefa[position]

        holder.binding.textNome.text = tarefa.nome
        holder.binding.textDescricao.text = tarefa.descricao
        holder.binding.textResponsavel.text = tarefa.responsavel
        holder.binding.textData.text = tarefa.data
        holder.binding.switchAtivo.isChecked = tarefa.status
        holder.binding.textCategoria.text = tarefa.categoria.descricao

        holder.itemView.setOnClickListener {

            taskClickListener.onTaskClickListener(tarefa)

        }

        holder.binding.switchAtivo
            .setOnCheckedChangeListener { buttonView, ativo ->

                tarefa.status = ativo
                mainViewModel.updateTarefa(tarefa)
            }

        holder.binding.buttonDeletar.setOnClickListener {

            showAlertDialog(tarefa.id)
        }

    }

    override fun getItemCount(): Int {
        return listTarefa.size
    }

    fun setList(list: List<Tarefa>) {
        listTarefa = list.sortedByDescending { it.id }
        notifyDataSetChanged()
    }

    fun showAlertDialog(id : Long){
        AlertDialog.Builder(context)
            .setTitle("Excluir Tarefa")
            .setMessage("Deseja excluir a Tarefa?")
            .setPositiveButton("Sim"){
                _,_ -> mainViewModel.deleteTarefa(id)
            }
            .setNegativeButton("Não"){
                _,_ -> //faça nada
            }.show()
    }
}