package Graph;

import java.util.*;

public class Key_Room {
     public boolean canVisitAllRooms(List<List<Integer>> rooms) {
          Queue<Integer> q = new LinkedList<>();
          q.add(0);
          boolean[] vis = new boolean[rooms.size()];

          while (!q.isEmpty()) {
               int x = q.poll();
               vis[x] = true; // Mark room x as visited

               for (int i : rooms.get(x)) {
                    if (!vis[i]) {
                         q.add(i);
                         vis[i] = true; // Mark room as visited as soon as it's added to the queue
                    }
               }
          }

          for (boolean i : vis) {
               if (!i)
                    return false;
          }
          return true;
     }

     public static void main(String[] args) {
          // Test cases can be added here to check the function.
     }
}
