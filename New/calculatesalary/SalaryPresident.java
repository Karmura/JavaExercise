package calculateSalaryTest;

public class SalaryPresident extends SalaryBase {
	
	public int calcSalary(int iBase, int iFamily) {
		return iBase * 2 + iFamily;
	}
	
}
