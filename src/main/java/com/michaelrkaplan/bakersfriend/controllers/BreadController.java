package com.michaelrkaplan.bakersfriend.controllers;

import com.michaelrkaplan.bakersfriend.models.Bread;
import com.michaelrkaplan.bakersfriend.models.Ingredient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BreadController {

    private List<Bread> breads = new ArrayList<>();

    @GetMapping("/bread-create")
    public String showBreadForm() {
        return "bread-create";
    }

    @PostMapping("/bread-create")
    public String submitBreadForm(@RequestParam("breadType") String breadType,
                                  @RequestParam("ingredientNames") String[] ingredientNames,
                                  @RequestParam("ingredientWeights") int[] ingredientWeights) {
        List<Ingredient> ingredients = new ArrayList<>();

        for (int i = 0; i < ingredientNames.length; i++) {
            Ingredient ingredient = new Ingredient(ingredientNames[i], ingredientWeights[i]);
            ingredients.add(ingredient);
        }

        Bread bread = new Bread(breadType, ingredients);
        breads.add(bread); // Add bread to the list

        return "redirect:/bread-list";
    }

    @GetMapping("/bread-list")
    public String showBreadList(Model model) {
        model.addAttribute("breads", breads);
        return "bread-list";
    }
}


