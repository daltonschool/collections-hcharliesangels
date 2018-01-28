import java.util.Arrays;

public class IntSet {
	public static void main(String[] args) {
		IntSet devin = new IntSet(7);

        //Ryan Testing
		IntSet ryan = new IntSet(7);
        ryan.add(4);
        ryan.add(2);
        ryan.add(6);
        ryan.add(1);
        ryan.add(3);
        System.out.println(Arrays.toString(ryan.arr));
        System.out.println(Arrays.toString(ryan.maxSubSet(4).arr));

        //Jared Testing
		IntSet jared = new IntSet(7);
        IntSet jared2 = new IntSet(7);
        jared.add(1);
        jared.add(2);
        jared.add(3);
        jared2.add(3);
        jared2.incrementAll(jared);
        System.out.println(jared2.contains(4));
        System.out.println(jared2.contains(3));
        System.out.println(jared2.contains(2));

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

        //malcolm's tests:
		System.out.println(devin.contains(30));
		devin.add(30);
		System.out.println(devin.contains(30));
        devin.multiplyAll(devin, 4);
        System.out.println(devin);
        System.out.println();

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
        for (int i = 0; i < s.arr.length; i++) {
            if (s.arr[i] != arr[i]) {
                return false;
            }
        }
        return true;
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
           Boolean a = false;
           Boolean b = false;

           for(int i = 0; i < this.arr.length; i++) {
               a=b;
               b = this.arr[i];
               if(s.contains(i)){
                   this.arr[i]=a;
               }
               if(i>0 && s.contains(i-1)) {
                   this.arr[i] = a;
               }

        }
    }

    /*
      for any number in set s that is in this set, multiply this set by multiplier
    */
    void multiplyAll(IntSet s, int multiplier) {
        int max = 100;
        IntSet sMult = new IntSet(max / multiplier);
        sMult = s;
        for (int i = 0; i < this.arr.length; i++) {
            s.multiplyAll(s, multiplier);
            if (sMult.arr.length > max / multiplier) {
                sMult.remove(arr.length / multiplier);
            }
        }
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
    	IntSet subset = new IntSet(this.arr.length);
    	int counter = 0;
    	for(int a = this.arr.length-1; a > 0; a--){
            if((counter<subSetSize) && this.arr[a]==true){
                subset.add(a);
                counter++;
            }
        }
        return subset;
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

