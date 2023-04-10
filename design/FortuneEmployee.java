/*package design;
import java.util.Scanner;
public class FortuneEmployee {
	static Scanner scanner = new Scanner(System.in);
	static EmployeeInfo employeeInfo = new EmployeeInfo();
	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	/*public static void main(String[] args) {

				int choice = 0;

				while (choice != 7) {
					System.out.println("\nWelcome to Fortune 500 Employee Information System");
					System.out.println("---------------------------------------------------");
					System.out.println("1. Add new employee");
					System.out.println("2. Display all employees");
					System.out.println("3. Search employee by ID");
					System.out.println("4. Search employee by name");
					System.out.println("5. Update employee information");
					System.out.println("6. Delete employee");
					System.out.println("7. Exit");

					System.out.print("\nEnter your choice: ");
					choice = scanner.nextInt();

					switch (choice) {
						case 1:
							addEmployee();
							break;
						case 2:
							displayAllEmployees();
							break;
						case 3:
							searchEmployeeById();
							break;
						case 4:
							searchEmployeeByName();
							break;
						case 5:
							updateEmployee();
							break;
						case 6:
							deleteEmployee();
							break;
						case 7:
							System.out.println("\nThank you for using Fortune 500 Employee Information System!");
							break;
						default:
							System.out.println("\nInvalid choice. Please enter a valid choice (1-7).");
					}
				}
			}

			private static boolean addEmployee() {
				System.out.println("\nAdding new employee");
				System.out.println("--------------------");

				System.out.print("Enter employee ID: ");
				int id = scanner.nextInt();

				scanner.nextLine(); // consume newline

				System.out.print("Enter employee name: ");
				String name = scanner.nextLine();

				System.out.print("Enter employee department: ");
				String department = scanner.nextLine();

				System.out.print("Enter employee position: ");
				String position = scanner.nextLine();

				System.out.print("Enter employee salary: ");
				double salary = scanner.nextDouble();

				Employee employee = new Employee(id, name, department, position, salary);

				boolean success = addEmployee();

				if (success) {
					System.out.println("\nEmployee added successfully!");
				} else {
					System.out.println("\nEmployee could not be added. Please try again.");
				}
				return success;
			}

			private static void displayAllEmployees() {
				System.out.println("\nDisplaying all employees");
				System.out.println("-------------------------");

				Employee[] employees = EmployeeInfo.getAllEmployees();

				if (employees.length == 0) {
					System.out.println("No employees found.");
				} else {
					for (Employee employee : employees) {
						System.out.println(employee);
					}
				}
			}

			private static void searchEmployeeById() {
				System.out.println("\nSearching employee by ID");
				System.out.println("------------------------");

				System.out.print("Enter employee ID: ");
				int id = scanner.nextInt();

				Employee employee = UseEmployeeInfo.getEmployeeById(id);

				if (employee == null) {
					System.out.println("Employee not found.");
				} else {
					System.out.println(employee);
				}
			}

			private static void searchEmployeeByName() {
				System.out.println("\nSearching employee by name");
				System.out.println("--------------------------");

				System.out.print("Enter employee name: ");
				String name = scanner.nextLine();

				Employee[] employees = employeeInfo.getEmployeeName(name);

				if (employees.length == 0) {
					System.out.println("No employees found.");
				} else {
					for (Employee employee : employees) {
						System.out.println(employee);


					}

				}

			}
}
*/