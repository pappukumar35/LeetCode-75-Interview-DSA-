package prefix_Sum;

public class Find_the_Highest_Altitude {
     public int largestAltitude(int[] gain) {
          int alt = 0;
          int max = 0;
          for (int val : gain) {
               alt += val;
               max = Math.max(max, alt);
          }
          return max;
     }

     public static void main(String[] args) {

     }
}