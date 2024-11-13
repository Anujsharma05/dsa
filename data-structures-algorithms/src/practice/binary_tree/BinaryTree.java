package practice.binary_tree;

import java.util.Scanner;

class BT {

  private Node root;

  public void insert() {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter root node value:");
    int value = scanner.nextInt();
    root = new Node(value);

    insert(root, scanner);
  }

  private void insert(Node node, Scanner scanner) {
    System.out.println("Do you want to add left node of " + node.value);
    boolean hasLeft = scanner.nextBoolean();

    if (hasLeft) {
      System.out.println("Enter left node of " + node.value);
      node.left = new Node(scanner.nextInt());
      insert(node.left, scanner);
    }

    System.out.println("Do you want to add right node of " + node.value);
    boolean hasRight = scanner.nextBoolean();

    if (hasRight) {
      System.out.println("Enter right node of " + node.value);
      node.right = new Node(scanner.nextInt());
      insert(node.right, scanner);
    }
  }

  public void display() {
    display(root, "Root Node:");
  }

  private void display(Node node, String details) {

    if (node == null) {
      return;
    }

    System.out.println(String.format("%s: %d ", details, node.value));

    display(node.left, "Left of " + node.value);
    display(node.right, "Right of " + node.value);
  }

  private class Node {

    private int value;
    private Node left;
    private Node right;

    public Node(int value) {
      this.value = value;
    }
  }
}

public class BinaryTree {

  public static void main(String[] args) {
    BT bt = new BT();
    bt.insert();
    bt.display();
  }
}
