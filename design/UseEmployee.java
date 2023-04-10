package design;

public class UseEmployee  implements Employee{

    int emp;
    String empName;
    int dept;
    double annualSal;
    double monthSal;

    public int setEmpId(int emp) {
        this.emp = emp;
        System.out.println ("the employeeId is :  " +emp);
        return emp;
    }
    @Override
    public int employeeId() {
        System.out.println ( emp);

        return emp;
    }


    @Override
    public String employeeName() {
        System.out.println(" the employee name is:   "     );
        return empName;
    }
    public String setEmpName(String empName){
        this.empName=empName;
        return empName;
    }

    public int setDepartment(int dept) {
        this.dept = dept;
        return dept;
    }
    @Override
    public int assignDepartment() {
      System.out.println(" the department number is "+dept);
        return dept;
    }

    @Override
    public int calculateSalary() {
        return 0;
    }
    public double setSalary(double monthlySalary, double annualSalary){

        this.monthSal=monthlySalary;
        this.annualSal=annualSalary;
         double totalSal=annualSal-monthSal;
        System.out.println("the salary is :" +totalSal);
        return totalSal;
    }

    @Override
    public void benefitLayout() {

    }

    @Override
    public void hireDate(int year) {
        System.out.println("the hire date of this employee is "+year);

    }

    @Override
    public int yearsOfEmployment( int totalYears) {
        System.out.println("the total years of employment is "+totalYears);
        return totalYears;
    }
}
