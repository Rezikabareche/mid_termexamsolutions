package design;

public interface Employee {
	
	/*Employee is an Interface which contains multiple unimplemented methods.Again few methods
	has been declared in below. you need to brainstorm to add more methods to meet the business requirements.
	*/
	//please read the following method and understand the business requirements of these following methods
	//and then implement these in a concrete class.
	
	//employeeId() will return employee id.
	public int employeeId();
	
	//employeeName() will return employee name
	public String employeeName();

	//assignDepartment() will assign employee to departments
    public int assignDepartment();
	
	//calculate employee salary
	public int calculateSalary();
	
	//employee benefit
	public void benefitLayout();

	//employee hireDate
	public void hireDate(int year);

	//employee yearsOfEmployment
	public int yearsOfEmployment(int a);

	//This method will return the manager of the employee
    public String getEmployeeManager();

	//This method will return the grade of the employee based on their performance.
	 public String getEmployeeGrade();

	//This method will return the type of employee, such as full-time
	public String getEmployeeType();
}

