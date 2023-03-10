/*Write a java program to add all element to another set */
import java.util.*;
public class Solution15 {
    public static void main(String[]args){
        // creating a HashSet.
        HashSet<String> set = new HashSet<>();
        set.add("RED");
        set.add("BLACK");
        set.add("Green");
        set.add("YELLOW");
        // Creating an other set
        HashSet<String> set1 = new HashSet<>();
        set.add("PINK");
        set.add("VOILET");
        set.add("MANGENTA");
        set.add("PURPLE");
        // Adding the element of set to set1.
        set.addAll(set1);
        // traverse on over the set1.
        for(String x:set){System.out.println(x+" ");}
    }
}
