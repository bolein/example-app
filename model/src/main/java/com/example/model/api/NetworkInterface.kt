package com.example.model.api

import com.example.model.data.AccessToken
import com.example.model.data.Repository
import com.example.model.data.User
import com.example.model.data.WeatherResponse
import retrofit2.Call
import retrofit2.http.*

internal interface NetworkInterface {

    @GET("weather")
    suspend fun getWeatherForQuery(@Query("q") query: String): WeatherResponse

    @Headers("Accept: application/json")
    @POST
    suspend fun getAccessToken(@Url url: String,
                       @Query("client_id") clientId: String,
                       @Query("client_secret") clientSecret: String,
                       @Query("code") code: String) : AccessToken

    @GET("/user")
    suspend fun getCurrentUser(): User

    @GET("/users/{username}/followers")
    suspend fun getFollowers(@Path("username") username: String): List<User>

    @GET("/users/{username}/following")
    suspend fun getFollowing(@Path("username") username: String): List<User>

    @GET("/users/{id}/repos")
    suspend fun getUserRepositories(@Path("id") username: String): List<Repository>

}
