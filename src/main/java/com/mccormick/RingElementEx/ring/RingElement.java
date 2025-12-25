package com.mccormick.RingElementEx.ring;

public interface RingElement {

	double getDigit();

	void decrementDigit();

	RingElement getNext();

	void setNext(RingElement next);

	int getLength();
}
