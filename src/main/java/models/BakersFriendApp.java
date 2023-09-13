package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BakersFriendApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> ingredientList = new ArrayList<String>();


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


        System.out.print("Enter a type of bread: ");
        String typeOfBread = scanner.nextLine();

        System.out.print("Enter weight in grams per item: ");
        int weightPerItem = scanner.nextInt();

        System.out.print("Enter number of items needed: ");
        int numberOfItems = scanner.nextInt();

        Bread bread = new Bread(typeOfBread, weightPerItem, numberOfItems, ingredientList);

        String ingredient;
        do {
            System.out.print("Enter ingredients: ");
            ingredient = scanner.nextLine();
            bread.addIngredient(ingredient);
        } while(ingredient != "");


            System.out.println("Total dough needed for " + bread.getBreadType() + " is " + bread.calculateTotalWeight());

    }
}
