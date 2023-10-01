package com.michaelrkaplan.bakersfriend.models;

import java.util.List;

public class Bread {
    private String breadType;
    private List<Ingredient> ingredients;

    // Constructors, getters, and setters

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

    @Override
    public String toString() {
        return "Bread{" +
                "breadType='" + breadType + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
