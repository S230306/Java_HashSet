/*Write a Java program to find the sum of all elements in a HashSet. */
import java.util.*;
public class Hashset17 {
  public static void main(String[]args){
    // making a hashset
    HashSet<Integer> set = new HashSet<>();
    // adding the element in the HashMap through the for loop.
    for(int idx=0;idx<=10;idx++){
        set.add(idx);
    }
    // find the sum of element which are present in HashMap.
    int sum=0;
    for(int x:set){sum+=x;}
    System.out.print(sum);
  }  
}
