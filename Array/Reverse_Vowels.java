package Array;

import java.util.*;
import java.io.*;

public class Reverse_Vowels {
     public String reverseVowels(String s) {
          Set<Character> set = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
          int i = 0;
          int j = s.length() - 1;
          char[] chars = s.toCharArray();
          while (i < j) {
               while (i < j && !set.contains(chars[i]))
                    i++;
               while (i < j && !set.contains(chars[j]))
                    j--;

               char temp = chars[i];
               chars[i++] = chars[j];
               chars[j--] = temp;
          }
          return new String(chars);
     }

     public static void main(String[] args) {
          Reverse_Vowels rv = new Reverse_Vowels();
          String result = rv.reverseVowels("hello world");
          System.out.println(result); // Expected output: "hollo werld"
     }
}
