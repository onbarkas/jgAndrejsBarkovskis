package lv.ObjektiAtminja;

import java.util.Objects;

public class Department {
    private String name, company;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        Department that = (Department) o;
        return getName().equals(that.getName()) &&
                getCompany().equals(that.getCompany());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCompany());
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
