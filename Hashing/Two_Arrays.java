package Hashing;

import java.util.*;

public class Two_Arrays {
     public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
          List<List<Integer>> list = new ArrayList<>();
          List<Integer> l1 = new ArrayList<>();
          List<Integer> l2 = new ArrayList<>();
          Set<Integer> s1 = new HashSet<>();
          Set<Integer> s2 = new HashSet<>();
          for (int c : nums1) {
               s1.add(c);
          }
          for (int c : nums2) {
               s2.add(c);
          }
          for (int ele : s1)
               if (!s2.contains(ele)) {
                    l1.add(ele);
               }
          for (int ele : s2)
               if (!s1.contains(ele)) {
                    l2.add(ele);
               }
          list.add(l1);
          list.add(l2);
          return list;
     }

     public static void main(String[] args) {

     }
}
