package com.BridgeLabz.java;

public class StackQueue {
	static LinkedList list = new LinkedList();

	public void push(Object data) {
		list.addFirst(data);
	}

	public void show() {
		list.display();
	}
}