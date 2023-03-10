/*Write a Java program to find the intersection of two sets using HashSet.
 * Write a Java program to find the size of a HashSet.*/
import java.util.*;
public class HashSet9 {
   public static void main(String[]args){
    // creatig a HashSet.
    HashSet<Integer> set = new HashSet<>();
    for(int idx=1;idx<17;idx++){
        set.add(idx);
    }
     // creatig an other HashSet.
     HashSet<Integer> set1 = new HashSet<>();
     for(int idx=5;idx<10;idx++){
         set1.add(idx);
     }
     ArrayList<Integer> arr = new ArrayList<>();
     for(int x:set1){
       if(set.contains(x)){
        arr.add(x);
       }
     }
     for(int x:arr){System.out.print(x+" ");}
     System.out.println();
     /* also we can use retainAll Method to find the iNtersection */
     set.retainAll(set1);
     for(int x:set){System.out.print(x+" ");}
     /* Write a Java program to find the size of a HashSet.*/
     //note after retainAll elements both set have same elements so here the size is same.
     System.out.println();
     System.out.print(set.size());
     System.out.println();
     System.out.println(set1.size());
   } 
}
