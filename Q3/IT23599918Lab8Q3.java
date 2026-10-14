
import java.util.Scanner;

public class IT23599918Lab8Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[6];
        int count = 0;

        while (count < 6) {
            System.out.print("Enter a Positive Number (" 
                    + (count + 1) + "/6): ");
            int number = input.nextInt();

            if (number <= 0) {
                System.out.println(
                    "Error! Please enter only positive numbers");
            } else {
                numbers[count] = number;
                count++;
            }
        }

        int max = numbers[0];

        System.out.println("\nArray Contents:");

        for (int i = 0; i < 6; i++) {
            System.out.print(numbers[i] + " ");

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("\nThe Maximum Number Entered: " + max);

        input.close();
    }
}
