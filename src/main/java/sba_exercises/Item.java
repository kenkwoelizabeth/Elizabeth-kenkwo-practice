package sba_exercises;

public class Item {
    private String itemName;
    private String itemDescription;
    private Double price;
    private Integer quantity;
    private Integer availableQuantity;

    public Item(String itemName, String itemDescription, Double price, Integer availableQuantity) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.price = price;
        this.availableQuantity = availableQuantity;
    }

    // default Constructor
    public Item() {
        this.quantity = 1;
    }


    // getters and setters
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
    }
}
