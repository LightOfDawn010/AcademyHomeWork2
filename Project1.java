package HomeWorkOfLecture2;
import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Please Enter Number : ");
                int i = scanner.nextInt();

          if (i > 0) {
            System.out.println("Number is Positive");
        } else if (i < 0) {
            System.out.println("Number is Negative");
        } else  {
            System.out.println("Number equals to zero");
        }
    }
}
