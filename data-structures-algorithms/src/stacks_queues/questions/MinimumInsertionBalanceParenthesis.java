package stacks_queues.questions;

import java.util.Stack;

public class MinimumInsertionBalanceParenthesis {

  public static void main(String[] args) {
      String s = "(()))(()))()())))";
      int min = minInsertions1(s);
      System.out.println(min);
  }

  public static int minInsertions1(String s) {
    Stack<Character> stack=new Stack<>();
    int count=0;
    for(int i=0;i<s.length();i++){
      char c = s.charAt(i);
      if(c == '('){
        stack.push(c);
      }
      else{
        if(i+1<s.length()&& s.charAt(i+1)==')'){
          i++;
        }
        else {
          count++;
        }

        if(!stack.isEmpty()){
          stack.pop();
        }
        else{
          count++;
        }
      }
    }
    System.out.println(stack);
    count += 2*stack.size();
    return count;
  }

  public static int minInsertions(String s) {
    Stack<String> stack = new Stack<>();

    for(int i=0; i<s.length(); i++) {

      if(s.charAt(i) == '(') {
        stack.push("(");
      } else {

        if(!stack.isEmpty() && "()".equals(stack.peek())) {
          stack.pop();
          continue;
        }

        if(i+1 < s.length() && s.charAt(i+1) == ')') {
          if(!stack.isEmpty() && "(".equals(stack.peek())) {
            stack.pop();

          } else {
            stack.push("))");
          }
          i=i+1;
        } else {
          if(!stack.isEmpty() && "(".equals(stack.peek())) {
            stack.pop();
            stack.push("()");
          } else {
            stack.push(")");
          }
        }
      }
    }

    System.out.println(stack);
    int minInsertion = 0;
    while(!stack.isEmpty()) {
      String top = stack.pop();
      minInsertion = minInsertion + pairPart(top);
    }

    return minInsertion;
  }

  public static int pairPart(String s) {
    int part = switch(s) {
      case "(", ")" -> 2;
      case "()", "))" -> 1;
      default-> 0;
    };
    return part;
  }
}
