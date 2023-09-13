package models;

import java.util.ArrayList;

public class Bread{

    private String breadType;
    private int weightPerItem;
    private int numberOfItems;
    private ArrayList<String> ingredientList  = new ArrayList<>();

    public Bread(String breadType, int weightPerItem, int numberOfItems, ArrayList<String> ingredientList){
      this.breadType = breadType;
      this.weightPerItem = weightPerItem;
      this.numberOfItems = numberOfItems;
      this.ingredientList = ingredientList;
    };

    public int calculateTotalWeight(){
        return this.weightPerItem * this.numberOfItems;
    }

    public void addIngredient(String ingredient){
        ingredientList.add(ingredient);
    };

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public Integer getWeightPerItem() {
        return weightPerItem;
    }

    public void setWeightPerItem(Integer weightPerItem) {
        this.weightPerItem = weightPerItem;
    }

    public void setWeightPerItem(int weightPerItem) {
        this.weightPerItem = weightPerItem;
    }

    public ArrayList<String> getIngredientList() {
        return ingredientList;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }
}
