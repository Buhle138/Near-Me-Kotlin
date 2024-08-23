package com.example.nearmeapplication.models.googlePlaceModel

import com.squareup.moshi.Json

data class GeometryModel(
    @field:Json(name = "location")
    val location: LocationModel?
)