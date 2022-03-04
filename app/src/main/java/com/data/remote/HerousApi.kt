package com.data.remote

import com.data.remote.HeroesListResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Headers

interface HeroesApi {
    @GET("./demos/marvel")
    @Headers("Content-Type: application/json")
    fun getHeroesList(): Single<HeroesListResponse>
}