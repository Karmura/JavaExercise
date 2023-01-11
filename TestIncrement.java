package Exercises;

public class TestIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;    // Declare the value of i
		int iInc; // Declare the value of iInc
		
		iInc = i++; // the result of iInc = i++
		System.out.println("The result of i++ is " + iInc + " and the result of i is = "+ i);
		
		iInc = ++i; // the result of iInc = ++i
		System.out.println("The result of ++i is " + iInc + " and the result of i is = "+ i);
	}	

}
