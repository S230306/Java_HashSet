/*Write a Java program to remove all duplicates from an ArrayList using a HashSet. */
import java.util.*;
public class Hashset12 {
    public static void main(String[]args){
        // Making a ArrayList
        ArrayList<Integer> arr = new ArrayList<>();
        for(int idx=0;idx<=10;idx++){
            arr.add(idx);
        }
        /*again add some dublicate element in the ArrayList class*/
        for(int idx=5;idx<=18;idx++){
            arr.add(idx);
        }
        // print the arrayList 
        for(int x:arr){System.out.print(x+" ");}
        System.out.println();
        // Making a HashSet.
        HashSet<Integer> set2 = new HashSet<>();
        for(int d:arr){set2.add(d);}
        // traverse on over the Hashset.
        for(int dubli:set2){System.out.print(dubli+" ");}
    }
}
