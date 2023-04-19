package sba_exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MySystem {
    Map<String, Item> myItemsInHashMap;


    // Constructor
    public MySystem(Map<String, Item> myItemsInHashMap) {
        this.myItemsInHashMap = myItemsInHashMap;
    }

    // default constructor
    public MySystem() {
        this.myItemsInHashMap = new HashMap<>();
        try {
            Scanner scan = new Scanner(new File("sample.txt"));
            while (scan.hasNextLine()) {
                String[] data = scan.nextLine().split("  ");

                // modifying the data to march the data type
                Item type = new Item(data[0], data[1], Double.parseDouble(data[2]), Integer.parseInt(data[3]));
                myItemsInHashMap.put(data[0], type);
            }
        } catch (FileNotFoundException e) {
        }
    }

    public void getItems() {
        for (String items : myItemsInHashMap.keySet()) {
            Item itemList = myItemsInHashMap.get(items);
            System.out.printf("%-20s%-20s%-10.2f%-10d\n", itemList.getItemName(),
                    itemList.getItemDescription(),
                    itemList.getPrice(), itemList.getAvailableQuantity());
        }
        System.out.println();
    }


    public Item addItem(Item item) {
        if (!myItemsInHashMap.containsKey(item.getItemName())) {
            myItemsInHashMap.put(item.getItemName(), item);
            return item;
        }
        return null;
    }

    public Item removeItem(String itemName) {
        if (myItemsInHashMap.containsKey(itemName)) {
            myItemsInHashMap.remove(itemName);
            return myItemsInHashMap.get(itemName);
        }
        return null;
    }


    public Item reduceAvailableQuantity(String itemName) {
        if (myItemsInHashMap.containsKey(itemName)) {
            Item items = myItemsInHashMap.get(itemName);
            items.setAvailableQuantity(items.getAvailableQuantity() - 1);
            if (items.getAvailableQuantity() == 0) {
                myItemsInHashMap.remove(itemName);
            }
            return items;
        } else {
            return null;
        }
    }


    // getters and setters
    public Map<String, Item> getMyItemsInHashMap() {
        return myItemsInHashMap;
    }

    public void setMyItemsInHashMap(Map<String, Item> myItemsInHashMap) {
        this.myItemsInHashMap = myItemsInHashMap;
    }
}
