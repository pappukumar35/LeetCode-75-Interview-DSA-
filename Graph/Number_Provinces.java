package Graph;

public class Number_Provinces {
     public static void dfs(int arr[][], int visited[], int i) {
          for (int j = 0; j < arr.length; j++) {
               if (arr[i][j] == 1 && visited[j] == 0) {
                    visited[j] = 1;
                    dfs(arr, visited, j);
               }
          }

     }

     public static int findCircleNum(int arr[][]) {
          int n = arr.length;
          int visited[] = new int[n];
          int ans = 0;
          for (int i = 0; i < arr.length; i++) {
               if (visited[i] == 0) {
                    ans++;
                    dfs(arr, visited, i);
               }
          }
          return ans;

     }

     public static void main(String[] args) {

     }
}