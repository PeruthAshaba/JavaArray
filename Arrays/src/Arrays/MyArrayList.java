package Arrays;
import java.util.*;
//Write a Java program to create an array list, add some colors (strings) and print out the collection

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Maroon");
        colors.add("Black");
        System.out.println(colors);
        //Write a Java program to iterate through all elements in an array list.
        for (String color:colors
             ) {
            System.out.println(color);
        }

        //Write a Java program to insert an element into the array list at the first position.
        colors.add(0,"yellow");
        System.out.println(colors);

        //inserting pink to the first position
        colors.add(0,"pink");
        System.out.println(
                colors
        );

        //Write a Java program to remove an element (at a specified index) from a given array list
        colors.remove(1);
        System.out.println(colors);

        //Write a Java program to retrieve an element (at a specified index) from a given array list
        colors.get(1);
        System.out.println(colors);

        // Write a Java program to update an array element by the given element.
        colors.set(0,"grey");
        System.out.println(colors);

        //Write a Java program to search for an element in an array list
        System.out.println(colors.contains("Red"));
        System.out.println(colors.contains("Purple"));
        //another option
        boolean search = colors.contains("pink");
        System.out.println(search);

        //Write a Java program to sort a given array list.
        Collections.sort(colors);
        System.out.println(colors);

        //Write a Java program to copy one array list into another.
        ArrayList<String> colorcopy = new ArrayList<String>();
        colorcopy.add("A");
        colorcopy.add("B");
        colorcopy.add("C");
        colorcopy.add("D");
        colorcopy.add("E");

        Collections.copy(colors,colorcopy);
            System.out.println(colors);
            System.out.println(colorcopy);


        //Write a Java program to shuffle elements in an array list.
        Collections.shuffle(colors);
        System.out.println(colors);



    }


}
