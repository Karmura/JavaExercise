package testByME;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br1 = new BufferedReader(input);
		BufferedReader br2 = new BufferedReader(input);
		BufferedReader br3 = new BufferedReader(input);
		BufferedReader br4 = new BufferedReader(input);
		try { 
			System.out.println("Please Enter your name:");
			String name = br1.readLine();
			System.out.println("Please Enter your age:");
			String age = br2.readLine();
			System.out.println("Please Enter your city:");
			String city = br3.readLine();
			System.out.println("Please Enter your Phone:");
			String phone = br4.readLine();
			
			System.out.println("Your Name is : " + name);
			System.out.println("Your Age is : " + age);
			System.out.println("Your City is : " + city);
			System.out.println("Your Phone is : " + phone);
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
