package practice.array;

import java.util.ArrayList;

public class ArrayListMain {

  public static void main(String[] args) {
    ArrayList<Integer> l = new ArrayList<>(1);

    MyArrayList<Integer> list = new MyArrayList<>(4);

    list.add(null);
    list.add(1, 3);
    System.out.println(list.contains(null));

    list.print();
    System.out.println(list.size());
    System.out.println(list.totalSize());
  }
}
