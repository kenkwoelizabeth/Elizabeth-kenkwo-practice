package class_practice;

public class Phone {
    // Setting the properties of the phone
    private String type;
    private String model;

    //getters and setters
    public void setType(String a) {
        type = a;
    }


    public String getType() {
        return type;
    }


    public void setModel(String n) {
        model = n;
    }

    public String getModel() {
        return model;
    }

    // MAIN METHOD
    public static void main(String[] args) {
        Phone sa = new Phone();
        sa.setType("iphone");
        sa.setModel("Pro Max");
        Phone sa2 = new Phone();
        sa2.setType("Samsung");
        sa2.setModel("S23");
        System.out.println("The name of the phone is " + sa.getType() + " and the model is " + sa.getModel());
        System.out.println("The name of the phone is " + sa2.getType() + " and the model is " + sa2.getModel());

    }
}


