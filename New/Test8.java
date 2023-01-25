package testByME;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Test8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileWriter fw = new FileWriter("test8.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter output = new PrintWriter(bw);
        
		Random rdmnum = new Random();
		
		for(int i = 0 ; i < 10; i++) {
			
	        int myRandInt = rdmnum.nextInt(100); // Random between 1 and 100
	        myRandInt = myRandInt+1;
	        
	        output.println((i+1) + " = " + myRandInt);    // Write in File
	        System.out.println((i+1) + " = " + myRandInt); // Write in console

		}// end for loop
		
		output.close();
	}

}
