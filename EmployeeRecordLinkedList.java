package employeManagmentSystem;

import java.awt.Choice;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EmployeeRecordLinkedList {

	public static void main(String[] args) {

		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		
		EmployeeRecordManagement empRecord = new EmployeeRecordManagement();
		Employee employee=new Employee();

		int choise = 7;
		do {
			System.out.println("Please select the # of operation you want");
			System.out.println("Enter 1 to Add Employee");
			System.out.println("Enter 2 to Remove Employee");
			System.out.println("Enter 3 to Update data of Employee");
			System.out.println("Enter 4 to Find Data of Employee");
			System.out.println("Enter 5 to See Employee List");
			System.out.println("Enter 6 to Exit");

			choise = input1.nextInt();
			switch (choise) {
			
			case 1:
				System.out.println("Please enter the data of employee");

				System.out.println("enter Employee ID");
				int empId = input1.nextInt();
				System.out.println("enter Employee NAME");
				String empName = input2.nextLine();
				System.out.println("enter Employee Skills S1");
				String sk1 = input2.nextLine();
				System.out.println("enter Employee Skills S2");
				String sk2 = input2.nextLine();
				System.out.println("enter Employee Skills S3");
				String sk3 = input2.nextLine();
				System.out.println("enter Employee AGE");
				int empAge = input1.nextInt();
				System.out.println("enter Employee SALARY");
				double empSalary = input1.nextDouble();
				System.out.println("enter Employee JOINDATE");
				String empJoinDate = input2.nextLine();

				Skills empSkills = new Skills(sk1, sk2, sk3);
				employee = new Employee(empId, empName, new Skills(sk1, sk2, sk3), empAge, empSalary, empJoinDate);
				empRecord.addEmployee(employee);
				System.out.println(employee);

				break;
				
			case 2:
				System.out.println("enter the employee id you want to remove");
				int emp_id1=input1.nextInt();
				empRecord.removeEmployee(emp_id1);
				
				break;
				
			case 3:
				System.out.println("enter the employee id you want to update");
				int emp_id2=input1.nextInt();
				empRecord.updateEmployeeData(emp_id2, input1,input2);
				
				break;
				
			case 4:
				System.out.println("enter the employee id whose data you want ");
				int emp_id3=input1.nextInt();
				empRecord.getEmployeeData(emp_id3);
				
				break;
				
			case 5:
				empRecord.showEmployeeList();
				
				break;
			case 6:
				int sel=3;
				System.out.println("select the sorting operation as below");
				System.out.println("1 to sort by name");
				System.out.println("2 to sort by age");
				Scanner srtOpt=new Scanner(System.in);
				sel=srtOpt.nextInt();
				switch (sel) {
				case 1:
					empRecord.sortEmployeeByName();
					
					break;
				case 2:
					empRecord.sortEmployeeByName();
					break;

				default:
					System.out.println("no other sorting methhods are implimented");
					break;
				}
				
				
				
				break;
			case 7:
				System.out.println("thenk you for doing operations");
				System.exit(0);
				break;

			default:
				System.out.println(" no operation is available for your choise");
				break;
			}

		} while (choise != 7);

	}

}
