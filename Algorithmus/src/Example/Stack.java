package Example;

public class Stack {
	private final int MAX_SIZE = 50;
	private int top = -1;
	private int stack[];
	
	public Stack(int size){
		stack = new int[size];
	}
	public boolean full(){
		return (top==(MAX_SIZE-1));
	}
	public boolean empty(){
		return (top==-1);
	}
	public void push(int value){
		if(top >= MAX_SIZE){
			full();
			return;
		}
		stack[++top] = value;
	}
	public int pop(){
		if(top == -1) return -1;
		return stack[top--];
	}
}