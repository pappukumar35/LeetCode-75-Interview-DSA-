package Graph;

import java.util.*;

public class Record_city {
     public int minReorder(int n, int[][] connections) {
          List<List<Integer>> adj = new ArrayList<>();
          for (int i = 0; i < n; i++) {
               adj.add(new ArrayList<>());
          }
          for (int arr[] : connections) {
               int src = arr[0];
               int des = arr[1];
               adj.get(src).add(des);
               adj.get(des).add(-src);
          }
          return dfs(adj, new boolean[n], 0);
     }

     // dfs
     public int dfs(List<List<Integer>> adj, boolean[] visited, int src) {
          int change = 0;
          visited[src] = true;
          for (int node : adj.get(src)) {
               if (!visited[Math.abs(node)]) {
                    change += (node > 0 ? 1 : 0);
                    change += dfs(adj, visited, Math.abs(node));
               }
          }
          return change;
     }

     public static void main(String[] args) {

     }
}
