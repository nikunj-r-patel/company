package employeManagmentSystem;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class EmployeeRecordManagement {

	LinkedList<Employee> empList = new LinkedList<>();

	public void addEmployee(Employee employee) {

		if (!findEmployee(employee.getEmpId())) {
			empList.add(employee);
		} else {
			System.out.println("Employee is added allredy");
		}
	}

	public boolean findEmployee(int emp_id) {
		Iterator<Employee> empItr = empList.iterator();
		while (empItr.hasNext()) {
			Employee emp1 = (Employee) empItr.next();
			if (emp1.getEmpId() == emp_id) {
				// System.out.println(emp1.toString());
				return true;
			}

		}
		return false;

	}

	public void removeEmployee(int emp_id) {

		Employee empDel = null;
		for (Employee emp2 : empList) {
			if (emp2.getEmpId() == emp_id) {
				empDel = emp2;
			}

		}
		if (empDel == null) {
			System.out.println("the employee " + emp_id + " is not in the record");
		} else {
			empList.remove(empDel);
			System.out.println("the employee " + emp_id + " is removed from record");
		}
	}

	public Employee getEmployeeData(int emp_id) {
		Iterator<Employee> empItr = empList.iterator();
		while (empItr.hasNext()) {
			Employee emp3 = (Employee) empItr.next();
			if (emp3.getEmpId() == emp_id) {
				System.out.println(emp3);
				return emp3;
			}
		}
		return null;

	}

	public void updateEmployeeData(int emp_id, Scanner input1, Scanner input2) {
		if (findEmployee(emp_id)) {
			Employee emp4 = getEmployeeData(emp_id);
			System.out.println("Please enter all new data to be updated of " + emp_id);

			System.out.println("enter Employee ID");
			int empIdN = input1.nextInt();
			System.out.println("enter Employee NAME");
			String empNameN = input2.nextLine();
			System.out.println("enter Employee Skills S1");
			String sk1N = input2.nextLine();
			System.out.println("enter Employee Skills S2");
			String sk2N = input2.nextLine();
			System.out.println("enter Employee Skills S3");
			String sk3N = input2.nextLine();
			System.out.println("enter Employee AGE");
			int empAgeN = input1.nextInt();
			System.out.println("enter Employee SALARY");
			double empSalaryN = input1.nextDouble();
			System.out.println("enter Employee JOINDATE");
			String empJoinDateN = input2.nextLine();

			Skills empSkillsN = new Skills(sk1N, sk2N, sk3N);
			emp4.setEmpId(empIdN);
			emp4.setEmpName(empNameN);
			emp4.setEmpSkills(empSkillsN);
			emp4.setEmpAge(empIdN);
			emp4.setEmpSalary(empSalaryN);
			emp4.setEmpJoinDate(empJoinDateN);
			System.out.println("the data of employee " + emp_id + " is updated in record");

		} else {
			System.out.println("the  employee " + emp_id + " is not in the record");

		}
	}

	public void showEmployeeList() {
		if (empList.isEmpty()) {
			System.out.println("the employee list is not available");
		} else {
			Iterator<Employee> empItr = empList.iterator();
			while (empItr.hasNext()) {
				Employee emp4 = (Employee) empItr.next();
				System.out.println(emp4);

			}
		}
	}
	 public void sortEmployeeByName() {
		 Collections.sort(empList, new SortByEmpName());
		 Iterator<Employee> empItr = empList.iterator();
			while (empItr.hasNext()) {
				Employee emp5 = (Employee) empItr.next();
				System.out.println(emp5);

			}
		 
	 }
	 public void sortEmployeeByAge() {
		 Collections.sort(empList, new SortByEmpAge());
		 Iterator<Employee> empItr = empList.iterator();
			while (empItr.hasNext()) {
				Employee emp6 = (Employee) empItr.next();
				System.out.println(emp6);

			}
		 
	 }

}
