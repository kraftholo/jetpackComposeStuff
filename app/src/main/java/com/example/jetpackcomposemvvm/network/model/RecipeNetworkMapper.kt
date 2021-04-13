package com.example.jetpackcomposemvvm.network.model

import com.example.jetpackcomposemvvm.domain.model.Recipe
import com.example.jetpackcomposemvvm.domain.util.EntityMapper

//RecipeNetworkEntity --> Mapper --> Recipe (vice versa)

class RecipeNetworkMapper : EntityMapper<Recipe, RecipeNetworkEntity> {
    override fun mapToEntity(domainModel: RecipeNetworkEntity): Recipe {
        return Recipe(
            id = domainModel.primaryKey,
            title = domainModel.title,
            publisher = domainModel.publisher,
            featuredImage = domainModel.featuredImage,
            imageUrl = domainModel.sourceUrl,
            rating = domainModel.rating,
            cookingInstructions = domainModel.cookingInstructions,
            ingredients = domainModel.ingredients,
            dateAdded = domainModel.dateAdded,
            dateUpdated = domainModel.dateUpdated
        )
    }

    override fun mapFromEntity(entity: Recipe): RecipeNetworkEntity {
        return RecipeNetworkEntity(
            primaryKey = entity.id,
            title = entity.title,
            publisher = entity.publisher,
            featuredImage = entity.featuredImage,
            sourceUrl = entity.imageUrl,
            rating = entity.rating,
            cookingInstructions = entity.cookingInstructions,
            ingredients = entity.ingredients,
            dateAdded = entity.dateAdded,
            dateUpdated = entity.dateUpdated
        )
    }

}