
import java.util.Scanner;

public class IT23599918Lab8Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] myArray = new int[5];
        int[] evenArray = new int[5];
        int evenCount = 0;

        System.out.println("Enter 5 Numbers:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            myArray[i] = input.nextInt();
        }

        System.out.println("\nmyArray Contents:");

        for (int i = 0; i < 5; i++) {
            System.out.print(myArray[i] + " ");
        }

        for (int i = 0; i < 5; i++) {
            if (myArray[i] % 2 == 0) {
                evenArray[evenCount] = myArray[i];
                evenCount++;
            }
        }

        System.out.println("\n\nevenArray Contents:");

        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenArray[i] + " ");
        }

        input.close();
    }
}
