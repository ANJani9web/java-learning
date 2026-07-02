import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc1.nextInt();
        if(number>0){
            System.out.println("The number is positive.");
        } else if(number<0){
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        sc.close();
        sc1.close();
    }
    
}
