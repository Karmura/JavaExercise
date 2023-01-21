package Encapsulation;

public class CallerQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1;
		Queue q = new Queue();

		while (q.push(number)) {
			System.out.println("Number push is = " + number);
			number++;
		}
		System.out.println();
		
		boolean thereAreIteams = true;
		
		while(thereAreIteams) {
			number = q.pop();
			if(number != -1) {
				System.out.println("Queue Number pop is = " + number);
			}else {
				thereAreIteams = false;
			}

		}
		
		
		
		
		
		
//		System.out.println("Queue Number pop is = " + --number);
//		while(q.pop(number)) {
//			System.out.println("Queue Number pop is = " + number);
//			number--;
//		}
		
	}

}
