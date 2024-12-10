package com.in28minutes.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLocks {
	private int i = 0;
	private int j = 0;

	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();

	public int getI() {
		return i;
	}

	public void incrementI() {
		// Get lock for i
		lockForI.lock();
		i++;
		// Release lock for i
		lockForI.unlock();
	}

	public int getJ() {
		return j;
	}

	public void incrementJ() {
		// Get lock for j
		lockForJ.lock();
		j++;
		// Release lock for j
		lockForJ.unlock();
	}
}
