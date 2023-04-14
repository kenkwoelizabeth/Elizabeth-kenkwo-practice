package april_1st_another_solution.my_sub_package;

public class Address {
    private boolean isPrimaryAddress;
    private int streetNumber;
    private String streetName;

    private String city;
    private String state;

    // constructor
    public Address(boolean isPrimaryAddress, int streetNumber, String streetName, String city, String state) {
        this.isPrimaryAddress = isPrimaryAddress;
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
    }


    // setters and getters
    public boolean isPrimaryAddress() {
        return true;
    }

    public void setPrimaryAddress(boolean primaryAddress) {
        isPrimaryAddress = primaryAddress;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


}