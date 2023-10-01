package com.michaelrkaplan.bakersfriend.models;

public class Ingredient {
    private String name;
    private int weightGrams;

    // Constructors, getters, and setters

    // Constructors, getters, and setters

    public Ingredient() {
        // Default constructor
    }

    public Ingredient(String name, int weightGrams) {
        this.name = name;
        this.weightGrams = weightGrams;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeightGrams() {
        return weightGrams;
    }

    public void setWeightGrams(int weightGrams) {
        this.weightGrams = weightGrams;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                ", weightGrams=" + weightGrams +
                '}';
    }
}
