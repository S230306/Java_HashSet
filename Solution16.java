/*Write a Java program to find the maximum and minimum value in a HashSet. */
import java.util.*;
public class Solution16 {
    public static void main(String[]args){
        //Creating a Hashset
        HashSet<Integer> set = new HashSet<>();
        for(int idx=0;idx<=10;idx++){
            set.add(idx);
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        //traverse on over the HashMap.
        for(int x:set){
            if(x>max ){max=x;}
            if(x<min){min=x;}
        }
        System.out.print(max+" "+min);
    }
}
