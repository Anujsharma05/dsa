package stacks_queues.questions;

import java.util.Stack;

/**
 * https://leetcode.com/problems/valid-parentheses/description/
 */
public class ValidParenthesis {

  public static void main(String[] args) {
    String s = "[]";
    System.out.println(isValid(s));
  }

  public static boolean isValid(String s) {

    Stack<Character> stack = new Stack<>();

    for(char c: s.toCharArray()) {

      if(isOpeningBracket(c)) {
        stack.push(c);
      } else {

        if(stack.isEmpty()) return false;

        char stackTop = stack.peek();
        char closing = findClosingParenthesis(stackTop);

        if(closing != c) {
          return false;
        } else {
          stack.pop();
        }
      }
    }

    if(!stack.isEmpty()) {
      return false;
    }

    return true;
  }

  public static boolean isOpeningBracket(char c) {
    return c == '(' || c == '{' || c == '[';
  }

  public static char findClosingParenthesis(char c) {
    char closingParenthesis = switch(c) {
      case '(' -> ')';
      case '{' -> '}';
      case '[' -> ']';
      default -> '-';
    };

    return closingParenthesis;
  }
}
