import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import java.util.Arrays;

public class IntDeque {
  public static void main(String[] args) {
    //ava testing
    IntDeque q = new IntDeque(14);
    q.putFirst(3);
    q.putFirst(4);
    q.putFirst(5);
    q.putFirst(8);
    System.out.println(Arrays.toString(q.q));
    System.out.println(q.getFirst());
   }

  public static void main(String[] args) {
    //Claire's Testing Area:
    IntDeque q = new IntDeque(2);
    q.putLast(1);
    q.putLast(2);
    q.putLast(3);
    q.putLast(4);
    q.putLast(5);
    //cheat print:
    q.print();

  	//Ryo tests:
    q[head] = 9;
    System.out.println(peekFirst());
    

  }


  int[] q;
  int head, tail;

  public IntDeque(int defaultsize) {
    q = new int[defaultsize];
    head=0;
    tail=0;


  }

  /*
  put the first item
  */
  public void putFirst(int item) {
    q[head] = item;
    head--;
    if (head==-1) head = q.length-1;
    //if (head==tail) resize();
  }

  /*
  put the last item
  */
  public void putLast(int item) {
    q[tail] = item;
    tail++;
    if (tail==q.length) tail=0;
    if (tail == head) resize();

  }

  /*
  return the first item
  */
  public int peekFirst() {
    return q[head];
  }

  /*
  return the last item
  */
  public int peekLast() {
    return 0;
  }

  /*
  get the first item
  */
  public int getFirst(){
    return q[++head];
  }

  /*
  get the last item
  */
  public int getLast() { return 0; }

  /*
  move num items from first to last
  */
  public void circ(int num) {

  }

  public void resize() {
    //needs to be done!
    int[] resizedArr = new int[q.length*2];
    int newarr = 0;

    for (int i = head; i < q.length; i++) {
      resizedArr[newarr++] = q[i];
    }
    for (int i = 0; i < tail; i++) {
      resizedArr[newarr++] = q[i];
    }


    //set head and tail:
    tail = newarr;
    head = 0;

    //reassign:
    q=resizedArr;


    print();
  }

  /*
  return a Stack from this deque
  */
  public IntStack toStack() {
    return null;
  }

  /*
  multiply every two items in the queue together,
  such that the array is half the size
  */
  public void multQueue() {

  }

  /*
  return a Deque which includes only every odd item in this queue
  */
  public IntDeque oddQueue() {
    return null;
  }

  /*
  print the Deque to the screen
  */
  public void print() {
    System.out.println(Arrays.toString(q));
    int i = head;
    System.out.print("HEAD > ");
    while(i!=tail) {
      System.out.print(q[i++] + " > " );
      if(i==q.length) i=0;
    }
    System.out.println("TAIL");
  }

    /*
    add an item to the middle
    */
    public void middle(int i) {

    }

    /* 
    put an item on both sides
    */
    public void putBoth(int i) {
        
    }

    /*
    get an item from both sides
    */
    public int[] getBoth() {
        return null;
    }




}
