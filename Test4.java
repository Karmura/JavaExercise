package testByME;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=100;
		int total = 0;
		
		System.out.print("List of numbers from 1 to "+number+": ");  
		
		for (int i=1; i<=number; i++) {  
			System.out.print(i + " "); // value of 1 to 100
			
			if (i%2==0){  // check all the even number
				total += i; // sum of all Even
			} // end if
			
		} // end for loop
		
		System.out.println("\n"+"The total sum of all even = "+total); // The total sum of all Even 
  
	}

}
