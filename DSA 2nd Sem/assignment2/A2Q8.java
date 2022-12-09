package assignment2;

interface EmpInterface {
	void displayEmp();
	void giveBonus(double amount);
}
abstract class Employee {
	int empID;
	String fName, lName;
	double salary;
}
class Manager extends Employee implements EmpInterface{
	double bonus;
	Manager(int empId, String fName, String lName, double salary){
		this.empID = empId;
		this.fName = fName;
		this.lName = lName;
		this.salary = salary;
	}
	public void giveBonus(double amount) {
		try {
			if (amount <= 0) {
				throw new ArithmeticException("Bonus cannot be less than 0.");
			}
			else {
				bonus = amount;
				salary += bonus;
			}
		}
		catch(ArithmeticException ex){
			System.out.println(ex);
		}
	}
	public void displayEmp() {
		System.out.println(fName + " " + lName + " with employee ID " + empID + " has a total salary of " + salary);
	}
	
}
