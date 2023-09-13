package models;

public class Ingredient {

    private String name;
    private int weightInGrams;

    Ingredient(String name, int weightInGrams) {
        this.name = name;
        this.weightInGrams = weightInGrams;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(int weightInGrams) {
        this.weightInGrams = weightInGrams;
    }
}
