package lv.homework.lesson5.level3;

public class EmployeeTest {
    public static void main(String[] args) {
        Company mainCompany = new Company();
        mainCompany.setName("IBM tehnologies");
        mainCompany.setRegistrationNumber("RG45245987");

        Department department = new Department();
        department.setName("Sales department");
        department.setCompany(mainCompany);

        Employee employee = new Employee();
        employee.setContactNumber("+371 28465328");
        employee.setSalary(3500.00);
        employee.setDepartment(department);

        System.out.println(mainCompany);
        System.out.println(department);
        System.out.println(employee);

    }
}
