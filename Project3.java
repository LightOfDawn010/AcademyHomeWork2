package HomeWorkOfLecture2;
import java.util.Scanner;

public class Project3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Please Enter Number : ");
        int i = scanner.nextInt();

        if(i % 2 == 0)
            System.out.println("Your number is even \"კენტი\" ");
        else
            System.out.println("Your number is odd \"ლუწი\" ");
    }
}
