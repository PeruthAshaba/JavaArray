package Arrays;
import java.util.*;
// Write a Java program to reverse elements in an array list.
public class JavaArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<Integer>();
        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(4);
        numList.add(5);
        Collections.reverse(numList);
        System.out.println(numList);

        //Write a Java program to extract a portion of an array list.
        List<Integer> sub_List = numList.subList(0,4);
        System.out.println(sub_List);





    }


}
