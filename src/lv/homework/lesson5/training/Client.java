package lv.homework.lesson5.training;

public class Client {
    private String firstName, lastName, personalCode;
    private ContactInformation contactInformation;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }

    public ContactInformation getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(ContactInformation contactInformation) {
        this.contactInformation = contactInformation;
    }

    @Override
    public String toString() {
        return "Client information{" +
                "first name " + firstName +
                ", last name " + lastName +
                ", personal code= " + personalCode +
                ", " + contactInformation +
                '}';
    }
}
