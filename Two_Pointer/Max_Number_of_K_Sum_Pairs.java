package Two_Pointer;

import java.util.Arrays;

public class Max_Number_of_K_Sum_Pairs {
     public int maxOperations(int nums[], int k) {
          Arrays.sort(nums);
          int start = 0;
          int end = nums.length - 1;
          int count = 0;

          while (start < end) {
               if (nums[start] + nums[end] == k) {
                    start++;
                    end--;
                    count++;
               } else if (nums[start] + nums[end] < k) {
                    start++;
               } else if (nums[start] + nums[end] > k) {
                    end--;
               }
          }
          return count;
     }

     public static void main(String[] args) {

     }
}
