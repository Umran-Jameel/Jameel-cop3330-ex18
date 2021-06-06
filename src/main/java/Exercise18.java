import java.util.*;

public class Exercise18 {
    public static void main(String[] args) {
        System.out.printf("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.\nYour choice: ");

        Scanner in = new Scanner(System.in);
        String temp = in.nextLine();

        String prompt = (temp.equals("C") || temp.equals("c")) ? "Please enter the temperature in Fahrenheit: " : "please enter the temperature in Celsius: ";
        System.out.print(prompt);

        String value = in.nextLine();
        int temperature = Integer.parseInt(value);

        String format;

        if (temp.equals("F") || temp.equals("f"))
        {
            format = "Celsius";
            temperature = (temperature * (9/5)) + 32;
        }
        else
        {
            format = "Fahrenheit";
            temperature = (temperature - 32) * (5/9);
        }

        System.out.printf("The temperature in %s is %d.", format, temperature);
    }
}
