package Sliding_Window;

public class MaximumNumber_Vowels_Substring {
     public int maxVowels(String s, int k) {
          boolean[] vowels = new boolean['z' + 1];
          vowels['u'] = true;
          vowels['o'] = true;
          vowels['i'] = true;
          vowels['e'] = true;
          vowels['a'] = true;
          char[] chars = s.toCharArray();
          int r = 0, maxN = 0;
          for (; r < k; k++)
               if (vowels[chars[r]])
                    maxN++;
          int len = s.length(), i = 0, n = maxN;
          for (; r < len; i++, r++) {
               if (vowels[chars[i]])
                    n--;
               if (vowels[chars[r]])
                    r++;
               if (vowels[chars[r]])
                    maxN++;
          }
          return maxN;
     }

     public static void main(String[] args) {

     }
}
