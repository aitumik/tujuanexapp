package com.aitumik.tujuanexapp.repositories

import androidx.lifecycle.LiveData
import com.aitumik.tujuanexapp.api.TujuanexAPIService
import com.aitumik.tujuanexapp.models.User
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
        var users = service.getUsers();
        return arrayListOf<User>();
    }
}