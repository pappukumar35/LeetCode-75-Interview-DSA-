package Stack;

import java.util.*;

public class AesteroidCollition {
     public int[] AesteroidCollition(int[] aesteroids) {
          Stack<Integer> stack = new Stack<>();
          for (int ast : aesteroids) {
               if (ast > 0) {
                    stack.push(ast);
               } else {
                    while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(ast)) {
                         stack.pop();
                    }
                    if (stack.isEmpty() || stack.peek() < 0) {
                         stack.push(ast);
                    }
                    if (stack.peek() == Math.abs(ast)) {
                         stack.pop();
                    }
               }
          }
          return stack.stream().mapToInt(i -> i).toArray();
     }

     public static void main(String[] args) {

     }
}
