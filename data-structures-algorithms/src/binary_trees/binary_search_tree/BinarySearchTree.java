package binary_trees.binary_search_tree;

public class BinarySearchTree {

  private class Node {
    private int value;
    private Node left;
    private Node right;
    private int height;

    public Node(int value) {
      this.value = value;
    }
  }

  private Node root;

  public int height(Node node) {
    if(node == null) return -1;

    return node.height;
  }

  public boolean isEmpty() {
    return root == null;
  }

  public void insert(int value) {
//    if(isEmpty()) {
//      root = new Node(value);
//      return;
//    }
    root = insert(root, value);
  }

  public Node insert(Node node, int value) {

    if(node == null) {
      node = new Node(value);
      return node;
    }
      if(value < node.value) {
        node.left = insert(node.left, value);
      } else {
        node.right = insert(node.right, value);
      }

    /**
     * updating height of current node when getting out of recursion call
     * old height + 1
     */
      node.height = Math.max(height(node.left), height(node.right)) + 1;

    return node;
  }

  public boolean balanced() {
    return balanced(root);
  }

  private boolean balanced(Node node) {
    if(node == null) {
      return true;
    }

    /**
     * Initially checking height by root node's children height and then
     * recursively calling left and right to check their children height difference at each level
     */
    return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
  }

  public void populate(int[] values) {
    for(int i: values) {
      insert(i);
    }
  }

  public void populateSorted(int[] values) {
    if(values.length==0) return;
    populateSorted(values, 0, values.length-1);
  }

  private void populateSorted(int[] values, int i , int j) {

    if(i > j) return;

    int mid = i + (j-i)/2;

//    insert(values[mid]);
    System.out.println(values[mid]);

    //call for left part of array
    populateSorted(values, i, mid-1);

    //call for right part of array
    populateSorted(values, mid+1, j);
  }

  public void display() {
    display(root, "Root Node:");
  }

  private void display(Node node, String details) {
    if(node == null) return;

    System.out.println(details + node.value + "(height:" + node.height + ")");

    display(node.left, "Left child of " + node.value + ": ");
    display(node.right, "Right child of " + node.value + ": ");
  }

  public void prettyDisplay() {
    prettyDisplay(root, 0);
  }

  private void prettyDisplay(Node node, int level) {
    if(node == null) return;

    prettyDisplay(node.right, level + 1);

    if(level == 0) {
      //root
      System.out.println(node.value + "(height:"+ node.height + ")");
    } else {
      for(int i=0; i<level-1; i++) {
        System.out.print("|\t\t\t");
      }
      System.out.println("|--->" + node.value + "(height:"+ node.height + ")");
    }

    prettyDisplay(node.left, level + 1);
  }

  /**
   * PreOrder Traversal
   */
  public void preOrder() {
    preOrder(root);
  }

  private void preOrder(Node node) {
    if(node == null) return;

    System.out.print(node.value + ", ");
    preOrder(node.left);
    preOrder(node.right);
  }

  /**
   * InOrder Traversal
   */
  public void inOrder() {
    inOrder(root);
  }

  private void inOrder(Node node) {
    if(node == null) return;

    inOrder(node.left);
    System.out.print(node.value + ", ");
    inOrder(node.right);
  }

  /**
   * PostOrder Traversal
   */
  public void postOrder() {
    postOrder(root);
  }

  private void postOrder(Node node) {
    if(node == null) return;

    postOrder(node.left);
    postOrder(node.right);
    System.out.print(node.value + ", ");
  }
}
