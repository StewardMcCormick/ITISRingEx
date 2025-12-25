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
}
