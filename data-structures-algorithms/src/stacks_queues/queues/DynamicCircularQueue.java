package stacks_queues.queues;

public class DynamicCircularQueue extends CircularQueue{

  public DynamicCircularQueue() {
    super();
  }
  public DynamicCircularQueue(int size) {
    super(size);
  }

  @Override
  public boolean insert(int item) {

    int len = data.length;
    //resize and rearrange
    if(isFull()) {
      int[] temp = new int[len * 2];

      //rearrange
      for(int i=0; i<len; i++) {
        temp[i] = data[(start+i)%len];
      }
      start = 0;
      end = len;
      data = temp;
    }

    return super.insert(item);
  }
}
