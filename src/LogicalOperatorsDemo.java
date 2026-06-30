import java.util.Scanner;

public class LogicalOperatorsDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Are you an Indian citizen? (true/false): ");
        boolean isIndian = sc.nextBoolean();

        if (age >= 18 && isIndian) {
            System.out.println("Eligible to Vote");
        } else {
            System.out.println("Not Eligible");
        }

        sc.close();
    }
}