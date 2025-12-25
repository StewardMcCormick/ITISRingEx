package com.mccormick.RingElementEx.ring;

public interface Ring {

	double getDigit();

	void decrementDigit();

	Ring getNext();

	void setNext(Ring next);

	int getLength();
}
