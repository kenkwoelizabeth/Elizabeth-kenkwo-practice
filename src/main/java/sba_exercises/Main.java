package sba_exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String arg[]) {

        try {
//read “sample.txt” file   part 1
            File sampleFile = new File("sample.txt");

            Scanner scanner = new Scanner(sampleFile);
            System.out.println("----------- Testing reading sample.txt -----");
            System.out.printf("%-20s%-20s%-10s%-10s\n", "Name", "Description", "Price", "Quantity");
            while (scanner.hasNextLine()) {
                String file = scanner.nextLine();
                String[] strings = file.split("  ");  // instead of two empty I could use \\s

                System.out.printf("%-20s%-20s%-10.2f%-10d",
                        strings[0], strings[1], Double.parseDouble(strings[2]), Integer.parseInt(strings[3]));
                System.out.println();

            }
            System.out.println();
            scanner.close();
        } catch (FileNotFoundException e) {
        }

// part 2
        Item list = new Item("Milk Shake", "Refreshing", 12.00, 15);

        System.out.println("----------- Testing the constructor of Item class -----");
        System.out.printf("%-20s%-20s%-10s%-10s\n", list.getItemName(),
                list.getItemDescription(), list.getPrice(),
                list.getAvailableQuantity());


        // part 3
        System.out.println("----------- Testing the constructor of MySystem class -----");
        MySystem newSystem = new MySystem();

        newSystem.getItems();

        // part 4
        System.out.println("----------- Testing the addItem(...) method of MySystem class -----");

        System.out.printf("size before adding a new item = %d\n", newSystem.getMyItemsInHashMap().size());

        newSystem.addItem(new Item("Rice", "Fried Rice", 15.00, 7));

        System.out.printf("size after adding a new item = %d\n", newSystem.getMyItemsInHashMap().size());

        newSystem.getItems();

        newSystem.addItem(new Item("pizza", "very cheesy", 12.30, 3));

        System.out.printf("size after adding an existing item = %d\n", newSystem.getMyItemsInHashMap().size());


        //part 5
        System.out.println("----------- Testing the removeItem(...) method of MySystem class -----");


        newSystem.removeItem("salad");
        System.out.printf("size after removing an item = %d\n", newSystem.getMyItemsInHashMap().size());

        newSystem.getItems();

        // part 6
        System.out.println("----------- Testing reduceAvailableQuantity(..) method -----");
        Integer availableQuantity = newSystem.getMyItemsInHashMap().get("Rice").getAvailableQuantity();
        System.out.println("Available quantity for Rice before purchase = " + availableQuantity);
        newSystem.reduceAvailableQuantity("Rice");
        availableQuantity = newSystem.getMyItemsInHashMap().get("Rice").getAvailableQuantity();
        System.out.println("Available quantity for Rice after purchase = " + availableQuantity);

    }
}

