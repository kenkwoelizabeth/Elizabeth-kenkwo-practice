package sba_test2;

import java.util.ArrayList;

public class ArrayToList implements MyList {

    private ArrayList<String> arrayToList;

    public ArrayToList() {

        this.arrayToList = new ArrayList<>();
    }


    @Override
    public void convert(String[] a) {
        for (int i = 0; i < a.length; i++) {
            this.arrayToList.add(a[i]);

            String v = "I have added " + a[i] + " at the index: " + i;
            System.out.println(v);
        }

    }

    @Override
    public void replace(int idx) {
        String element = arrayToList.get(idx);
        this.arrayToList.set(idx, "");
        String s = "I have replaced the String: " + element + " with a null string";
        System.out.println(s);
    }

    @Override
    public ArrayList<String> compact() {
        ArrayList<String> newList = new ArrayList<>();
        for (String string : arrayToList) {
            if (!string.equals("")) {
                newList.add(string);
            }
        }
        return newList;
    }

    public ArrayList<String> getArrayToList() {
        return arrayToList;
    }

    public void setArrayToList(ArrayList<String> arrayToList) {
        this.arrayToList = arrayToList;
    }
}
