public class MultipleTryCatchExample {
    public static void main(String[] args) {
        
        // Handling division by zero
        try {
            int a = 20, b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }

        // Handling an invalid array access
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Accessing index 5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds.");
        }

        // Handling string parsing to an integer
        try {
            String value = "100A";
            int num = Integer.parseInt(value);
            System.out.println("Converted number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Error: Cannot convert string to number.");
        }

        // Handling file access error
        try {
            java.io.FileReader file = new java.io.FileReader("non_existent_file.txt");
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }

        System.out.println("Program execution continues...");
    }
}
