/*Write a Java program to find the minimum element in a HashSet. */
import java.util.*;
public class Hashset13 {
    public static void main(String[]args){
        //create a Hashset.
        HashSet<Integer> set = new HashSet<>();
        for(int idx=4;idx<=10;idx++){
            set.add(idx);
        }
        int min = Integer.MAX_VALUE;
        for(int x:set){
            if(x<min){
              min=x;
            }
        }
        System.out.print(min);
    }
}
