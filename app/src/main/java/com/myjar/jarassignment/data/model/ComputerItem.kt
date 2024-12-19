package com.myjar.jarassignment.data.model

import com.google.gson.annotations.SerializedName

data class ComputerItem(
    val id: String,
    val name: String,
    val data: ItemData? = null
)

data class ItemData(
    val color: String? = null,
    val capacity: String? = null,
    @SerializedName("price") val price: Double? = null,
    @SerializedName("capacityGB") val capacityGB: Int? = null,
    @SerializedName("screenSize") val screenSize: Double? = null,
    @SerializedName("description") val description: String? = null,
    @SerializedName("generation") val generation: String? = null,
    @SerializedName("strapColour") val strapColour: String? = null,
    @SerializedName("caseSize") val caseSize: String? = null,
    @SerializedName("cpuModel") val cpuModel: String? = null,
    @SerializedName("hardDiskSize") val hardDiskSize: String? = null
)
