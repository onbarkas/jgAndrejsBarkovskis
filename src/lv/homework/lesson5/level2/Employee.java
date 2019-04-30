package lv.homework.lesson5.level2;

import java.util.Objects;

public class Employee {
    private String contactNumber;
    private double salary;
    private Department department;

    void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                contactNumber.equals(employee.contactNumber) &&
                department.equals(employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contactNumber, salary, department);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "contactNumber='" + contactNumber + '\'' +
                ", salary=" + salary +
                "} " + department +
                '}';
    }
}
