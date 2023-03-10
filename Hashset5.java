/*Write a Java program to check if a HashSet is empty.*/
import java.util.*;
public class Hashset5 {
    public static void checkHashset(int[]arr){
        // creating a HashSet.
        HashSet<Integer> set = new HashSet<>();
        // iterate over on the array.
        for(int idx=0;idx<arr.length;idx++){
            set.add(arr[idx]);
        }
        // print the set.
        for(int x:set)System.out.print(x+" ");
        // check the set is Empty or not.
        System.out.println();
        for(int x:set){
            System.out.print(set.isEmpty()?true:false);
            return;
        }
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        //set the element in a Hahmap through the array.
        int[]arr= new int[n];
        for(int idx=0;idx<arr.length;idx++){
            arr[idx]=scn.nextInt();
        }
        checkHashset(arr); 
    }
}
