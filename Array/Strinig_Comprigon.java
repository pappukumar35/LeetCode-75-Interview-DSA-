package Array;

import java.util.*;

public class Strinig_Comprigon {
     public int comprison(char[] chars) {
          int count = 1;
          StringBuilder sb = new StringBuilder();
          sb.append(chars[0]);
          for (int i = 0; i < chars.length; i++) {
               if (chars[i - 1] != chars[i]) {
                    if (count > 1) {
                         sb.append(count);
                    }
                    sb.append(chars[i]);
                    count = 1;
               } else {
                    count++;
               }
          }
          if (count > 1) {
               sb.append(count);
          }
          for (int i = 0; i < sb.length(); i++) {
               chars[i] = sb.charAt(i);
          }
          return sb.length();
     }

     public static void main(String[] args) {

     }
}
