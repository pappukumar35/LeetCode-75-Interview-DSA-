package Sliding_Window;

public class Max_Consecutive_Ones {
     public int longestOnes(int[] A, int K) {
          int i = 0, j;
          for (j = 0; j < A.length; ++j) {
               if (A[j] == 0)
                    K--;
               if (K < 0 && A[i++] == 0)
                    K++;
          }
          return j - i;
     }

     public static void main(String[] args) {

     }
}