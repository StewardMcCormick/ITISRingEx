package com.mccormick.RingElementEx;

import com.mccormick.RingElementEx.exception.IllegalRingArgumentException;
import com.mccormick.RingElementEx.ring.RingElement;
import com.mccormick.RingElementEx.ring.RingElementImpl;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

	private static final Random random = new Random();

	private static final int RINGS_RANGE = 10;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		RingElement rings;
		try {
			int l = in.nextInt();

			rings = initRingList(l);
		} catch (IllegalRingArgumentException | InputMismatchException e) {
			System.out.println("Illegal argument: " + e);
			return;
		}

		printDecrementedRings(rings);
	}

	private static void printDecrementedRings(RingElement rings) {
		RingElement prev = rings;
		RingElement curr = rings.getNext();

		int l = rings.getLength();
		while (l > 0) {
			curr.decrementDigit();
			System.out.println(curr.getDigit());
			if (-0.001 < curr.getDigit() && curr.getDigit() < 0.001) {
				System.out.println("deleted");
				prev.setNext(curr.getNext());
				l--;
			}

			prev = curr;
			curr = curr.getNext();
		}
	}

	private static RingElement initRingList(int length) throws IllegalRingArgumentException {
		if (length <= 0) {
			throw new IllegalRingArgumentException(String.format("Illegal length argument: %d, must be greater then 0", length));
		}

		RingElement[] result = new RingElement[length];

		RingElementImpl currRing = new RingElementImpl(random.nextFloat(-RINGS_RANGE, RINGS_RANGE));
		RingElementImpl nextRing;

		for (int i = 0; i < length; i++) {
			nextRing = new RingElementImpl(random.nextFloat(-RINGS_RANGE, RINGS_RANGE));
			if (i != length - 1) {
				currRing.setNext(nextRing);
			} else {
				currRing.setNext(result[0]);
			}
			result[i] = currRing;
			currRing = nextRing;
		}

		return result[0];
	}
}
