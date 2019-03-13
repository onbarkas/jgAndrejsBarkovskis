package lv.ObjektiAtminja;

import java.util.Objects;

public class Employee {
    private String contactNumber;
    private double salary;
    private Department department;

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.getSalary(), getSalary()) == 0 &&
                getContactNumber().equals(employee.getContactNumber()) &&
                getDepartment().equals(employee.getDepartment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getContactNumber(), getSalary(), getDepartment());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "contactNumber='" + contactNumber + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                '}';
    }
}
