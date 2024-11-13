package practice.array;

import java.util.Objects;

public class MyArrayList <T>{

  private Object[] array;
  private static int DEFAULT_SIZE = 3;
  private int curSize = 0;
  private boolean hasNullItem;

  public MyArrayList() {
    this(DEFAULT_SIZE);
  }

  public MyArrayList(int size) {
    array = new Object[size];
  }

  public void addFirst(T item) {
    if(isFull()) {
      resizeArray(true);
    } else {
      for(int i=curSize-1; i>=0; i--) {
        array[i+1] = array[i];
      }
    }
    array[0] = item;
    this.curSize++;
  }

  public void addLast(T item) {
    add(item);
  }

  public void add(int index, T item) {
    if(index == 0) {
      addFirst(item);
      return;
    }

    if(index == curSize) {
      addLast(item);
      return;
    }

    if(isFull()) {
      resizeArray(false);
    }

    for(int i=curSize-1; i>=index; i--) {
      array[i+1] = array[i];
    }

    array[index] = item;
    this.curSize++;
  }

  public void add(T item) {
    if(isFull()) {
      resizeArray(false);
    }
    array[curSize++] = item;
  }

  public T get(int index) {
    if(index < 0 || index >= curSize) {
      throw new IndexOutOfBoundsException("size:" + curSize);
    }
    return (T) array[index];
  }

  public boolean contains(T item) {

    if(curSize == 0) return false;

    for(int i=0; i<array.length; i++) {

      if(item == null && Objects.isNull(array[i])) {
        return true;
      } else if(item.equals(array[i])) {
        return true;
      }
    }
    return false;
  }

  public int size() {
    return this.curSize;
  }

  public int totalSize() {
    return this.array.length;
  }

  private boolean isFull() {
    return curSize == array.length;
  }

  private void resizeArray(boolean isItemAddedAtStart) {
    Object[] temp = new Object[2*array.length];

    int j = 0;

    if(isItemAddedAtStart) {
      j = 1;
    }

    for(int i=0; i< array.length; i++, j++) {
      temp[j] = array[i];
    }
    array = temp;
  }

  public void print() {
    for(int i=0; i<curSize; i++) {
      System.out.print(array[i]);
      if(i != curSize-1) {
        System.out.print(", ");
      }
    }
    System.out.println();
  }

}
