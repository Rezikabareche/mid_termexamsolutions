package design;

import java.util.HashMap;
import java.util.Map;

public class EmployeeInfo implements Employee {

	private String name;
	private int employeeId;
	private String department;
	private double salary;
	private String performance;
	private static String companyName = "ABC Company";
	private final Map<String, Double> performanceBonusMap = new HashMap<>();

	public EmployeeInfo(int employeeId) {
		this.employeeId = employeeId;
	}

	public EmployeeInfo(String name, int employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}

	public EmployeeInfo(int employeeId, String name, String department, double salary, String performance) {
		this.employeeId = employeeId;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.performance = performance;
		performanceBonusMap.put("Best", 0.10);
		performanceBonusMap.put("Average", 0.08);
		performanceBonusMap.put("Poor", 0.05);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int getEmployeeId() {
		return employeeId;
	}

	@Override
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public String getDepartment() {
		return department;
	}

	@Override
	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public double getSalary() {
		return salary;
	}

	@Override
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String getPerformance() {
		return performance;
	}

	@Override
	public void setPerformance(String performance) {
		this.performance = performance;
	}

	@Override
	public double calculateEmployeeBonus() {
		if (performanceBonusMap.containsKey(performance)) {
			double bonusPercentage = performanceBonusMap.get(performance);
			return salary * bonusPercentage * 12;
		} else {
			return 0;
		}
	}

	@Override
	public String convertDate(String date) {
		String[] parts = date.split(",");
		String month = parts[0];
		String year = parts[1];
		int monthNumber = (int) getMonthNumber(month);
		return monthNumber + "/" + year;
	}

	private double getMonthNumber(String month) {
		switch (month) {
			case "January":
				return 1;
			case "February":
				return 2;
			case "March":
				return 3;
			case "April":
				return 4;
			case "May":
				return 5;
			case "June":
				return 6;
			case "July":
				return 7;
			case "August":
				return 8;
			case "September":
				return 9;
			case "October":
				return 10;
			case "November":
				return 11;
			case "December":
				return 12;
			default:
				return 0;
		}
		throw new IllegalArgumentException("Invalid month: " + month);

	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	/*public EmployeeInfo(int employeeId){
        this.employeeId = employeeId;
    }
	}
    public EmployeeInfo(String name, int employeeId){
        this.name = name;
        this.employeeId = employeeId;
	}
	public EmployeeInfo(int i, String johnDoe, int i1, String it, String manager, String fullTime) {
	    this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.position = position;
        this.manager = manager;
        this.employmentStatus = employmentStatus;
        }
	 */





			/*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
			 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
			 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
			 * go to FortuneEmployee class to apply all the fields and attributes.
			 *
			 * Important: YOU MUST USE the
			 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
			 * Use all kind of keywords(super,this,static,final........)
			 * Implement Nested class.
			 * Use Exception Handling.
			 *
			 */

			/*
			 * declare few static and final fields and some non-static fields
			 */
			//static String companyName;

			/*
			 * You must implement the logic for below 2 methods and
			 * following 2 methods are prototype as well for other methods need to be design,
			 * as you will come up with the new ideas.
			 */

			/*
			 * you must have multiple constructor.
			 * Must implement below constructor.
			 */
	/*public EmployeeInfo(int employeeId){
		
	}
    public EmployeeInfo(String name, int employeeId){
		
	}
	
	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	/* */
	/*public static int calculateEmployeeBonus(int numberOfYearsWithCompany){
		int total=0;
		return total;
	}*/
			public int calculateYearlyBonus () {
				double bonusPercentage;
				switch (performance) {
					case 1:
						bonusPercentage = 0.05;
						break;
					case 2:
						bonusPercentage = 0.08;
						break;
					case 3:
						bonusPercentage = 0.1;
						break;
					default:
						bonusPercentage = 0;
						break;
				}
				return salary * bonusPercentage * 12;
			}
		}
	}

	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 *
	 *//*
		public static int calculateEmployeePension ( double salary, int numberOfYearsWithCompany){
			double pensionRate = numberOfYearsWithCompany * 0.05;
			double pension = salary * pensionRate;
			return (int) pension;
				String total;
				return total;
		}
	}
		}
	}
}
*/