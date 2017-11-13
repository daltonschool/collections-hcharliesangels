//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class IntList {
//    private int[] arr;
//    int size = 0;
//
//    public IntList(int default_size) {
//        arr = new int[default_size];
//    }
//
//    int get(int index) {
//        return arr[index];
//    }
//
//    void set(int index, int element) {
//        arr[index] = element;
//    }
//
//    void add(int element) {
//        arr[size++] = element;
//        if (size == arr.length) resize();
//    }
//
//    void add(int index, int element) {
//        for (int i = size; i > index; i--) {
//            arr[i] = arr[i - 1];
//        }
//
//        arr[index] = element;
//
//        size++;
//        if (size == arr.length) resize();
//
//    }
//
//    void remove(int index) {
//        for (int i = index; i < size; i++) {
//            arr[i] = arr[i + 1];
//        }
//
//        size--;
//    }
//
//    void resize() {
//
//    }
//
//    /*
//    sort — sorts a List using a merge sort algorithm, which provides a fast, stable sort. (A stable sort is one that does not reorder equal elements.)
//    */
//    private int[] numbers;
//    private int[] helper;
//
//    private int number;
//
//    public IntList sort(IntList l) {
//            numbers = values;
//            number = values.length;
//            helper = new int[number];
//            mergesort(0, number - 1);
//
//        }
//
//    private void mergesort(int low, int high) {
//        // check if low is smaller than high, if not then the array is sorted
//        if (low < high) {
//            // Get the index of the element which is in the middle
//            int middle = low + (high - low) / 2;
//            // Sort the left side of the array
//            mergesort(low, middle);
//            // Sort the right side of the array
//            mergesort(middle + 1, high);
//            // Combine them both
//            merge(low, middle, high);
//        }
//    }
//
//    private void merge(int low, int middle, int high) {
//
//        // Copy both parts into the helper array
//        for (int i = low; i <= high; i++) {
//            helper[i] = numbers[i];
//        }
//
//        int i = low;
//        int j = middle + 1;
//        int k = low;
//        // Copy the smallest values from either the left or the right side back
//        // to the original array
//        while (i <= middle && j <= high) {
//            if (helper[i] <= helper[j]) {
//                numbers[k] = helper[i];
//                i++;
//            } else {
//                numbers[k] = helper[j];
//                j++;
//            }
//            k++;
//        }
//        // Copy the rest of the left side of the array into the target array
//        while (i <= middle) {
//            numbers[k] = helper[i];
//            k++;
//            i++;
//        }
//        // Since we are sorting in-place any leftover elements from the right side
//        // are already at the right position.
//
//    }
//}
//    }
//
//
//    /*
//    shuffle — randomly permutes the elements in a List.
//    */
//    static void shuffle(IntList l) {
//
//    }
//
//    /*
//    reverse — reverses the order of the elements in a List.
//    */
//    static void reverse(IntList l) {
//
//    }
//
//    /*
//    rotate — rotates all the elements in a List by a specified distance.
//    */
//    static void rotate(IntList l) {
//
//    }
//
//    /*
//    swap — swaps the elements at specified positions in a List.
//    */
//    static void swap(IntList l, int i, int j) {
//
//    }
//
//    /*
//    replaceAll — replaces all occurrences of one specified value with another.
//    */
//    static void replaceAll(IntList l, int rep) {
//
//    }
//
//    /*
//    fill — overwrites every element in a List with the specified value.
//    */
//    static void fill(IntList l, int rep) {
//
//    }
//
//    /*
//    copy — copies the source List into the destination List.
//    */
//    static void copy(IntList l1, IntList l2) {
//
//    }
//
//    /*
//    search — searches for an element in an List.
//    */
//    static boolean search(IntList l, int i) {
//        return false;
//    }
//
//    /*
//    indexOfSubList — returns the index of the first sublist of one List that is equal to another.
//    */
//    static int indexOfSubList(IntList l, IntList sublist) {
//        return 0;
//    }
//
//    /*
//    lastIndexOfSubList — returns the index of the last sublist of one List that is equal to another.
//    */
//    static int lastIndexOfSubList(IntList l, IntList sublist) {
//        return 0;
//    }
//
//    /*
//    difference returns a list of all items that are in only one of the two lists (XOR)
//    */
//    static IntList difference(IntList l1, IntList l2) {
//        return null;
//    }
//
//		/*
//		return a new list with only the odd items
//		*/
//		static IntList oddList(IntList l) {
//			return null;
//		}
//
//		/*
//		returns true if all items in i are in list l
//		*/
//		static boolean search(IntList l, int[] i) {
//			return false;
//		}
//
//}
