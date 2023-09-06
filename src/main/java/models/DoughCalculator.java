package models;

import java.util.Map;

public class DoughCalculator {
    private Map<String, Double> recipe;

    public DoughCalculator(Map<String, Double> recipe) {
        this.recipe = recipe;
    }

    public double calculateDoughNeed(Inventory inventory, int numberOfPastries) {
        double totalDoughNeeded = 0.0;

        for (Map.Entry<String, Double> entry : recipe.entrySet()) {
            String ingredient = entry.getKey();
            double gramsPerPastry = entry.getValue();

            double availableGrams = inventory.getAvailableGrams(ingredient);
            double doughNeeded = gramsPerPastry * numberOfPastries;

            if (availableGrams >= doughNeeded) {
                totalDoughNeeded += doughNeeded;
            } else {
                totalDoughNeeded += availableGrams;
            }
        }

        return totalDoughNeeded;
    }
}

