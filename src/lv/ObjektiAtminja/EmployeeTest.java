package lv.ObjektiAtminja;

public class EmployeeTest {
    public static void main(String[] args) {
        Company mainCompany = new Company();
        mainCompany.setName("IBM tehnologies");
        mainCompany.setRegistrationNumber("21212344");

        Department department = new Department();
        department.setName("Sales department");
        department.setCompany(mainCompany.getName());

        Employee employee = new Employee();
        employee.setContactNumber("245657868");
        employee.setSalary(45000.00);
        employee.setDepartment(department);

        System.out.println(mainCompany);
        System.out.println(department);
        System.out.println(employee);

    }
}
