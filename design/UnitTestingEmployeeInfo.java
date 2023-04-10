/*package design;

import org.junit.Test;

import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertEquals;

public class UnitTestingEmployeeInfo {*/
   /* public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.

    }

        public class EmployeeInfoTest {

            private EmployeeInfo employee;


            public void setUp() {
                employee = new EmployeeInfo(123, "John Doe", 50000, "IT", "Manager", "Full Time");
                employee.assignDepartment("Human Resources");
                employee.hireDate(2010);
                employee.benefitLayout();
                employee.setEmployeeManager("Jane Smith");
                employee.setEmployeeGrade("Senior");
            }

            @Test
            public void testEmployeeId() {
                assertEquals(123, employee.employeeId());
            }

            @Test
            public void testEmployeeName() {
                assertEquals("John Doe", employee.employeeName());
            }

            @Test
            public void testAssignDepartment() {
                assertEquals(1, employee.assignDepartment("Marketing"));
                assertEquals("Marketing", employee.getDepartment());
            }

            @Test
            public void testCalculateSalary() {
                assertEquals(50000, employee.calculateSalary());
            }

            @Test
            public void testBenefitLayout() {
                // This test only checks that the method doesn't throw an exception
                employee.benefitLayout();
            }

            @Test
            public void testHireDate() {
                employee.hireDate(2015);
                assertEquals(5, employee.yearsOfEmployment(2020));
            }

            @Test
            public void testYearsOfEmployment() {
                assertEquals(11, employee.yearsOfEmployment(2021));
            }

            @Test
            public void testGetEmployeeManager() {
                assertEquals("Jane Smith", employee.getEmployeeManager());
            }

            @Test
            public void testGetEmployeeGrade() {
                assertEquals("Senior", employee.getEmployeeGrade());
            }

            @Test
            public void testGetEmployeeType() {
                assertEquals("Full Time", employee.getEmployeeType());
            }

            @Test
            public void testSetEmployeeManager() {
                employee.setEmployeeManager("Mark Johnson");
                assertEquals("Mark Johnson", employee.getEmployeeManager());
            }

            @Test
            public void testSetEmployeeGrade() {
                employee.setEmployeeGrade("Junior");
                assertEquals("Junior", employee.getEmployeeGrade());
            }

            @Test
            public void testSetEmployeeType() {
                employee.setEmployeeType("Part Time");
                assertEquals("Part Time", employee.getEmployeeType());
            }

            @Test
            public void testGetDepartment() {
                assertEquals("Human Resources", employee.getDepartment());
            }

            @Test
            public void testSetDepartment() {
                employee.setDepartment("Finance");
                assertEquals("Finance", employee.getDepartment());
            }

            @Test
            public void testToString() {
                String expected = "Employee ID: 123\nEmployee Name: John Doe\nEmployee Department: Human Resources\nEmployee Salary: 50000\nEmployee Manager: Jane Smith\nEmployee Grade: Senior\nEmployee Type: Full Time";
                assertEquals(expected, employee.toString());
            }

            @Test
            public void testDefaultConstructor() {
                EmployeeInfo defaultEmployee = new EmployeeInfo();
                assertEquals(0, defaultEmployee.employeeId());
                assertNull(defaultEmployee.employeeName());
                assertEquals(0, defaultEmployee.calculateSalary());
                assertNull(defaultEmployee.getDepartment());
                assertNull(defaultEmployee.getEmployeeManager());
                assertNull(defaultEmployee.getEmployeeGrade());
                assertNull(defaultEmployee.getEmployeeType());
            }
        }
    }

*/