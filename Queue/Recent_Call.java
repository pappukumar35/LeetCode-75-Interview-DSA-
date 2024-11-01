package Queue;

public class Recent_Call {
     class RecentCounter {
          private int[] record;
          private int start;
          private int end;

          public RecentCounter() {
               record = new int[10000]; // Initialize the record array
               start = 0;
               end = 0;
          }

          public int ping(int t) {
               // Correct condition inside while loop
               while (start < end && (t - record[start]) > 3000) {
                    start++;
               }
               record[end++] = t;
               return end - start;
          }
     }

     public static void main(String[] args) {
          RecentCounter counter = new Recent_Call().new RecentCounter();
          System.out.println(counter.ping(1)); // Example test case
          System.out.println(counter.ping(100)); // Example test case
          System.out.println(counter.ping(3001)); // Example test case
          System.out.println(counter.ping(3002)); // Example test case
     }
}
