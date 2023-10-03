package com.example.recipeapp;

public class Recipe {
    //id, recipe name, ingredients, instructions
    int id;
    public int imgId;
    public String name;
    String ingredients;
    String instructions;

    Recipe(int id, int imgId, String name, String ingredients, String instructions) {
        this.id = id;
        this.imgId = imgId;
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }
}
