package Array;

import java.util.*;

public class One_Place_Flower {
     public boolean canPlaceFlower(int[] flowerbed, int n) {
          if (n == 0)
               return true;
          for (int i = 1; i < flowerbed.length; i++) {
               if (flowerbed[i] == 0
                         && (i == 0 || flowerbed[i - 1] == 0 || i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                    flowerbed[i] = 1;
                    n--;
               }
               if (n == 0)
                    return true;
          }
          return false;
     }

     public static void main(String[] args) {

     }
}
