package com.example.uana.model

data class Produto(
    val id: Long,
    val nome: String,
    val descricao: String,
    val codigoProduto: Int,
    val preco: String,
    val imagemProduto: String,
    val estoque: Int,
    val categoria: Categoria
) {
}