package com.michaelrkaplan.bakersfriend.controllers;

import com.michaelrkaplan.bakersfriend.models.Bread;
import com.michaelrkaplan.bakersfriend.models.Ingredient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BreadController {

    @GetMapping("/bread-form")
    public String showBreadForm() {
        return "bread-form";
    }

    @PostMapping("/bread-form")
    public String submitBreadForm(@RequestParam("breadType") String breadType,
                                  @RequestParam("ingredientNames") String[] ingredientNames,
                                  @RequestParam("ingredientWeights") int[] ingredientWeights) {
        List<Ingredient> ingredients = new ArrayList<>();

        for (int i = 0; i < ingredientNames.length; i++) {
            Ingredient ingredient = new Ingredient(ingredientNames[i], ingredientWeights[i]);
            ingredients.add(ingredient);
        }

        Bread bread = new Bread(breadType, ingredients);

        // You can do something with the 'bread' object here
        // For example, save it to a database

        return "redirect:/bread-form"; // Redirect back to the form
    }
}


