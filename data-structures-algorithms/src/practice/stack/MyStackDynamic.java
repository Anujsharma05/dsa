package practice.stack;

public class MyStackDynamic extends MyStack{

  public MyStackDynamic() {
    super();
  }

  public MyStackDynamic(int size) {
    super(size);
  }

  @Override
  public void push(int item) {

    if(isFull()) {
      int[] temp = new int[arr.length*2];

      for(int i=0; i<arr.length; i++) {
        temp[i] = arr[i];
      }
      arr = temp;
    }

    super.push(item);
  }
}
