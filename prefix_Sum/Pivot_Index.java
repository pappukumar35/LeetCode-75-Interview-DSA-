package prefix_Sum;

public class Pivot_Index {
     public int pivotIndex(int[] nums) {
          int rsum = 0;
          for (int ele : nums) {
               rsum += ele;
          }
          int lsum = 0;
          for (int i = 0; i < nums.length; i++) {
               rsum -= nums[i];
               if (rsum == lsum) {
                    return i;
               }
               lsum -= nums[i];
          }
          return -1;
     }

     public static void main(String[] args) {

     }
}
