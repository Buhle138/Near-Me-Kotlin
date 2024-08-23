package com.example.nearmeapplication.models.directionPlaceModel


import com.squareup.moshi.Json

data class DirectionPolylineModel(
    @field:Json(name="points")

    var points: String? = null
)