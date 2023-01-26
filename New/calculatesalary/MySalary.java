package calculateSalaryTest;

public class MySalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int iBase = 10;
		int iFamily = 2;

		// Salary President
		SalaryPresident cal = new SalaryPresident();
		System.out.println("Salary President = " + cal.calcSalary(iBase, iFamily));
		
		// Salary Employee
		SalaryEmployee se = new SalaryEmployee();
		System.out.println("Salary Employee = " + se.calcBonus(cal.calcSalary(iBase, iFamily)));
		
		// Salary Base
		SalaryBase sb = new SalaryBase();
		System.out.println("Salary Base = " + sb.calcSalary(iBase, iFamily));

	}

}
