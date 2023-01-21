package Encapsulation;

public class Queue {
	
	public int content[] = new int[10];
	public int index = 0;
	public int index1 = 0;
	
	public boolean empty() {
		return (index1 < index) ? true : false;
	}
	
	public boolean full() {
		return (index > 3) ? true : false;
	}
	
	boolean push(int i) {
		if(!full()) {
			content[index++] = i;
			return true;
		}else {
			return false;
		}
	}
	
	int pop() {
		
		if(empty()) {
		
			return content[index1++];
	
		}else {
			
			return -1;
		}
			
		
	}
	
}
