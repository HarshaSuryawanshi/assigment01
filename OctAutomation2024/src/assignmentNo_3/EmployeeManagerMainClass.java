package assignmentNo_3;

public class EmployeeManagerMainClass  extends HRManager{

	public static void main(String[] args) {
		//create a Employee class Object
		 Employee emp = new Employee();
		 emp.work();
	  	emp.getSalary();
		 
		 //Creating a HRManager Object
		 HRManager hr = new HRManager();
		 hr.work();
		 hr.addEmployee();
	}

}
