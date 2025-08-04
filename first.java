import java.util.Scanner;

public class first {

    // Method for addition
    public static int add(int a, int b) {
        return a + b;
    }

    // Method for subtraction
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Method for multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method for division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        System.out.println("=== Java Console Calculator ===");

        while (keepRunning) {
            // Display menu
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add (+)");
            System.out.println("2. Subtract (-)");
            System.out.println("3. Multiply (*)");
            System.out.println("4. Divide (/)");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting calculator. Goodbye!");
                break;
            }

            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            switch (choice) {
                case 1:
                    int addResult = add(num1, num2);
                    System.out.println("Result: " + addResult);
                    break;
                case 2:
                    int subResult = subtract(num1, num2);
                    System.out.println("Result: " + subResult);
                    break;
                case 3:
                    int mulResult = multiply(num1, num2);
                    System.out.println("Result: " + mulResult);
                    break;
                case 4:
                    double divResult = divide(num1, num2);
                    if (!Double.isNaN(divResult)) {
                        System.out.println("Result: " + divResult);
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }

      
    }
}


