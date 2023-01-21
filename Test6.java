package testByME;

import java.util.HashMap;
import java.util.Iterator;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hashMap = new HashMap();
		
		hashMap.put("Coffee", "180");
		hashMap.put("Tea", "160");
		hashMap.put("Juice", "200");
		hashMap.put("Ice Cream", "220");
		
		// HashMap by using keySet
		Iterator it = hashMap.keySet().iterator();
		
		while (it.hasNext()) { // loop the hashMap
			
			String strKey = (String) it.next(); // variable of hashMap key
			String strValue = (String) hashMap.get(strKey); // variable of hashMap Value
			System.out.println("Get HashMap by keyset is: " + strKey + " / " + strValue);
			
		}//end while loop
		
		// HashMap by using key_name
		
		String value1 = (String) hashMap.get("Coffee");
		System.out.println("Get HashMap by value is: Coffee/" + value1);
		
		String value2 = (String) hashMap.get("Tea");
		System.out.println("Get HashMap by value is: Tea/" + value2);
		
		String value3 = (String) hashMap.get("Juice");
		System.out.println("Get HashMap by value is: Juice/" + value3);
		
		String value4 = (String) hashMap.get("Ice Cream");
		System.out.println("Get HashMap by value is: Ice Cream/" + value4);
		
		String value5 = (String) hashMap.get("Cola");
		System.out.println("Get HashMap by value is: Cola/" + value5);
		
		
	}

}
