package HomeWorkOfLecture2;

import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Enter How many days are there this year :");
                int i = scanner.nextInt();

          if (i == 365) {
            System.out.println("This year is Common");
        } else if (i == 366) {
            System.out.println("This year is Leap");
        } else
            System.out.println("You Entered The Wrong Number");

    }
}
