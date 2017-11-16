import java.util.Arrays;

public class IntStack {
	public static void main(String[] args) {
		IntStack is = new IntStack();
		System.out.println(is.isEmpty());
		is.push(3);
		is.push(4);
		is.push(5);
		System.out.println(is.isEmpty());
		System.out.println(is.pop());
		System.out.println(is.peek());

		//testing area for sort -Elie
        IntStack elie = new IntStack();
        elie.push(3);
        elie.push(2);
        elie.push(5);
        elie.push(1);
        elie.push(9);
        elie.sort();
        System.out.println("sorted? " + Arrays.toString(elie.stack));

        //Ryo Test
        is.print();

		//Jared Test
        IntStack Jared = new IntStack();
        Jared.push(10);
        Jared.push(11);
        Jared.push(12);
        Jared.push(13);

        int[] multiple = Jared.pop(3);
        System.out.println(Arrays.toString(multiple));
    }


	int[] stack;
	int top;

	public IntStack() {
		stack = new int[100];
		top = 0;
	}

	boolean isEmpty() {
		return top==0;
	}

	void push(int i) {
		if(top==stack.length) resize();
		stack[top++]=i;
	}

	int pop() {
		if(!isEmpty()) return stack[--top];
		return -1;
  }

	int peek() {//sometimes
		if(!isEmpty()) return stack[top-1];
		return -1;
	}

    /*
    make a new larger implementing array
    */
    private void resize() {
        int[] temp = new int[stack.length*stack.length];
        for (int i = 0; i < stack.length; i++) {
            temp[i] = stack[i];
        }
        stack = temp;
    }

    /*
    how large is the stack?
    */
    public int size() {
		return 0;
    }

    /*
    sort the contents of the stack
    */
    public void sort() {
        //sorts stack
        Arrays.sort(stack);
        //flips order of stack, largest to smallest
        for (int i = 0; i < stack.length/2; i++) {
            int temp = stack[i];
            stack[i] = stack[stack.length-1-i];
            stack[stack.length-1-i] = temp;
        }
    }


    /*
    print the Stack pretty-like
    */
    public void print() {
        for(int i = 0; i < top; i++){
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    /*
    return the item depth distance from the top
    */
    public int peek(int depth) {
			return 0;
    }

    /*
    return multiple items from the top in a new array
    */
    public int[] pop(int multiple) {
        int[] array = new int[multiple];
        for (int i = 0; i < multiple; i++) {
             array[i] = pop();
        }

        return array;
    }

    /*
    push multiple items onto the stack
    */
    public void push(int[] nums) {

    }

    /*
    how many [num]'s are n the stack?
    */
    public int count(int num) {
			return 0;
    }

    /*
    remove depth items
    */
    public void dump(int depth) {

    }

    /*
    return the contents of the stack as an array
    */
    public int[] toArray() {
			return null;
    }

    /*
    make the bottom of the stack the top
    */
    public void flip() {

    }

    /*
    return a new stack that includes the top size items.
    */
    public IntStack subStack(int size) {
			return null;
    }

    /*
    divide every item in the stack by mult
    */
    public void divStack(int mult) {

    }


}
