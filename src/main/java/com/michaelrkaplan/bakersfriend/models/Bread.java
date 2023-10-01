package com.michaelrkaplan.bakersfriend.models;

import java.util.List;

public class Bread {
    private String breadType;
    private List<Ingredient> ingredients;

    public Bread() {
        // Default constructor
    }

    public Bread(String breadType, List<Ingredient> ingredients) {
        this.breadType = breadType;
        this.ingredients = ingredients;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public int getTotalWeight() {
        int totalWeight = 0;
        for (Ingredient ingredient : ingredients) {
            totalWeight += ingredient.getWeightGrams();
        }
        return totalWeight;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "breadType='" + breadType + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
