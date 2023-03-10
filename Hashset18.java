/*Write a Java program to remove duplicates from a HashSet. */
import java.util.*;
public class Hashset18 {
    public static void main(String[]args){
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple");
        set.add("Grapes");
        set.add("Banana");
        System.out.println(set);
    }
}
