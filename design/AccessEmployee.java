package design;

public class AccessEmployee {


        public static void main(String[]args){

           UseEmployee emp1=new UseEmployee();
           System.out.println(emp1.employeeId());
           System.out.println(emp1.setEmpId(10));
            System.out.println(emp1.setDepartment(20));
            System.out.println(emp1.assignDepartment());
           System.out.println( emp1.calculateSalary());
            System.out.println(emp1.setSalary(10000,500));
           System.out.println(emp1.yearsOfEmployment(10));
          System.out.println(emp1.setEmpName("rezika"));
          System.out.println(emp1.employeeName());








        }
}
