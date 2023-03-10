//Printing the stUsing Iterator.
import java.util.*;
public class HashSet3 {
    public static void main(String[]args){
    HashSet<Integer> set = new HashSet<>();
    for(int idx=0;idx<=10;idx++){
        set.add(idx*13);
     }
     // using the Iterator to Print The HashSet.
     Iterator value = set.iterator();
     while(value.hasNext()){
        System.out.print(value.next()+" ");
     }
     System.out.println();
      /*  using the LinkedHashSet to Print The HashSet in
      prereserved order*/
     HashSet<Integer> set1 = new LinkedHashSet<>();
    for(int idx=0;idx<=10;idx++){
        set1.add(idx*13);
     }
     // using the Iterator to Print The HashSet 
     Iterator x = set1.iterator();
     while(x.hasNext()){
        System.out.print(x.next()+" ");
     }
     System.out.println();
     //create the object array
     Object[]arr = set1.toArray();
     for(Object c:arr){
        System.out.print(c+" ");
     }
     System.out.println();
     HashSet<String> set2 = new HashSet<>();
     set2.add("Canada");
     set2.add("India");
     set2.add("America");
     set2.add("Astrellia");
     System.out.print(set2);
     System.out.println();
     // using the toString() method.
     System.out.print(set2.toString());
    }
}
