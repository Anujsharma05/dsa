package practice.binary_tree;

class BST {

  private Node root;

  private class Node {
    private int value;
    private Node left;
    private Node right;
    private int height;

    public Node(int value) {
      this.value = value;
    }
  }

  public int height(Node node) {
    return node == null ? -1 : node.height;
  }

  public void populate(int[] values) {
    for(int val: values) {
      insert(val);
    }
  }

  public void insert(int value) {
    root = insert(root, value);
  }

  private Node insert(Node node, int value) {
    if(node == null) {
      return new Node(value);
    }

    if(value < node.value) {
      node.left = insert(node.left, value);
    } else {
      node.right = insert(node.right, value);
    }

    node.height = Math.max(height(node.left), height(node.right)) + 1;

    return node;
  }

  public boolean balanced() {
    return balanced(root);
  }

  private boolean balanced(Node node) {

    if(node == null) return true;

    return Math.abs(height(node.left) - height(node.right)) <= 1
        && balanced(node.left)
        && balanced(node.right);
  }

  public void display() {
    display(root, "Root Node:");
  }

  private void display(Node node, String details) {

    if(node == null) {
      return;
    }

    System.out.println(String.format("%s:%d with height:%d",details, node.value, node.height));

    display(node.left, "Left of " + node.value);
    display(node.right, "Right of " + node.value);
  }

  public void preOrder() {
    preOrder(root);
  }

  private void preOrder(Node node) {
    if(node == null) return;
    preOrder(node.left);
    preOrder(node.right);
    System.out.print(node.value + ",");
  }
}

public class BinarySearchTree {

  public static void main(String[] args) {
    BST bst = new BST();

    int[] values = {15, 10, 8, 12, 9, 20, 17};
    bst.populate(values);
    bst.preOrder();
  }
}
