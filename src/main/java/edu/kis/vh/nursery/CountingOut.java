package edu.kis.vh.nursery;

public class CountingOut {

	private static final int ELEMENTSNUMBER = 12;

	private static final int RETURNERROR = -1;

	private final int[] numbers = new int[ELEMENTSNUMBER];

	private int total = -1;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == RETURNERROR;
	}

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
