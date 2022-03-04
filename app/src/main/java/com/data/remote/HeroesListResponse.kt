package com.data.remote

import com.google.gson.annotations.SerializedName

data class HeroesListResponse(val items: List<HeroesListItem>) {

}

class HeroesListItem(
    val name: String,

    @SerializedName("realname")
    val realName: String,

    val team: String,

    @SerializedName("firstappearance")
    val firstAppearance: String,

    @SerializedName("createdby")
    val createdBy: String,

    val publisher: String,

    @SerializedName("imageurl")
    val imageUrl: String,

    val bio: String
)