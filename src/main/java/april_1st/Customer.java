package april_1st;

import april_1st.my_sub_package.Address;

public class Customer {
    private String customerName;
    private String email;
    private Address[] addresses;
    private Product[] purchasedProducts;
    private int currentAddressIndex = 0;

// setters and getters for the declared variable

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address[] getAddresses() {
        return addresses;
    }

    public void setAddresses(Address[] addresses) {
        this.addresses = addresses;
    }
    // constructor for the customer class

    public Customer(String customerName, String email, Address[] addresses, Product[] purchasedProducts) {
        this.customerName = customerName;
        this.email = email;
        this.purchasedProducts = purchasedProducts;
        this.addresses = addresses;


    }

    // method to get customer information
    public String getCustomerInfo() {
        String result = "Customer Information \n  --------------- \nCustomer Name = " + customerName + "\n"
                + "Customer Email = " + email + "\n" + purchasedProducts[0].getProductName()
                + " = " + purchasedProducts[0].getPrice() + "\n" + purchasedProducts[1].getProductName()
                + " = " + purchasedProducts[1].getPrice();


        return result;

    }

    public void addAddress(Address address) {
     /*   int i=0;
        for (;i< addresses.length;i++) {
            if (addresses[i] == null) {
                break;
            }
        }
            addresses[i] = address;  */

        addresses[currentAddressIndex++] = address;
    }


}


