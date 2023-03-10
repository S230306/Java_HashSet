import java.util.*;
public class Hashset2 {
   public static void main(String[]args){
    //creating an Hashset
    HashSet<String> set =new HashSet<>();
    // Adding the element in the HashSet.
    set.add("India");
    set.add("Canada");
    set.add("Romania");
    set.add("America");
    set.add("Nepal"); 
    // displaying the set
    System.out.print(set);
    System.out.println();
    // add the dublicate Element in the set
    set.add("India");
    // after adding the dublicate value Display the Hashset.
    System.out.print(set); 
    System.out.println();
    // remove an element from the set.
    set.remove("Romania");
    //After remove the element display the element.
    System.out.print(set);
    System.out.println();
    // using the for Each loop.
    for(String x:set){
        System.out.print(x+" ");
     }
     System.out.println();
     set.forEach(value ->{
        System.out.print(value+"  ");
     });
   } 
}
