package com.in28minutes.concurrency;

public class Counter {
	int i = 0;

	synchronized public int getI() {
		return i;
	}

	public void increment() {
		i++;
	}
}
