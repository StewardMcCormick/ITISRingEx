package com.mccormick.RingElementEx.ring;

public class RingImpl implements com.mccormick.RingElementEx.ring.Ring {

	private float digit;

	private com.mccormick.RingElementEx.ring.Ring next;

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
	public com.mccormick.RingElementEx.ring.Ring getNext() {
		return this.next;
	}

	public void setNext(com.mccormick.RingElementEx.ring.Ring next) {
		this.next = next;
	}

	public int getLength() {
		com.mccormick.RingElementEx.ring.Ring curr = getNext();
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
