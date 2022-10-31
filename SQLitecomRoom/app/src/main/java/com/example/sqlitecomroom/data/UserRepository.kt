<<<<<<< HEAD
package com.example.sqlitecomroom.data

class UserRepository (private val userDao: UserDao){

    val selectUsers = userDao.selectUser()

    fun addUser(usuario: Usuario) {
        userDao.addUser(usuario)
    }
=======
package com.example.sqlitecomroom.data

class UserRepository (private val userDao: UserDao){

    val selectUsers = userDao.selectUser()

    fun addUser(usuario: Usuario) {
        userDao.addUser(usuario)
    }
>>>>>>> 83aadff4f6f0ddd2dc5d4d36da35f55db27653ce
}