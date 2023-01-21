package testByME;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color = args[0];
		switch (color) {
		case "b":
			System.out.println("color "+ color + " = Blue Color"); // case b
			break;
		case "r":
			System.out.println("color "+ color + " = Red"); // case r
			break;
		case "g":
			System.out.println("color "+ color + " = Green Color"); // case g
			break;
		default:
			System.out.println("Your color is another color"); // case default
		} // end switch
	}

}
