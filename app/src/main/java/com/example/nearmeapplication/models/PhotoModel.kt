package com.example.nearmeapplication.models

import com.squareup.moshi.Json
import android.widget.ImageView
import com.bumptech.glide.Glide
import androidx.databinding.BindingAdapter
data class PhotoModel(
    @field:Json(name = "height")

    val height: Int?,

    @field:Json(name = "html_attributions")

    val htmlAttributions: List<String>?,

    @field:Json(name = "photo_reference")

    val photoReference: String?,

    @field:Json(name = "width")

    val width: Int?
) {
    companion object {

        @JvmStatic
        @BindingAdapter("loadImage")
        fun loadImage(view: ImageView, image: String?) {
            Glide.with(view.context).load(image).into(view)
        }
    }
}