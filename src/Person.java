import java.util.Scanner;
public class Person {

        public String surname;
        public String firstName;
        public String street;
        public String zipCode;
        public String city;

        public void initialize() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Surname:");
            surname = scanner.nextLine();
            System.out.println("Enter First Name:");
            firstName = scanner.nextLine();
            System.out.println("Enter Street:");
            street = scanner.nextLine();
            System.out.println("Enter Zip Code:");
            zipCode = scanner.nextLine();
            System.out.println("Enter City:");
            city = scanner.nextLine();
        }

        public void print() {
            System.out.println("Surname: " + surname);
            System.out.println("First Name: " + firstName);
            System.out.println("Street: " + street);
            System.out.println("Zip Code: " + zipCode);
            System.out.println("City: " + city);
        }
    }

