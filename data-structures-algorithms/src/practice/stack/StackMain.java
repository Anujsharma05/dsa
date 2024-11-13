package practice.stack;

import java.util.Stack;

public class StackMain {

  public static void main(String[] args) {
    MyStack ms = new MyStackDynamic(2);
    ms.push(3);
    ms.push(1);
    ms.push(3);
    System.out.println(ms.size());
  }
}
