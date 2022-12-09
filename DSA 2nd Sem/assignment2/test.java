package assignment2;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of Employees data you want to register : ");
		EmpInterface[] emp = new EmpInterface[sc.nextInt()];
		for (int i = 0; i<emp.length; i++) {
			System.out.print("Enter the full name of the Employee : ");
			String fName = sc.next();
			String lName = sc.next();
			System.out.print("Enter the Employee ID : ");
			int empId = sc.nextInt();
			System.out.print("Enter the salary of the Employee : ");
			double salary = sc.nextDouble();
			System.out.print("Enter the bonus amount : ");
			double amount = sc.nextDouble();
			emp[i] = new Manager(empId, fName, lName, salary);
			emp[i].giveBonus(amount);
			System.out.println();
			emp[i].displayEmp();
		}
		
		sc.close();

	}

}
