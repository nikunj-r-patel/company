package employeManagmentSystem;

import java.util.Comparator;

public class SortByEmpName  implements Comparator<Employee>{

	@Override
	public int compare(Employee obj0, Employee obj1) {
		// TODO Auto-generated method stub
		return obj0.getEmpName().compareTo(obj1.getEmpName());
	}

}
