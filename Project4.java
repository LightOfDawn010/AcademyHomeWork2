package HomeWorkOfLecture2;
import java.util.Scanner;

public class Project4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter First Numbers : ");
        int num = scanner.nextInt();
            System.out.print("Please Enter Second Numbers : ");
        int num2 = scanner.nextInt();
            System.out.print("Please Enter Third Numbers : ");
        int num3 = scanner.nextInt();
            System.out.println("Entered Numbers Are: " + num + " " + num2 + " " + num3);
        int num4 = ((num + num2 + num3) / 3);

        System.out.println("Sorting the numbers...");
        System.out.println("Smallest Number : " + checkSmallest(num, num2, num3));
        System.out.println("Middle Number : " + checkMiddle(num, num2, num3));
        System.out.println("Biggest Number : " + checkBiggest(num, num2, num3));
        System.out.println("Calculating Average of numbers...");

        int avarageNum = num4;
            System.out.println("Average of this numbers are : " + num4);
    }
        public static int checkBiggest(int firstNum, int secondNum, int thirdNum) {
            if (firstNum >= secondNum && firstNum >= thirdNum) {
                return firstNum;
            } else if (secondNum >= firstNum && secondNum >= thirdNum) {
                return secondNum;
            } else
                return thirdNum;
        }
    public static int checkMiddle(int firstNum, int secondNum, int thirdNum) {
        if (firstNum >= secondNum && firstNum <= thirdNum ||
                firstNum <= secondNum && firstNum >= thirdNum) {
            return firstNum;
        } else if (secondNum >= firstNum && secondNum <= thirdNum ||
                secondNum <= firstNum && secondNum >= thirdNum) {
            return secondNum;
        } else
            return thirdNum;
    }
    public static int checkSmallest(int firstNum, int secondNum, int thirdNum) {
        if (firstNum <= secondNum && firstNum <= thirdNum) {
            return firstNum;
        } else if (secondNum <= firstNum && secondNum <= thirdNum) {
            return secondNum;
        } else
            return thirdNum;
    }
    }