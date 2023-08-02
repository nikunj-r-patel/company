package employeManagmentSystem;

import java.util.Comparator;

public class SortByEmpAge implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEmpAge()-o2.getEmpAge();
	}

	

}
