package binary_trees.avl_tree;

public class Main {

  public static void main(String[] args) {
    int[] values = {10, 4,6};
    AVL tree = new AVL();
    tree.populate(values);
    tree.display();
  }
}
