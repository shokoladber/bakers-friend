package models;

import java.math.BigDecimal;
import java.util.ArrayList;

public abstract class Bread {

    private String breadType;
    private BigDecimal weightInGrams;
    private ArrayList<Ingredient> ingredientList  = new ArrayList<>();

    public void addIngredient(Ingredient ingredient){
        ingredientList.add(ingredient);
    };

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public BigDecimal getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(BigDecimal weightInGrams) {
        this.weightInGrams = weightInGrams;
    }
}
