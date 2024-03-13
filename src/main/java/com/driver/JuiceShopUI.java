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
    }

    private static void addJuice(Scanner scanner) {
    	//your code goes here
    }

    private static void displaySummary() {
        S//your code goes here
    }
}

