import java.util.Scanner;

public class AstronautAccounting {
    public static void main(String[] args) {
        int hours;
        double payRate;
        Scanner keyboard = new Scanner(System.in);

        // Creates a Payroll object named pr

        for (int i = 0; i < pr.NUM_ASTRONAUTS; i++) {
            System.out.print("Enter the hours worked by astronaut " +

                             // Calls this instance method from Payroll for pr.
                             "number " + pr.getAstronautIDAt(i) + ": ");

            hours = keyboard.nextInt();
            while (hours < 0) {
                System.out.print("ERROR: Enter 0 or greater for hours: ");
                hours = keyboard.nextInt();
            }

            System.out.print("Enter the hourly pay rate for astronaut " +

                             // Calls this instance method from Payroll for pr.
                             "number " + pr.getAstronautIDAt(i) + ": ");

            payRate = keyboard.nextDouble();
            while (payRate < 15.0) {
                System.out.print("ERROR: Enter 15.00 or greater for pay rate: ");
                payRate = keyboard.nextDouble();
            }

            // Sets these two values using instance methods in Payroll for pr.

        }

        System.out.println("\nPAYROLL DATA");
        System.out.println("============");
        for (int i = 0; i < pr.NUM_ASTRONAUTS; i++) {

            // Calls these instance methods from Payroll for pr.
            System.out.println("Astronaut ID: " + pr.getAstronautIDAt(i));
            System.out.printf("Gross pay: $%,.2f\n", pr.getGrossPay(i));

        }
    }
}
