package testByME;

public class Test2studentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length >= 80) {
			System.out.println("Grade A");
		}
		else if(args.length >= 65 && args.length < 80) {
			System.out.println("Grade B");
		}
		else if(args.length >= 65 && args.length < 80) {
			System.out.println("Grade B");
		}
		else if(args.length >= 50 && args.length < 65) {
			System.out.println("Grade C");
		}else {
			System.out.println("Fail");
		}
	}

}
