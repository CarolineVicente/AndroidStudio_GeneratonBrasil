package com.example.todoandroid.model

data class Categoria(
    var id: Long,
    var descricao: String,
    var tarefa: List<Tarefa>
) {

}