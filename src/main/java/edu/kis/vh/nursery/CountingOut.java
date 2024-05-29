package edu.kis.vh.nursery;

/**
 * 
 * The CountingOut class represents a simple data structure 
 * for counting and storing integers.
 * It supports basic operations such as adding, removing, 
 * and checking the current state of the storage.
 */
public class CountingOut {

	private static final int ELEMENTSNUMBER = 12;

	private static final int RETURNERROR = -1;

	private final int[] numbers = new int[ELEMENTSNUMBER];

	private int total = -1;

	public int getTotal() {
		return total;
	}


	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == RETURNERROR;
	}

	/**
	 * 
     * Checks if the array is full.
     * @return true if the array is full, false otherwise.
	 */
	public boolean isFull() {
		return total == (ELEMENTSNUMBER - 1);
	}

	protected int peekaboo() {
		if (callCheck())
			return RETURNERROR;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return RETURNERROR;
		return numbers[total--];
	}

}
