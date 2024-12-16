package models;

public class Human {
    public String firstName;
    public String lastName;
    public String middleName;
    public Sex sex;

    public String getFormatted() {
        return firstName + " " + middleName + " " + lastName;
    }
}
