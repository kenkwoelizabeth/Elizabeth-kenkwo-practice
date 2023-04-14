package collection_class.hash_map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Item {

    // Creating Item class with the following fields
    private String name;
    private String description;
    private Double price;
    private Integer availableQuantity;

    public Item(String name, String description, Double price, Integer availableQuantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.availableQuantity = availableQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
    }


}
