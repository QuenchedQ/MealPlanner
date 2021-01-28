package com.example.mealplanningapp.Model;

public class Recipes {
    public int id;
    public String name, ingredients, nutrition, difficulty, method;


    public Recipes(int id, String name, String ingredients, String nutrition, String difficulty, String method) {
        this.id = id;
        this.name = name;
        this.ingredients = ingredients;
        this.nutrition = nutrition;
        this.difficulty = difficulty;
        this.method = method;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getNutrition() {
        return nutrition;
    }

    public void setNutrition(String nutrition) {
        this.nutrition = nutrition;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Recipes() {


    }
}
