package Sliding_Window;

public class Longest_Subarray {
     public int longestSubarry(int[] nums) {
          int start;
          int end;
          int zeroes;
          int max;
          start = end = zeroes = 0;
          max = Integer.MIN_VALUE;
          while (end < nums.length) {
               if (nums[end] == 0)
                    zeroes++;
               end++;
               if (zeroes > 1) {
                    while (nums[start++] != 0) {
                         zeroes--;
                    }
                    max = Math.max(max, end - start);
               }

          }
          return max - 1;
     }

     public static void main(String[] args) {

     }
}
