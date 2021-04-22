package com.aitumik.tujuanexapp.repositories

import androidx.lifecycle.LiveData
import com.aitumik.tujuanexapp.api.TujuanexAPIService
import com.aitumik.tujuanexapp.models.User
import com.google.gson.Gson
import retrofit2.Retrofit

class UserRepository {
    //create the retrofit builder here
    val retrofit = Retrofit.Builder()
        .baseUrl("http://localhost:5000/")
        .build()

    val service = retrofit.create(TujuanexAPIService::class.java);

    suspend fun createUser(user: User) {
        //use the api to create the user here
    }

    suspend fun getUsers(): List<User>{
        //fetch a list of users here
        var users = service.getUsers();
        return arrayListOf<User>();
    }
}