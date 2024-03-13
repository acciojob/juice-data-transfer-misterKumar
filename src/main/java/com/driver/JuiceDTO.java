package com.driver;

import java.util.List;

public class JuiceDTO {
    private String name;
    private List<String> ingredients;
    private double price;

    public JuiceDTO(String name, List<String> ingredients, double price) {
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
    }

    public String getName() {
    	//your code goes here
        return name;
    }

    public List<String> getIngredients() {
    	//your code goes here
        return ingredients;
    }

    public double getPrice() {
    	//your code goes here
        return price;
    }
}

