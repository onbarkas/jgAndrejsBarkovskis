package lv.homework.lesson5;

import java.util.Objects;

public class Company {
    private String name, registrationNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Company)) return false;
        Company company = (Company) o;
        //neizmantot geterus šeit
        return getName().equals(company.getName()) &&
                getRegistrationNumber().equals(company.getRegistrationNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getRegistrationNumber());
    } //neizmantot geterus šeit

    @Override
    public String toString() {
        return "Company{" +
                "company='" + name + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                '}';
    }
}
