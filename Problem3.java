import java.util.Scanner;

class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first student name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter second student name: ");
        String name2 = sc.nextLine();

        if (name1.equals(name2)) {
            System.out.println("Names are same (case-sensitive comparison)");
        } 
        else {
            System.out.println("Names are different (case-sensitive comparison)");
        }
        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Names are same (case-insensitive comparison)");
        }
        else {
            System.out.println("Names are different (case-insensitive comparison)");
        }
    }
}
