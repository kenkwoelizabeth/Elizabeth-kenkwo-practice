package april_1st;

import april_1st.my_sub_package.Address;


public class Customer {
    private CustomerName customerName;
    private String email;
    private Address[] addresses = new Address[]{};
    private Product[] purchasedProducts;


    // constructor for the customer class

    public Customer(String email, Product[] purchasedProducts, CustomerName customerName) {
        this.email = email;
        this.purchasedProducts = purchasedProducts;
        this.customerName = customerName;

    }

    // method to get customer information
    public void getCustomerInfo() {
        System.out.println("Customer Details \n-------------------");
        customerName.getFullName();
        System.out.println("Customer email: " + email);
        System.out.println("Purchased Products: ");
        for (Product purchasedProduct : purchasedProducts) {
            System.out.printf("%s %s\n", purchasedProduct.getProductName(), purchasedProduct.getPrice());
        }
        System.out.println("Customer Addresses: ");
        for (Address address : addresses) {
            if (address.isPrimaryAddress()) {
                System.out.print("*");
            }
            System.out
                    .println(address.getStreetNumber() + " " + address.getStreetName() + ", " +
                            address.getCity() + ", "
                            + address.getState());
        }
    }


    public void addAddress(Address address) {

        Address[] newAddresses = new Address[addresses.length + 1];

        for (int i = 0; i < addresses.length; i++) {
            newAddresses[i] = this.addresses[i];
        }
        newAddresses[addresses.length] = address;
        this.addresses = newAddresses;
    }


// setters and getters for the declared variable


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Product[] getPurchasedProducts() {
        return purchasedProducts;
    }

    public void setPurchasedProducts(Product[] purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }


    public CustomerName getCustomerName() {
        return customerName;
    }

    public void setCustomerName(CustomerName customerName) {
        this.customerName = customerName;
    }


}







