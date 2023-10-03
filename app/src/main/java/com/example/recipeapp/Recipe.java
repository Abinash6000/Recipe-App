package com.example.recipeapp;

public class Recipe {
    //id, recipe name, ingredients, instructions
    int id;
    String name;
    String ingredients;
    String instructions;

    Recipe(int id, String name, String ingredients, String instructions) {
        this.id = id;
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }
}
