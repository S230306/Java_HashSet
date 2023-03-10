// implementation of Hashset.
import java.util.*;
class Hashset1{
    public static void main(String[]args){
        // initialize an object of hashset.
        HashSet<ArrayList> set = new HashSet<>();
        // creating an ArrayList.
        ArrayList<Integer> arr1 = new ArrayList<>();
        // creation one another arrayList.
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr1.add(12);
        arr1.add(14);
        arr1.add(12);
        arr2.add(15);
        arr2.add(14);
        // Adding the Element on the ArrayList.
        set.add(arr1);
        set.add(arr2);
        System.out.println(set);
        System.out.println(set.size());
    }
}