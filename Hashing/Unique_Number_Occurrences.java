package Hashing;

import java.util.*;

public class Unique_Number_Occurrences {
     public boolean unionOccurence(int[] arr) {
          Map<Integer, Integer> map = new HashMap<>();
          for (int i : arr) {
               map.put(i, map.getOrDefault(i, 0) + 1);
          }
          Set<Integer> set = new HashSet<>(map.values());
          return (set.size() == map.size());
     }

     public static void main(String[] args) {

     }
}
