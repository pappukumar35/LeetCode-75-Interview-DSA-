package Hashing;

import java.util.*;

public class closeStrings {
     public boolean closeStrings(String word1, String word2) {
          if (word1.length() != word2.length())
               return false;

          int[] f1 = new int[26];
          int[] f2 = new int[26];
          for (int c : word1.toCharArray()) {
               f1[c - 'a']++;
          }
          for (int c : word2.toCharArray()) {
               if (f1[c - 'a'] == 0)
                    return false;
               f2[c - 'a']++;
          }
          Arrays.sort(f1);
          Arrays.sort(f2);
          return Arrays.equals(f1, f2);

     }

     public static void main(String[] args) {

     }
}
