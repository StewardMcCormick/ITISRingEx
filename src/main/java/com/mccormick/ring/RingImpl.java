package com.mccormick.ring;

public class RingImpl implements Ring {

	private float digit;

	private Ring next;

	public RingImpl(float digit) {
		this.digit = digit;
	}

	@Override
	public double getDigit() {
		return this.digit;
	}

	@Override
	public void decrementDigit() {
		this.digit /= 2;
	}

	@Override
	public Ring getNext() {
		return this.next;
	}

	public void setNext(Ring next) {
		this.next = next;
	}

	public int getLength() {
		Ring curr = getNext();
		int res = 1;
		while (curr != null && curr != this) {
			res++;
			curr = curr.getNext();
		}

		return res;
	}

	@Override
	public String toString() {
		return "RingImpl{" +
				"digit=" + digit +
				", next=" + next +
				'}';
	}
}
