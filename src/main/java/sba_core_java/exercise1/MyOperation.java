package sba_core_java.exercise1;

import java.util.ArrayList;
import java.util.Iterator;

public class MyOperation implements IMyOperations {
    //fields
    private ArrayList<String> myArrayList;

    // Constructor
    //Use a default constructor to initialize the myArrayList
    public MyOperation() {
        this.myArrayList = new ArrayList<>();
    }


    //method so that it adds each String objects of the passed String array to the “myArrayList”
    //In the “main” method,
    @Override
    public void convertStringArrayIntoArrayList(String[] stringArray) {
        for (String e : stringArray) {
            this.myArrayList.add(e);
        }
    }

    //Write code in the “createANewArrayListFromExistingArray()” method so that  it removes any String “Nah”
    // from the “myArrayList” and return a new ArrayList object without “Nah”
    @Override
    public void replaceAnElementInTheStringArrayListGiven(int index) {
        this.myArrayList.set(index, "Nah");
    }


    //Write code in the “createANewArrayListFromExistingArray()” method so that  it removes any String “Nah”
    // from the “myArrayList” and return a new ArrayList object without “Nah”
    @Override
    public ArrayList<String> createANewArrayListFromExistingArray() {
        Iterator<String> list = this.myArrayList.iterator();
        while (list.hasNext()) {
            String element = list.next();
            if (element == "Nah") {
                list.remove();
            }
        }
        return this.myArrayList;
    }


    public ArrayList<String> getMyArrayList() {
        return myArrayList;
    }

    public void setMyArrayList(ArrayList<String> myArrayList) {
        this.myArrayList = myArrayList;
    }
}
