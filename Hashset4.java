/*Write a Java program to remove all the elements from a HashSet.*/
import java.util.*;
public class Hashset4 {
    public static void main(String[]args){
        HashSet<Integer> set = new HashSet<>();
        for(int idx =0;idx<=10;idx++){
            set.add(idx);
        }
        //print the element which are present in Set.
        System.out.println(set);
        // Traverse on over the set.
        for(int x:set){
            System.out.print(x+" ");
        }
        System.out.println();
        // remove all the Element Which are Present in the set.
        set.removeAll(set);
        System.out.print(set);
    }
}
