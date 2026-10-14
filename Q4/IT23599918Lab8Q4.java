
import java.util.Scanner;

public class IT23599918Lab8Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] studentsArray = new int[8];
        int count = 0;

        while (count < 8) {
            System.out.print("Enter Student ID (" 
                    + (count + 1) + "/8): ");
            int id = input.nextInt();

            if (id <= 0) {
                System.out.println(
                    "Error! Student ID must be greater than zero.");
            } else {
                studentsArray[count] = id;
                count++;
            }
        }

        System.out.print("Enter Student ID to search: ");
        int searchID = input.nextInt();

        boolean found = false;

        for (int i = 0; i < studentsArray.length; i++) {
            if (studentsArray[i] == searchID) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Student is Available");
        } else {
            System.out.println("Student is Not Available");
        }

        input.close();
    }
}
