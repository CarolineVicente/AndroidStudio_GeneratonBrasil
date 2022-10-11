package com.example.uana.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.uana.databinding.CardLayoutBinding
import com.example.uana.model.Produto

class ProdutoAdapter : RecyclerView.Adapter<ProdutoAdapter.ProdutoViewHolder>(


) {
    private var listProduto = emptyList<Produto>()

    class ProdutoViewHolder(val binding: CardLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoViewHolder {
        return ProdutoViewHolder(
            CardLayoutBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {
        val produto = listProduto[position]
        holder.binding.textNome.text = produto.nome
        holder.binding.textDescricao.text = produto.descricao
        holder.binding.textCodigoProduto.text = produto.codigoProduto.toString()
        holder.binding.textPreco.text = produto.preco
        holder.binding.textImagemProduto.text = produto.imagemProduto
        holder.binding.textEstoque.text = produto.estoque.toString()
        holder.binding.textCategoria.text = produto.categoria.nome
    }

    override fun getItemCount(): Int {
        return listProduto.size
    }

    fun setList(list: List<Produto>) {

        listProduto = list
        notifyDataSetChanged()
    }
}