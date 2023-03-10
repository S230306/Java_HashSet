//Write a Java program to clone a HashSet to another HashSet.
import java.util.*;
public class Hashset6 {
  public static void main(String[]args){
    // create a Hashset.
    HashSet<Integer> set = new HashSet<>();
    // add the element in the Hashset through a Loop.
    for(int idx=0;idx<=10;idx++){
        set.add(idx);
    }
     // iterate over the set
     for(int x:set){System.out.print(x+" ");}
     System.out.println();
    // clone a hashset to Another Hashset.
    HashSet<Integer> setclone = new HashSet<>();
    setclone =(HashSet)set.clone();
    //Interate over the setclone.
    for(int s:setclone){System.out.print(s+" ");}
  }  
}
