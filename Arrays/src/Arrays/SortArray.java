package Arrays;

import java.util.Arrays;
public class SortArray {
    public static void main(String[] args){
        int [] myNum ={92, 23, 6, 75};
        String [] names = {"Mum", "Dad", "Ason", "Peruth"};

        Arrays.sort(myNum);
        System.out.println(Arrays.toString(myNum));

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        //sum values of an array
        int sum = 0;
        for (int a:myNum
             ) {
            sum += a;
            System.out.println(sum);
        }

        //averages
         int avg = sum/ myNum.length;
        System.out.println(avg);
    }
}
