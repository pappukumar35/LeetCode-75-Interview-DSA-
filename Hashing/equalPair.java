package Hashing;

import java.util.*;

public class equalPair {
     public int equalPair(int[][] grid) {
          HashMap<String, Integer> map = new HashMap<>();
          int n = grid.length;
          for (int i = 0; i < n; ++i) {
               StringBuilder sb = new StringBuilder();
               for (int j = 0; j < n; ++j) {
                    sb.append('0' + grid[i][j]);
               }
               String s = sb.toString();
               map.put(s, map.getOrDefault(s, 0) + 1);
          }
          int ans = 0;
          for (int i = 0; i < n; ++i) {
               StringBuilder sb = new StringBuilder();
               for (int j = 0; j < n; ++j) {
                    sb.append('0' + grid[j][i]);

               }
               String s = sb.toString();
               ans += map.getOrDefault(s, 0);
          }
          return ans;

     }

     public static void main(String[] args) {

     }
}
