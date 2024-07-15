import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {


        System.out.println("Temperature Converter");
        menu();

    }

    public static void menu()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature value:");
        double temperature = scanner.nextDouble();

        System.out.println("Enter the original unit of measurement:");
        System.out.println("1. Celsius\n2. Fahrenheit\n3. Kelvin");
        int originalUnit = scanner.nextInt();

        switch (originalUnit) {
            case 1:
                // Convert from Celsius
                convertFromCelsius(temperature);
                break;
            case 2:
                // Convert from Fahrenheit
                convertFromFahrenheit(temperature);
                break;
            case 3:
                // Convert from Kelvin
                convertFromKelvin(temperature);
                break;
            default:
                System.out.println("Invalid input. Please enter a number between 1 and 3.");
                break;
        }

        scanner.close();
    }

    public static void convertFromCelsius(double celsius) {
        double fahrenheit = celsius * 9/5 + 32;
        double kelvin = celsius + 273.15;

        System.out.println(celsius + " degrees Celsius is:");
        System.out.println(fahrenheit + " degrees Fahrenheit");
        System.out.println(kelvin + " Kelvin");
        menu();
    }

    public static void convertFromFahrenheit(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5/9;
        double kelvin = (fahrenheit + 459.67) * 5/9;

        System.out.println(fahrenheit + " degrees Fahrenheit is:");
        System.out.println(celsius + " degrees Celsius");
        System.out.println(kelvin + " Kelvin");
        menu();
    }

    public static void convertFromKelvin(double kelvin) {
        double celsius = kelvin - 273.15;
        double fahrenheit = kelvin * 9/5 - 459.67;

        System.out.println(kelvin + " Kelvin is:");
        System.out.println(celsius + " degrees Celsius");
        System.out.println(fahrenheit + " degrees Fahrenheit");
        menu();
    }
}

