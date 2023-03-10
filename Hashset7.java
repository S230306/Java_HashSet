/*Write a Java program to convert a HashSet to an array.*/
import java.util.*;
public class Hashset7 {
   public static void main(String[]args){
    //Making a HashSet.
    HashSet<Integer> set = new HashSet<>();
    for(int idx=0;idx<10;idx++){
        set.add(idx);
    }
    // iterate over the set.
    for(int x:set){System.out.print(x+" ");}
    // convert the HashSet into the set.
    System.out.println();
    Object[]arr = set.toArray();
    for(Object arrayValue:arr){System.out.print(arrayValue+" ");}
   } 
}
