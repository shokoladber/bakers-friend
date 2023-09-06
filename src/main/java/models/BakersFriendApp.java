package models;

import java.util.HashMap;
import java.util.Map;

public class BakersFriendApp {
    public static void main(String[] args) {
        // Create an inventory and add ingredients
        Inventory inventory = new Inventory();
        inventory.addToInventory("Flour", 1000.0);
        inventory.addToInventory("Water", 500.0);

        // Create a recipe for a pastry
        Map<String, Double> pastryRecipe = new HashMap<>();
        pastryRecipe.put("Flour", 200.0);
        pastryRecipe.put("Water", 100.0);

        // Create a DoughCalculator for the pastry
        DoughCalculator pastryCalculator = new DoughCalculator(pastryRecipe);

        // Calculate dough needs for 10 pastries
        int numberOfPastries = 10;
        double totalDoughNeeded = pastryCalculator.calculateDoughNeed(inventory, numberOfPastries);

        System.out.println("Total dough needed for " + numberOfPastries + " pastries: " + totalDoughNeeded + " grams");
    }
}
