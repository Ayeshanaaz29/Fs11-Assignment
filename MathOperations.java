public class MathOperations {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three doubles
    public double add(double a, double b, double c) {
        return a + b + c;
    }

    // Method to concatenate two strings
    public String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        // Adding two integers
        int sum1 = math.add(10, 20);
        System.out.println("Sum of integers: " + sum1);

        // Adding three doubles
        double sum2 = math.add(10.5, 20.5, 30.5);
        System.out.println("Sum of doubles: " + sum2);

        // Concatenating two strings
        String result = math.add("Hello, ", "world!");
        System.out.println("Concatenated string: " + result);
    }
}
