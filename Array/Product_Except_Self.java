package Array;

import java.util.*;

public class Product_Except_Self {
     public int[] productExceptSelf(int[] nums) {
          int n = nums.length;
          int leftproduct[] = new int[n];
          int rightproduct[] = new int[n];
          int result[] = new int[n];

          leftproduct[0] = 1;
          for (int i = 1; i < n; i++) {
               leftproduct[i] = leftproduct[i] * nums[i - 1];
          }
          rightproduct[n - 1] = 1;
          for (int i = n - 2; i >= 0; i--) {
               rightproduct[i] = rightproduct[i] * nums[i + 1];
          }
          for (int i = 0; i < n; i++) {
               result[i] = leftproduct[i] * rightproduct[i];
          }
          return result;
     }

     public static void main(String[] args) {

     }
}
