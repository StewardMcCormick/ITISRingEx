package com.mccormick.RingElementEx.ring;

public class RingElementImpl implements RingElement {

	private float digit;

	private RingElement next;

	public RingElementImpl(float digit) {
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
	public RingElement getNext() {
		return this.next;
	}

	public void setNext(RingElement next) {
		this.next = next;
	}

	public int getLength() {
		RingElement curr = getNext();
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
