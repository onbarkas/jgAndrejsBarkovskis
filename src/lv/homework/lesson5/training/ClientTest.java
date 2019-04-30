package lv.homework.lesson5.training;

public class ClientTest {
    public static void main(String[] args) {
        ContactInformation contactInformation = new ContactInformation();
        contactInformation.setAddress("Lacplesa 37");
        contactInformation.setCity("Riga");
        contactInformation.setCountry("Latvija");
        contactInformation.setEmail("Jhon@gmail.com");
        contactInformation.setPhoneNumber("+37128773678");

        Client client = new Client();
        client.setFirstName("Jhon");
        client.setLastName("Doe");
        client.setPersonalCode("010101-12345");
        client.setContactInformation(contactInformation);
        System.out.println(client);
    }
}
