package binary_trees.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://leetcode.com/problems/binary-tree-inorder-traversal/
 * https://leetcode.com/problems/binary-tree-preorder-traversal/
 * https://leetcode.com/problems/binary-tree-postorder-traversal/
 */
public class BTTraversal {

  private TreeNode root;

  private class TreeNode {
    private int val;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int val) {
      this.val = val;
    }
  }

  public void insert(Scanner sc) {
    System.out.println("Insert the root node");
    root = new TreeNode(sc.nextInt());
    insertNode(root, sc);
  }

  private void insertNode(TreeNode node, Scanner sc) {

    System.out.println("Do you want to insert left child of " + node.val);
    boolean hasLeftChild = sc.nextBoolean();

    if(hasLeftChild) {
      System.out.println("Insert left of " + node.val);
      node.left = new TreeNode(sc.nextInt());
      insertNode(node.left, sc);
    }

    System.out.println("Do you want to insert right child of " + node.val);
    boolean hasRightChild = sc.nextBoolean();

    if(hasRightChild) {
      System.out.println("Insert right of " + node.val);
      node.right = new TreeNode(sc.nextInt());
      insertNode(node.right, sc);
    }
  }

  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    inorderTraversal(root, result);
    return result;
  }

  private void inorderTraversal(TreeNode node, List<Integer> result) {
    if(node == null) {
      return;
    }
    inorderTraversal(node.left, result);
    result.add(node.val);
    inorderTraversal(node.right, result);
  }

  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    preorderTraversal(root, result);
    return result;
  }

  private void preorderTraversal(TreeNode node, List<Integer> result) {
    if(node == null) {
      return;
    }
    result.add(node.val);
    preorderTraversal(node.left, result);
    preorderTraversal(node.right, result);
  }

  public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    postorderTraversal(root, result);
    return result;
  }

  private void postorderTraversal(TreeNode node, List<Integer> result) {
    if(node == null) {
      return;
    }
    postorderTraversal(node.left, result);
    postorderTraversal(node.right, result);
    result.add(node.val);
  }

  public static void main(String[] args) {
    BTTraversal btInorderTraversal = new BTTraversal();

    btInorderTraversal.insert(new Scanner(System.in));

    List<Integer> inorder = btInorderTraversal.inorderTraversal(btInorderTraversal.root);
    List<Integer> preorder = btInorderTraversal.preorderTraversal(btInorderTraversal.root);
    List<Integer> postorder = btInorderTraversal.postorderTraversal(btInorderTraversal.root);

    System.out.println("inorder: " + inorder);
    System.out.println("preorder: " + preorder);
    System.out.println("postorder: " + postorder);
  }
}
