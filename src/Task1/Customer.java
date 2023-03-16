package Task1;

public class Customer {

    private String firstName;
    private String lastName;
    private String username;
    private int id;

    public Customer(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.username = username;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getUsername() {
        return this.username;
    }

    public int getId() {
        return this.id;
    }

    public String toString() {
        return "Name: " + getFirstName() + " " + getLastName() + " - username is: " + getUsername();
    }

}
