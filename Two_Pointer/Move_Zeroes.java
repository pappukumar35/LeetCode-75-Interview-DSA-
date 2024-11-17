package Two_Pointer;

public class Move_Zeroes {
     public void moveZeroes(int[] nums) {
          int nonZeroInteger = 0;
          for (int i = 0; i < nums.length; i++) {
               if (nums[i] != 0) {
                    nums[nonZeroInteger] = nums[i];
                    nonZeroInteger++;
               }
          }
          for (int i = nonZeroInteger; i < nums.length; i++) {
               nums[i] = 0;

          }
     }

     public static void main(String[] args) {

     }
}
