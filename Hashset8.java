/*Write a Java program to compare two HashSets for equality. */
import java.util.*;
public class Hashset8 {
  public static void main(String[]args){
    // creating a hashSet.
    HashSet<Integer>set = new HashSet<>();
    for(int idx=0;idx<=10;idx++){
        set.add(idx);
    }
    // creating a another hashSet.
    HashSet<Integer>set1 = new HashSet<>();
    for(int idx=0;idx<=10;idx++){
        set1.add(idx);
    }
    // campare both Hashset for equality.
    System.out.print(set.equals(set1));
  } 
}  

