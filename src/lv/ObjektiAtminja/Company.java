package lv.ObjektiAtminja;

import java.util.Objects;

public class Company {
    private String company, registrationNumber;

    public String getName() {
        return company;
    }

    public void setName(String name) {
        this.company = company;
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
        return getName().equals(company.getName()) &&
                getRegistrationNumber().equals(company.getRegistrationNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getRegistrationNumber());
    }

    @Override
    public String toString() {
        return "Company{" +
                "company='" + company + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                '}';
    }
}
