package ie.atu;
import java.util.Scanner;
public class UsingTryCatch {
    public static void main(String[] args) {
        while(true) {
            try {
                System.out.println("Please enter a number between 0 - 9 :");
                Scanner myscan = new Scanner(System.in);

                //Read user input as a string
                String input = myscan.nextLine();

                //Parse the input to an integer
                int myNum = Integer.parseInt(input);

                //Check if the number is between 0 and 9
                if (myNum >= 0 && myNum <= 9) {
                    System.out.println("You entered: " + myNum);
                    break;
                } else {
                    System.out.println("Not a valid Number");
                }
            } catch (NumberFormatException e) {
                System.out.println("Not a valid Number");


            }
        }

    }
}