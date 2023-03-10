import java.util.*;
public class Hashset11 {
  public static void main(String[] args) {
    /* creating a HashSet */
    HashSet<Integer> set = new HashSet<>();
    for (int idx = 0; idx <= 17; idx++) {
      set.add(idx);
    }
    /* creating another HashSet */
    HashSet<Integer> set2 = new HashSet<>();
    for (int idx = 0; idx <= 9; idx++) {
      set2.add(idx);
    }
    /* creating a copy of set */
    HashSet<Integer> copy = new HashSet<>(set);
    /* calculating the symmetric difference */
    copy.addAll(set2); // combine the two sets
    HashSet<Integer> intersection = new HashSet<>(set); // make a copy of set
    intersection.retainAll(set2); // find the intersection of the two sets
    copy.removeAll(intersection); // remove the elements that are common to both sets
    for (int x : copy) {
      System.out.print(x + " ");
    }
  }
}
