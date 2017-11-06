public class IntList {
    private int[] arr;
    int size = 0;

    public static void main(String[] args) {
        IntList list = new IntList(7);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        for (int i = 0; i < list.size; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        IntList.reverse(list);

        for (int i = 0; i < list.size; i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public IntList(int default_size) {
      arr = new int[default_size];
    }

    int get(int index) {
      return arr[index];
    }

    void set(int index, int element) {
      arr[index] = element;
    }

    void add(int element) {
      arr[size++] = element;
      if(size==arr.length) resize();
    }

    void add(int index, int element) {
      for(int i = size; i>index; i--) {
        arr[i] = arr[i-1];
      }

      arr[index] = element;

      size++;
      if(size==arr.length) resize();

    }

    void remove(int index) {
      for(int i = index; i<size; i++) {
        arr[i] = arr[i+1];
      }

      size--;
    }

    void resize() {

    }

    /*
    sort — sorts a List using a merge sort algorithm, which provides a fast, stable sort. (A stable sort is one that does not reorder equal elements.)
    */
    static void sort(IntList l) {

    }

    /*
    shuffle — randomly permutes the elements in a List.
    */
    static void shuffle(IntList l) {

    }

    /*
    reverse — reverses the order of the elements in a List.
    */
    static void reverse(IntList l) {
        IntList reverse = new IntList(l.size);
        for (int i = 0 ; i <l.size; i++){
            reverse.add(0, l.get(i));
        }
        l.arr = reverse.arr;

    }

    /*
    rotate — rotates all the elements in a List by a specified distance.
    */
    static void rotate(IntList l) {

    }

    /*
    swap — swaps the elements at specified positions in a List.
    */
    static void swap(IntList l, int i, int j) {
        int copyi = l.get(i);
        int copyj = l.get(j);
        l.set(i, copyj);
        l.set(j, copyi);
    }

    /*
    replaceAll — replaces all occurrences of one specified value with another.
    */
    static void replaceAll(IntList l, int rep) {

    }

    /*
    fill — overwrites every element in a List with the specified value.
    */
    static void fill(IntList l, int rep) {

    }

    /*
    copy — copies the source List into the destination List.
    */
    static void copy(IntList l1, IntList l2) {

    }

    /*
    search — searches for an element in an List.
    */
    static boolean search(IntList l, int i) {
        return false;
    }

    /*
    indexOfSubList — returns the index of the first sublist of one List that is equal to another.
    */
    static int indexOfSubList(IntList l, IntList sublist) {
        return 0;
    }

    /*
    lastIndexOfSubList — returns the index of the last sublist of one List that is equal to another.
    */
    static int lastIndexOfSubList(IntList l, IntList sublist) {
        return 0;
    }

    /*
    difference returns a list of all items that are in only one of the two lists (XOR)
    */
    static IntList difference(IntList l1, IntList l2) {
        return null;
    }

		/*
		return a new list with only the odd items
		*/
		static IntList oddList(IntList l) {
			return null;
		}

		/* 
		returns true if all items in i are in list l
		*/
		static boolean search(IntList l, int[] i) {
			return false;
		}

}
