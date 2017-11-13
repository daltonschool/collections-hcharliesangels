public class IntSet {
    public static void main(String[] args) {
        IntSet devin = new IntSet(100);

        System.out.println(devin.contains(30));
        devin.add(30);
        System.out.println(devin.contains(30));

        //Test area for retainAll -Elie
        IntSet elie = new IntSet(5);
        elie.add(1);
        elie.add(2);
        elie.add(4);
        elie.retainAll(elie);

        //Ryo tests:
        IntSet ryo = new IntSet(100);
        IntSet ryo2 = new IntSet(100);
        ryo.add(30);
        ryo2.add(30);
        ryo.removeAll(ryo2);
        System.out.println(ryo.contains(30));
        IntDeque x = new IntDeque(4);
        System.out.println(x.peekFirst());

    }


    boolean[] arr;


    public IntSet(int size) {
        arr = new boolean[size];
    }

    void add(int i) { arr[i] = true; }

    void remove(int i) {
        arr[i] = false;
    }

    boolean contains(int i) {
        return arr[i];
    }

    //BULK FUNCTIONS:

    /*
    returns true if s is a subset of set
    */
    boolean containsAll(IntSet s) {
        return false;
    }

    /*
    add all items in set s to this set.
    */
    void addAll(IntSet s) {

    }

    /*
    remove all items from this set that are not in set s (intersection)
    */
    void retainAll(IntSet s) {
        boolean[] thisSet = new boolean[10];
        for (int i = 0; i < thisSet.length; i++) {
            thisSet[i] = true;
        }

        if (thisSet.length >= arr.length) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == true && thisSet[i] == true) thisSet[i] = true;
                else thisSet[i] = false;
            }
        } else {
            for (int i = 0; i < thisSet.length; i++) {
                if (arr[i] == true && thisSet[i] == true);
                else thisSet[i] = false;
            }
        }
    }

    /*
    remove all items in s from this set
    */
    void removeAll(IntSet s) {

    }

    /*
    increment every number in the set by 1
    */
    void incrementAll(IntSet s) {

    }

    /*
      for any number in set s that is in this set, multiply this set by multiplier
    */
    void multiplyAll(IntSet s, int multiplier) {

    }

    /*
    does the set contain all of the prime factors of number
    */
    boolean containsPrimeFactors(int number) {
        return false;
    }

    /*
    all the subsets that can be generated of subSetSize size
    */
    IntSet[] subSets(int subSetSize) {
        return null;
    }

    /*
    the subSetSize largest items
    */
    IntSet maxSubSet(int subSetSize) {
        return null;
    }

    /*
    return an array of two sets,
    the set of numbers above divide, and those below
    */
    IntSet[] discrete(int divide) {
        return null;
    }

    /*
    finds this intersection of this and all sets in the array
    */
    boolean containsAll(IntSet[] s) {
        return false;
    }

    /*
    print the set pretty like.
    */
    String print(boolean[] l) {
        String string = "";
        for (int i = 0; i < l.length; i++) {
            string+=l[i] + " ";
        }
        return string;
    }

    /*
    finds the gcd of the set
    */
    int gcd() {
        return 0;
    }

    /*
    finds the mean of the set
    */
    int mean() {
        return 0;
    }

    /*
    returns a set with only the bottom n items in the set
    */
    IntSet bottom(int n) {
        return null;
    }

}

