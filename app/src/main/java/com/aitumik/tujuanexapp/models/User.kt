package com.aitumik.tujuanexapp.models

data class User(val id: Int,val username: String, val email: String) {

    override fun toString(): String {
        return "User $username"
    }
}