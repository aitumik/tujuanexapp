package com.aitumik.tujuanexapp.models

data class User(
    val id: Int,
    val username: String,
    val email: String,
    val description: String,
    val followers: Int,
    val following: Int) {

    override fun toString(): String {
        return "User $username"
    }
}

//val user = User(1,'aitumik','aitumik@protonmail.com',"an ass hole')