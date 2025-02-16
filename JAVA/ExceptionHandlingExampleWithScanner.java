import java.util.Scanner;

public class ExceptionHandlingExampleWithScanner {

    public static void checkAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("Age is less than 18, not allowed.");
        } else {
            System.out.println("Age is valid: " + age);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("Entering the try block...");
            
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            
            checkAge(age);
            
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid number.");
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed: Closing resources.");
            scanner.close(); 
        }
    }
}