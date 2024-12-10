package com.in28minutes.concurrency;

public class BiCounter {
	private int i = 0;
	private int j = 0;

	synchronized public int getI() {
		return i;
	}

	public void incrementI() {
		i++;
	}

	synchronized public int getJ() {
		return j;
	}

	public void incrementJ() {
		j++;
	}
}
