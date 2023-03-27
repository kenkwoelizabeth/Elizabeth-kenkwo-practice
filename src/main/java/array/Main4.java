package array;

public class Main4 {

    public static void main(String[] args){
    /*Write a program that creates an integer array with 5 elements (i.e., numbers).
The numbers can be any integers. Print out the value at the first index and the
last index using length - 1 as the index. Now try printing the value at index =
length ( e.g., myArray[myArray.length ] ). Notice the type of exception which is
produced. Now try to assign a value to the array index 5. You should get the
same type of exception. */
    int[] work4= {5, 6, 7, 9,12};
        System.out.println(work4[0]); // first index
        System.out.println(work4.length-1);
}

}
