package models;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Double> ingredients;

    public Inventory() {
        ingredients = new HashMap<>();
    }

    public void addToInventory(String ingredient, double gramsAvailable) {
        ingredients.put(ingredient, gramsAvailable);
    }

    public double getAvailableGrams(String ingredient) {
        return ingredients.getOrDefault(ingredient, 0.0);
    }
}

