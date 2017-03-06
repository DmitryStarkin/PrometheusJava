package com.tasks3.linkedlist;

public class LinkedList {
	Node head = null;
	int size = 0;

	public LinkedList() {

	}

	public void add(Integer data) {
		if (head == null) {
			head = new Node();
			head.setData(data);
			size++;
		} else {
			Node tmp = head;
			while (tmp.getNext() != null) {
				tmp = tmp.getNext();
			}
			tmp.setNext(new Node());
			tmp.getNext().setData(data);
			size++;
		}
	}

	public Integer get(int index) {
		Node tmp = head;
		if (tmp == null) {
			return null;
		} else {
			int position = 0;
			while (position != index & tmp.getNext() != null) {
				tmp = tmp.getNext();
				position++;
			}
		}
		return tmp == null ? null : tmp.getData();
	}

	public boolean delete(int index) {
		Node tmp = head;
		int position = 0;
		if (tmp == null) {
			return false;
		} else if (index == 0) {
			head = tmp.getNext();
			size--;
			return true;
		} else {

			while (position != (index - 1) & tmp.getNext() != null) {
				tmp = tmp.getNext();
				position++;
			}
			if (position == (index - 1) & tmp.getNext() != null) {
				tmp.setNext(tmp.getNext().getNext());
				size--;
				return true;
			}
		}
		return false;
	}

	public int size() {
		return size;
	}
}
