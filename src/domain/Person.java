package domain;

import java.util.Scanner;

public class Person implements Comparable<Person> {
    private String firstName;

    private String lastName;

    public Person() {

        Scanner stringInput = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter firstname: ");

                firstName = stringInput.nextLine();

                System.out.print("Enter lastname: ");

                lastName = stringInput.nextLine();

                break;

            } catch (RuntimeException e) {
                System.out.println("an error occurred! please try again");
            }

        }

    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

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


    @Override
    public int compareTo(Person o) {
        return firstName.compareTo(o.firstName);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }


}
