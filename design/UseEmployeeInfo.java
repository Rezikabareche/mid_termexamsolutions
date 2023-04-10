package design;

import java.util.Scanner;

   /* public abstract class UseEmployeeInfo implements Employee {

        private int employeeId;
        private String employeeName;
        private String employeeType;
        private int salary;
        private String department;
        private String manager;
        private int hireYear;
        private int yearsOfEmployment;

        private static final String COMPANY_NAME = "ABC Corp";
        private static final int BEST_PERFORMANCE_BONUS_PERCENTAGE = 10;
        private static final int AVERAGE_PERFORMANCE_BONUS_PERCENTAGE = 8;
        private static final int PENSION_BASE_PERCENTAGE = 5;
        private static final int PENSION_INCREMENT_PERCENTAGE = 5;

        public UseEmployeeInfo(int employeeId) {
            this.employeeId = employeeId;
        }

        public UseEmployeeInfo(String name, int employeeId) {
            this.employeeName = name;
            this.employeeId = employeeId;
        }

        public UseEmployeeInfo(int employeeId, String employeeName, String employeeType, int salary,
                            String department, String manager, int hireYear, int yearsOfEmployment,String managerName,int departmentId,String EmployeeGrade) {
            this.employeeId = employeeId;
            this.employeeName = employeeName;
            this.employeeType = employeeType;
            this.salary = salary;
            this.department = department;
            this.manager = manager;
            this.hireYear = hireYear;
            this.yearsOfEmployment = yearsOfEmployment;
            this.managerName=managerName;
            this.employeeGrade=employeeGrade;
            this.departmentId=departmentId;
        }

        public int getEmployeeId() {
            return employeeId;
        }

        public String getEmployeeName() {
            return employeeName;
        }

        public void setEmployeeName(String employeeName) {
            this.employeeName = employeeName;
        }

        public String getEmployeeType() {
            return employeeType;
        }

        public void setEmployeeType(String employeeType) {
            this.employeeType = employeeType;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public String getManager() {
            return manager;
        }

        public void setManager(String manager) {
            this.manager = manager;
        }

        public int getHireYear() {
            return hireYear;
        }

        public void setHireYear(int hireYear) {
            this.hireYear = hireYear;
        }

        public int getYearsOfEmployment() {
            return yearsOfEmployment;
        }

        public void setYearsOfEmployment(int yearsOfEmployment) {
            this.yearsOfEmployment = yearsOfEmployment;
        }

        public static String getCompanyName() {
            return COMPANY_NAME;
        }

        @Override
        public void benefitLayout() {

                System.out.println("Eligible benefits:");
                System.out.println("- Health insurance");
                System.out.println("- Retirement plans");
                System.out.println("- Paid time off");
        }

        @Override
        public void hireDate(int year) {

                    this.hireYear = year;
            }


        @Override
        public int yearsOfEmployment(int a) {
                return a - this.hireYear;

        }

        @Override
        public String getEmployeeManager() {
                return this.managerName;
        }

        @Override
        public String getEmployeeGrade() {
            return this.employeeGrade;
        }

        @Override
        public int assignDepartment() {
            return this.departmentID;
        }

        @Override
        public int calculateSalary() {

                int baseSalary = 50000;
                int experienceBonus = this.yearsOfEmployment(2023) * 1000;
                int educationBonus = this.educationLevel.equals("Master's") ? 5000 : 0;
                int performanceBonus = this.performanceScore >= 90 ? 10000 : 0;
                return baseSalary + experienceBonus + educationBonus + performanceBonus;
            }
        }



    */