package Array;

import java.util.*;

public class Reverse_Word_in_String {
     public String reverseWord(String s) {
          String arr[] = s.split("\\s+");
          StringBuilder sb = new StringBuilder("");
          for (int i = arr.length - 1; i >= 0; i--) {
               sb.append(arr[i] + " ");
          }
          String ans = sb.toString();
          ans = ans.trim();
          return ans;
     }

     public static void main(String[] args) {

     }
}
