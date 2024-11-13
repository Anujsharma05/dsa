package stacks_queues.questions;

import java.util.Stack;

/**
 * https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/description/
 */
public class MinimumAddMakeParenthesisValid {

  public static void main(String[] args) {
    String s = "((())";
    int minAdd = minAddToMakeValid(s);
    System.out.println(minAdd);
  }

  public static int minAddToMakeValid(String s) {

    Stack<Character> stack = new Stack<>();

    for(char c: s.toCharArray()) {
      if(isOpeningBracket(c)) {
        stack.push(c);
      } else {
        //closing bracket
        if(!stack.isEmpty() && stack.peek() == '(') {
          stack.pop();
        } else {
          stack.push(c);
        }
      }
    }
    return stack.size();
  }

  public static boolean isOpeningBracket(char c) {
    return c == '(';
  }
}
