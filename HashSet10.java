/* Write a Java program to find the difference of two sets using HashSet.*/
import java.util.*;
public class HashSet10 {
  public static void main(String[]args){
    /* creating a HashSet*/
    HashSet<Integer> set = new HashSet<>();
    for(int idx=0;idx<=17;idx++){
        set.add(idx);
    }
    /* creating an other HashSet*/
    HashSet<Integer> set2 = new HashSet<>();
    for(int idx=0;idx<=9;idx++){
        set2.add(idx);
    }
    /*Make a copy of Hashmap--> set */
    HashSet<Integer> copy = new HashSet<>(set);
    /*Calculating the differnce b/w the both set */
    copy.removeAll(set2);
    for(int x:copy){System.out.print(x+" ");}
  }  
}
