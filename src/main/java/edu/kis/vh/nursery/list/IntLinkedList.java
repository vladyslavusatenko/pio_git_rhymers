package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int RETURNERROR = -1;
	private Node last;
    private int i;

    private static class Node {

        private final int value;
        private Node prev;
        private Node next;

        protected Node(int i) {
            value = i;
        }

        private int getValue() {
            return value;
        }

        private Node getPrev() {
            return prev;
        }

        private void setPrev(Node prev) {
            this.prev = prev;
        }

        private Node getNext() {
            return next;
        }

        private void setNext(Node next) {
            this.next = next;
        }
    }
    
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return RETURNERROR;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return RETURNERROR;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
