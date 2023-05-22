
import java.util.Scanner;

public class Staff extends Person {

    public String education;
    public String position;

    public void initialize1() {
        super.initialize();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Education:");
        education = scanner.nextLine();
        System.out.println("Enter Position:");
        position = scanner.nextLine();
    }

    public void print1() {
        super.print();
        System.out.println("Education: " + education);
        System.out.println("Position: " + position);
    }

}
