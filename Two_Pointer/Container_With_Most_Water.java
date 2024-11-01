package Two_Pointer;

public class Container_With_Most_Water {
     public int maxArea(int[] height) {
          int maxArea = 0;
          int left = 0;
          int right = height.length - 1;

          while (left < right) {
               maxArea = Math.max(maxArea, (right - left) * Math.min(height[left], height[right]));

               if (height[left] < height[right]) {
                    left++;
               } else {
                    right--;
               }
          }

          return maxArea;
     }

     public static void main(String[] args) {

     }
}
