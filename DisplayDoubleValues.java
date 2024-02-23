
import java.util.Scanner;

public class DisplayDoubleValues {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] doubleValues = new double[20];

        System.out.println("Enter up to 20 double values. Enter a non-double value to stop.");

        for (int count = 0; count < 20; count++) {
            System.out.print("Enter double value #" + (count + 1) + ": ");

            if (scanner.hasNextDouble()) {
                doubleValues[count] = scanner.nextDouble();
            } else {

                break;
            }
        }

        // Display the entered double values
        System.out.println("\nEntered double values:");
        for (double value : doubleValues) {
            if (value != 0.0) {
                System.out.println(value);
            }
        }
    }
}
