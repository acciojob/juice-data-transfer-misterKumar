package com.driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JuiceShopUI {
    private static List<JuiceDTO> juiceList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addJuice(scanner);
                    break;
                case 2:
                    displaySummary();
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void printMenu() {
    	//your code goes here
        System.out.println("\nWelcome to the Juice Shop!");
        System.out.println("1. Add a new juice");
        System.out.println("2. Display summary of all juices");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addJuice(Scanner scanner) {
    	//your code goes here
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter the name of the juice: ");
        String name = scanner.nextLine();
        System.out.print("Enter the ingredients (comma-separated): ");
        String[] ingredientsArray = scanner.nextLine().split(",");
        List<String> ingredients = new ArrayList<>();
        for (String ingredient : ingredientsArray) {
            ingredients.add(ingredient.trim());
        }
        System.out.print("Enter the price: ");
        double price = scanner.nextDouble();

        juiceList.add(new JuiceDTO(name, ingredients, price));
        System.out.println("Juice added successfully!");
    }

    private static void displaySummary() {
        //your code goes here
        System.out.println("\nJuice Details:");
        System.out.printf("%-20s %-30s %-10s\n", "Name", "Ingredients", "Price");
        for (JuiceDTO juice : juiceList) {
            System.out.printf("%-20s %-30s $%.2f\n", juice.getName(), String.join(", ", juice.getIngredients()), juice.getPrice());
        }
    }
}

