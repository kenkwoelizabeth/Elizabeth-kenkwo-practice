package collection_class.array_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String arg[]) {
        // Declaring ArrayList
        ArrayList sa = new ArrayList();// can store duplicate element and any type of data type
        //ArrayList<String> sa= new ArrayList<String>(); // for only String elements
        //  ArrayList<Integer> sa= new ArrayList<Integer>(); // for only integer elements

        // List sa=new ArrayList(); // List is a universal collection, a parent to arraylist


        // Adding to an arraylist
        sa.add("Welcome");
        sa.add(100);
        sa.add(true);
        sa.add('a');
        System.out.println(sa);  //[ Welcome, 100, true, a]
        // to get the size
        System.out.println(sa.size());
        // to remove
        System.out.println(sa.remove(2));// to remove the element in the index 2
        System.out.println(sa);

        // to add an element and detect the index
        sa.add(3, "love");
        System.out.println(sa);

        // to get an element from the array
        System.out.println(sa.get(2));

        // to replace element
        sa.set(1, 500);
        System.out.println(sa);

        // to search
        System.out.println(sa.contains(500)); //true

        // is Empty
        System.out.println(sa.isEmpty());// false

        // for loop
        for (int i = 0; i < sa.size(); i++) {
            System.out.println(sa.get(i));
        }
//enhanced for loop
        for (Object e : sa) {
            System.out.println(e);

        }
        // iterator
        Iterator list = sa.iterator();
        while (list.hasNext()) {
            System.out.println(list.next());
        }

    }
}
