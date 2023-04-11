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

	String getName();

	void setName(String name);

	int getEmployeeId();

	void setEmployeeId(int employeeId);

	String getDepartment();

	void setDepartment(String department);

	double getSalary();

	void setSalary(double salary);

	String getPerformance();

	void setPerformance(String performance);

	double calculateEmployeeBonus();

	String convertDate(String date);
}