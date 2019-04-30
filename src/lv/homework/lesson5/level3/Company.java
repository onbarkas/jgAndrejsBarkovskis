package lv.homework.lesson5.level3;

import java.util.Objects;

class Company {
    private String name, registrationNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return name.equals(company.name) &&
                registrationNumber.equals(company.registrationNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, registrationNumber);
    }

    @Override
    public String toString() {
        return "Company{" +
                "company='" + name + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                '}';
    }
}
