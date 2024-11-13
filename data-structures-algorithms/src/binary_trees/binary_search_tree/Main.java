package binary_trees.binary_search_tree;

public class Main {

  public static void main(String[] args) {
    BinarySearchTree tree = new BinarySearchTree();

    int[] values = {15, 10, 8, 12, 9, 20, 17};
    tree.populate(values);

//    tree.preOrder();
//    System.out.println();
//    tree.inOrder();
//    System.out.println();
//    tree.postOrder();

//    int[] values = {1,2,3,4,5,6,7,8,9,10};
//    tree.populateSorted(values);

    tree.display();

//    System.out.println("Is tree balanced: " + tree.balanced());

  }
}
