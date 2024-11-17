package Stack;

import java.util.Stack;

public class Remove_Stars_String {

     public String removeStars(String s) {
          Stack<Character> stack = new Stack<>();

          for (int i = 0; i < s.length(); i++) {
               if (s.charAt(i) == '*') {
                    if (!stack.isEmpty()) {
                         stack.pop();
                    }
               } else {
                    stack.push(s.charAt(i));
               }
          }

          String result = "";
          while (!stack.isEmpty()) {
               result = stack.pop() + result;
          }
          return result;
     }

     public static void main(String[] args) {
          Remove_Stars_String obj = new Remove_Stars_String();
          String input = "leet**cod*e";
          String result = obj.removeStars(input);
          System.out.println("Result after removing stars: " + result);
     }
}
