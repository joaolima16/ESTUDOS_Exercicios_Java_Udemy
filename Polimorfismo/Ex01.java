package Polimorfismo;
import java.util.ArrayList;
import java.util.Scanner;
import Entities.Employee;
import Entities.OutsourcedEmployee;

import java.util.List;

public class Ex01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Employee> lst = new ArrayList<>();
		System.out.println("write the number of the employees");
		int n = sc.nextInt();
		
		for(int i = 0;i< n;i++) {
			System.out.println("The employee is the outsourced? Y/N");
			char choice = sc.next().charAt(0);
			
			if(choice == 'y') {
				System.out.print("Write the name of the employee");
				String nameEmployee = sc.next();
				System.out.println("Write the hours worked");
				Integer hours = sc.nextInt();
				System.out.print("Write the additionalCharge");
				Double addCharge = sc.nextDouble();
				lst.add(new OutsourcedEmployee(nameEmployee, hours, addCharge));
			}
			
			else {
				System.out.print("Write the name of the employee");
				String nameEmployee = sc.next();
				System.out.print("Write the hours worked");
				Integer hours = sc.nextInt();
				System.out.print("Write the valuePerHour");
				Double valuePerHour = sc.nextDouble();
				lst.add(new Employee(nameEmployee, hours, valuePerHour));
			}
		}
	
		for(Employee e: lst) {
			System.out.println("Name: "  + e.getName() + "\n" + " Salary: R$" + e.payment());
		}
	}
}
