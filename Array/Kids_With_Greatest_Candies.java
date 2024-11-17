package Array;

import java.util.*;

public class Kids_With_Greatest_Candies {
     public List<Boolean> Kids_With_Greatest_Candies(int[] candies, int extracandies) {

          List<Boolean> ans = new ArrayList<>();
          int max = candies[0];
          for (int i = 1; i < candies.length; i++) {
               if (candies[i] >= max) {
                    max = candies[i];
               }
          }
          for (int val : candies) {
               ans.add(val + extracandies >= max);
          }
          return ans;
     }

     public static void main(String[] args) {

     }
}
