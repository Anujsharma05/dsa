package stacks_queues.stacks;

public class StackMain {

  public static void main(String[] args) {
    CustomStack stack = new CustomStack(3);
    stack.push(10);
    stack.push(20);
    stack.push(30);
//    System.out.println(stack.pop());
//    System.out.println(stack.pop());

    CustomStack dynamicStack = new DynamicCustomStack(2);
    dynamicStack.push(1);
    dynamicStack.push(2);
    dynamicStack.push(3);

    System.out.println(dynamicStack.peek());
  }
}
