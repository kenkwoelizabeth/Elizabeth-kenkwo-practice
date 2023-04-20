package sba_core_java.exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] myStringArrayTestValue = {"life", "is", "worth", "living", "with", "passion"};
        MyOperation myOperation = new MyOperation();
        myOperation.convertStringArrayIntoArrayList(myStringArrayTestValue);
        System.out.println(myOperation.getMyArrayList().toString());


        //Call “createANewArrayListFromExistingArray()” method with index value of 1
        myOperation.replaceAnElementInTheStringArrayListGiven(4);

        //Print out the “myArrayList” and verify the 2nd String object (index of 1) is now changed to “Nah”
        System.out.println(myOperation.getMyArrayList().toString());


        //Call “createANewArrayListFromExistingArray()” method
        ArrayList<String> list = myOperation.createANewArrayListFromExistingArray();
        System.out.println(list.toString());


        //
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);

        try {
            if (scanner.hasNextInt()) {
                Integer newInt = scanner.nextInt();
                System.out.println(newInt);
            } else {
                throw new MyOwnException("Invalid integer");
            }
        } catch (MyOwnException e) {
            System.out.println(e.getMessage());
        }

    }
}


