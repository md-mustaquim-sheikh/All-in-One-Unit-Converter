import java.util.Scanner;

public class AllInOneUnitConverter {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean runProgram = true;
            
            while (runProgram) {
                System.out.println("\n===== All-in-One Unit Converter =====");
                System.out.println("1. Length Converter");
                System.out.println("2. Weight Converter");
                System.out.println("3. Temperature Converter");
                System.out.println("4. Exit");
                System.out.print("Choose an option (1-4): ");
                int choice = scanner.nextInt();
                
                switch (choice) {
                    case 1 -> convertLength(scanner);
                    case 2 -> convertWeight(scanner);
                    case 3 -> convertTemperature(scanner);
                    case 4 -> {
                        runProgram = false;
                        System.out.println("Exiting... Thanks you for using converter!");
                    }
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }

    // Length Conversion (meters to kilometers, feet, inches)
    public static void convertLength(Scanner scanner) {
        System.out.print("\nEnter length in meters: ");
        double meters = scanner.nextDouble();
        System.out.println("Kilometers: " + (meters / 1000));
        System.out.println("Feet: " + (meters * 3.28084));
        System.out.println("Inches: " + (meters * 39.3701));
    }

    // Weight Conversion (kilograms to grams, pounds, ounces)
    public static void convertWeight(Scanner scanner) {
        System.out.print("\nEnter weight in kilograms: ");
        double kg = scanner.nextDouble();
        System.out.println("Grams: " + (kg * 1000));
        System.out.println("Pounds: " + (kg * 2.20462));
        System.out.println("Ounces: " + (kg * 35.274));
    }

    // Temperature Conversion (Celsius to Fahrenheit & Kelvin)
    public static void convertTemperature(Scanner scanner) {
        System.out.print("\nEnter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        System.out.println("Fahrenheit: " + ((celsius * 9/5) + 32));
        System.out.println("Kelvin: " + (celsius + 273.15));
    }
}
