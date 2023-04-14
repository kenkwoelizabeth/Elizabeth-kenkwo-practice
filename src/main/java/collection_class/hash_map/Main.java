package collection_class.hash_map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    // Write Main class with the main method
    public static void main(String[] args) {
        // Create an empty hash map by declaring object
        // of string and integer type
        Map<String, Item> itemCollection = new HashMap<>();

        //Add 2 key/value pair using Item’s name as key and Item object as value
        Item toyota = new Item("Toyota", "Cool ride for long trips", 50000.0, 30);
        Item tesla = new Item("Tesla", "Luxury electric car", 85000.0, 10);

        itemCollection.put("Toyota", toyota);
        itemCollection.put("Tesla", tesla);

        // Get the size of the Map object
        int size = itemCollection.size();
        System.out.println("The size of the item collection is " + size);

        //Get one of the key/value pair using Item’s name
        Item getTesla = itemCollection.get("Tesla");
        System.out.println(getTesla.getName() + " is a " + getTesla.getDescription()
                + " worth $" + getTesla.getPrice() + " and has an available quantity  of "
                + getTesla.getAvailableQuantity());

        //Remove one of the key/value pair using Item’s name
        itemCollection.remove("Toyota");

        //Get the size of the Map object
        int newSize = itemCollection.size();
        System.out.println("The new size of the item collection is " + newSize);


        //Experimenting an Enhanced loop
        System.out.println("The list of items in my list are as follow:\n-------------------------\n");
        for (Map.Entry<String, Item> entry : itemCollection.entrySet()) {
            System.out.println("Name = " + entry.getValue().getName() + "  \nDescription = "
                    + entry.getValue().getDescription() + "  \nPrice=" + entry.getValue().getPrice()
                    + "\nAvailable Quantity = " + entry.getValue().getAvailableQuantity());
        }

    }
}
