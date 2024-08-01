/*1. Write a Java program to create a class called Person with private instance variables name, age. and country. Provide public getter and setter methods to access and modify these variables.*/

public class PersonDetails {
    // Private instance variables
    private char[] name;
    private int age;
    private char[] country;

    // Constructor
    public PersonDetails(char[] name, int age, char[] country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    // Getter for name
    public char[] getName() {
        return name;
    }

    // Setter for name
    public void setName(char[] name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for country
    public char[] getCountry() {
        return country;
    }

    // Setter for country
    public void setCountry(char[] country) {
        this.country = country;
    }

    // Main method to test the Person class
    public static void main(String[] args) {
        // Create char arrays for name and country
        char[] name = {'J', 'o', 'h', 'n', ' ', 'D', 'o', 'e'};
        char[] country = {'U', 'S', 'A'};

        // Create a Person object
        Person person = new Person(name, 30, country);

        // Get and display person details
        System.out.print("Name: ");
        for (char c : person.getName()) {
            System.out.print(c);
        }
        System.out.println("\nAge: " + person.getAge());

        System.out.print("Country: ");
        for (char c : person.getCountry()) {
            System.out.print(c);
        }

        // Modify person details using setter methods
        char[] newName = {'J', 'a', 'n', 'e', ' ', 'D', 'o', 'e'};
        char[] newCountry = {'C', 'a', 'n', 'a', 'd', 'a'};
        person.setName(newName);
        person.setAge(25);
        person.setCountry(newCountry);

        // Display modified person details
        System.out.println("\n\nModified Details:");
        System.out.print("Name: ");
        for (char c : person.getName()) {
            System.out.print(c);
        }
        System.out.println("\nAge: " + person.getAge());

        System.out.print("Country: ");
        for (char c : person.getCountry()) {
            System.out.print(c);
        }
    }
}

/*
Output
Name: John Doe
Age: 30
Country: USA

Modified Details:
Name: Jane Doe
Age: 25
Country: Canada
*/
