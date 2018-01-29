package Algorithmus_test;

public class Queue {
	private final static int MAX_SIZE = 50;
	private int rear = -1;		//	���� ����Ű�� ����
	private int front = 0;		//	ó���� ����Ű�� ����
	private int[] queue;
	
	public Queue(int size){
		queue = new int[size];
	}
	
	public boolean full(){
		return (rear==(MAX_SIZE-1));
	}

	public boolean empty(){
		return (front == rear+1);
	}

	public void push(int value){
		if(rear >= MAX_SIZE){
			full();
			return;
		}
		queue[++rear] = value;
	}

	public int pop(){
		if(empty()) return -1;
		return queue[front++];
	}
}
