import java.util.Scanner;
import java.util.InputMismatchException;

public class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter student age: ");
            int age = sc.nextInt();

            System.out.println("Student age is: " + age);
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }
        catch (ArithmeticException e) {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}
