package com.nikorych.cryptoapp.pojo

import android.media.Rating

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


data class CoinInfo (
    @SerializedName("Id")
    @Expose
    var id: String? = null,

    @SerializedName("Name")
    @Expose
    var name: String? = null,

    @SerializedName("FullName")
    @Expose
    var fullName: String? = null,

    @SerializedName("ImageUrl")
    @Expose
    var imageUrl: String? = null

)