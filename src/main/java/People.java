import java.util.ArrayList;

public class People {
    private String name;
    private String lastName;
    private String ID;
    private String address;
    private String contact;

    // Constructors


    public People() {
    }

    public People(String name, String lastName, String ID, String address, String contact) {
        this.name = name;
        this.lastName = lastName;
        this.ID = ID;
        this.address = address;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
