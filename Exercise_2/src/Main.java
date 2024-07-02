import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        //Question '1'
        System.out.println("Question '1'");

        System.out.println("Please enter your role: ");
        String role = input.nextLine();

        if (Objects.equals(role, "admin")) {
            System.out.println("Welcome admin.");
        } else if (Objects.equals(role, "superuser")) {
            System.out.println("Welcome superuser.");
        } else if (Objects.equals(role, "user")) {
            System.out.println("Welcome user.");

        } else {
            System.out.println("incorrect role.");
        }


        //Question '2'
        System.out.println("\nQuestion '2'");

        System.out.println("please enter the 1st number:");
        int num_1 = input.nextInt();
        System.out.println("please enter the 2nd number:");
        int num_2 = input.nextInt();
        System.out.println("please enter the 3rd number:");
        int num_3 = input.nextInt();

        if (num_1 > num_2 && num_1 > num_3) {
            System.out.println("the greatest value is: " + num_1);
        } else if (num_2 > num_1 && num_2 > num_3) {
            System.out.println("the greatest value is: " + num_2);
        } else if (num_3 > num_2 && num_3 > num_1) {
            System.out.println("greatest : " + num_3);
        } else {
            System.out.println("zero.");
        }

        //Question '3'
        System.out.println("\nQuestion '3'");

        System.out.println("Please enter the day number:");
        int day_NUM = input.nextInt();

        switch (day_NUM) {

            case 1:
                System.out.println("Sunday.");
                break;

            case 2:
                System.out.println("Monday.");
                break;

            case 3:
                System.out.println("Tuesday.");
                break;

            case 4:
                System.out.println("Wednesday.");
                break;

            case 5:
                System.out.println("Thursday.");
                break;

            case 6:
                System.out.println("Friday.");
                break;

            case 7:
                System.out.println("Saturday.");
                break;

            default:
                System.out.println("Please enter the correct number.");
        }


        //Question '4'
        System.out.println("\nQuestion '4'");

        System.out.println("Enter your numeric score:");

        int score = input.nextInt();
        if (score <= 100 && score >= 90) {
            System.out.println("Numeric Score: " + score);
            System.out.println("Letter Grade: A.");
        } else if (score <= 89 && score >= 80) {
            System.out.println("Numeric Score: " + score);
            System.out.println("Letter Grade: B.");
        } else if (score <= 79 && score >= 70) {
            System.out.println("Numeric Score: " + score);
            System.out.println("Letter Grade: C.");
        } else if (score <= 69 && score >= 60) {
            System.out.println("Numeric Score: " + score);
            System.out.println("Letter Grade: D.");
        } else if (score < 60) {
            System.out.println("Numeric Score: " + score);
            System.out.println("Letter Grade: F.");
        } else {
            System.out.println("unacceptable value.");
        }


        //Question '5'
        System.out.println("\nQuestion '5'");

        System.out.println("Enter your age: ");

        int age = input.nextInt();

        if (age < 13) {
            System.out.println("You are a Child.");
        } else if (age >= 13 && age < 19) {
            System.out.println("You are a Teenager.");
        } else if (age >= 20) {
            System.out.println("You are an Adult.");
        } else {
            System.out.println("Unaccepted input.");
        }
    }
}