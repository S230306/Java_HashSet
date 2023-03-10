/*Write a Java program to find the maximum element in a HashSet. */
import java.util.*;
public class Hashset14 {
    public static void main(String[]args){
        //create a Hashset.
        HashSet<Integer> set = new HashSet<>();
        for(int idx=4;idx<=10;idx++){
            set.add(idx);
        }
        int max = Integer.MIN_VALUE;
        for(int x:set){
            if(x>max){
              max=x;
            }
        }
        System.out.print(max);
    }
}

