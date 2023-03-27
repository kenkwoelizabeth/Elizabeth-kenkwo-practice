package array;

public class Main4 {

    public static void main(String[] args){
    /*Write a program that creates an integer array with 5 elements (i.e., numbers).
The numbers can be any integers. Print out the value at the first index and the
last index using length - 1 as the index. Now try printing the value at index =
length ( e.g., myArray[myArray.length ] ). Notice the type of exception which is
produced. Now try to assign a value to the array index 5. You should get the
same type of exception. */
    int[] work4= {5, 6, 7, 9,12, 17};
        System.out.println(work4[0]); // first index
        System.out.println(work4[work4.length-1]);
        int index =work4[work4.length];
        System.out.println(index);// the exception for 5 elements says Index 5 out of bounds for length 5
// after adding another element the exception says Index 6 out of bounds for length 6
    }

}
