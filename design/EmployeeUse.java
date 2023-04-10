package design;

public class EmployeeUse {

    public class Employee {
        private int id;
        private String name;
        private int salary;
        private String benefit;
        private String department;
        private String manager;
        private String grade;
        private String type;
        private int hireYear;

        public Employee(int id, String name, int salary, String benefit, String department, String manager, String grade, String type, int hireYear) {
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.benefit = benefit;
            this.department = department;
            this.manager = manager;
            this.grade = grade;
            this.type = type;
            this.hireYear = hireYear;
        }

        public int employeeId() {
            return this.id;
        }

        public String employeeName() {
            return this.name;
        }

        public int assignDepartment(String department) {
            this.department = department;
            return 1; // return a value to indicate success
        }

        public int calculateSalary() {
            return this.salary;
        }

        public void benefitLayout() {
            System.out.println("Employee benefits: " + this.benefit);
        }

        public void hireDate(int year) {
            this.hireYear = year;
        }

        public int yearsOfEmployment(int currentYear) {
            return currentYear - this.hireYear;
        }

        public String getEmployeeManager() {
            return this.manager;
        }

        public String getEmployeeGrade() {
            return this.grade;
        }

        public String getEmployeeType() {
            return this.type;
        }
    }
}





