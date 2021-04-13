package com.example.jetpackcomposemvvm.domain.model

import kotlinx.android.parcel.Parcelize

@Parcelize
data class Recipe(
    val id: Int? = 0,
    val title: String? = null,
    val publisher: String? = null,
    val featuredImage: String? = null,
    val imageUrl: String? = null,
    val rating: Int? = 0,
    val sourceUrl: String? = null,
    val description: String? = null,
    val cookingInstructions: String? = null,
    val ingredients: List<String>? = listOf(),
    val dateAdded: String? = null,
    val dateUpdated: String? = null
)