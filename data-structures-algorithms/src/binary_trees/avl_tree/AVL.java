package binary_trees.avl_tree;

import java.util.Arrays;

public class AVL {
  
  private Node root;
  
  private class Node {
    private int value;
    private int height;
    private Node left;
    private Node right;
    
    public Node(int value) {
      this.value = value;
    }
  }
  
  public int height(Node node) {
    if(node == null) return -1;
    return node.height;
  }
  
  public void insert(int item) {
    root = insert(root, item);
  }
  
  private Node insert(Node node, int item) {
    if(node == null) {
      return new Node(item);
    }
    
    if(item < node.value) {
      node.left = insert(node.left, item);
    } else {
      node.right = insert(node.right, item);
    }
    
    node.height = Math.max(height(node.left), height(node.right)) + 1;
    
    return rotate(node);
  }

  public Node rotate(Node node) {

    if(height(node.left) - height(node.right) > 1) {
      //left side
      if(height(node.left.left) > height(node.left.right)) {
        //left-left
        return rightRotate(node);
      } else {
        //left-right
        node.left = leftRotate(node.left);
        return rightRotate(node);
      }
    } else if(height(node.left) - height(node.right) < -1) {
      //rigth side
      if(height(node.right.right) > height(node.right.left)) {
        //right-right
        return leftRotate(node);
      } else {
        //right-left
        node.right = rightRotate(node.right);
        return leftRotate(node);
      }
    }
    return node;
  }

  private Node leftRotate(Node p) {
    Node c = p.right;
    Node t = c.left;

    c.left = p;
    p.right = t;

    p.height = Math.max(height(p.left), height(p.right)) + 1;
    c.height = Math.max(height(c.left), height(c.right)) + 1;

    return c;
  }

  private Node rightRotate(Node p) {
    Node c = p.left;
    Node t = c.right;

    c.right = p;
    p.left = t;

    p.height = Math.max(height(p.left), height(p.right)) + 1;
    c.height = Math.max(height(c.left), height(c.right)) + 1;

    return c;
  }
  
  public void populate(int[] values) {
    Arrays.stream(values).forEach(val -> insert(val));
  }
  
  public void display() {
    display(root, "Root Node: ");
  }
  
  private void display(Node node, String details) {
    if(node == null) return;
    System.out.println(details + node.value + "height(" + node.height + ")");
    display(node.left, "left child of " + node.value + "=> ");
    display(node.right, "right child of " + node.value + "=> ");
  }
}
