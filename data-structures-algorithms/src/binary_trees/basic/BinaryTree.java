package binary_trees.basic;

import java.util.Scanner;

public class BinaryTree {

  private class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
      this.value = value;
    }
  }

  private Node root;

  public void populate(Scanner scanner) {

    System.out.println("Enter the root value of tree");
    int value = scanner.nextInt();

    root = new Node(value);

    //populate left and right children
    populate(scanner, root);
  }

  private void populate(Scanner scanner, Node node) {

    System.out.println(String.format("Do you want to add left child for %d: true/false", node.value));
    boolean hasLeft = scanner.nextBoolean();

    if(hasLeft) {
      System.out.println(String.format("Enter the left child for node: %d", node.value));
      int value = scanner.nextInt();

      node.left = new Node(value);

      populate(scanner, node.left);
    }

    System.out.println(String.format("Do you want to add right child for %d: true/false", node.value));
    boolean hasRight = scanner.nextBoolean();

    if(hasRight) {
      System.out.println(String.format("Enter the right child for node: %d", node.value));
      int value = scanner.nextInt();

      node.right = new Node(value);

      populate(scanner, node.right);
    }
  }

  public void display() {
    display(root, "");
  }

  private void display(Node node, String indent) {

    if(node == null) return;

    System.out.println(indent + node.value);

    display(node.left, indent + "\t");
    display(node.right, indent + "\t");
  }

  public void prettyDisplay() {
    prettyDisplay(root, 0);
  }

  private void prettyDisplay(Node node, int level) {
    if(node == null) return;

    prettyDisplay(node.right, level + 1);

    if(level == 0) {
      //root
      System.out.println(node.value);
    } else {
      for(int i=0; i<level-1; i++) {
        System.out.print("|\t\t");
      }
      System.out.println("|--->" + node.value);
    }

    prettyDisplay(node.left, level + 1);
  }
}
