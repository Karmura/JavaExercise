package testByME;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        String input = args[0];  // Getting value by using arguments
        int num = Integer.parseInt(input); // input value changing to integer
        
        for(int i = 1; i <= 12; ++i)
        {
        	int total = (num*i); // Multiply input value to 12
        	
        	System.out.println(num + " * " + i + " = " + total);
        	
        } // end for loop
		
	}

}
