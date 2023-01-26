package calculateSalaryTest;

public class SalaryEmployee extends SalaryBase implements InterfaceAllowance {
	
	public int calcBonus(int iBase) {
		return iBase * 3;
	}
	
}
