import java.util.*;

public class funcGreatestNum {
    public static void greatestNum(int num1, int num2) {

        if (num1 > num2) {
            System.out.println(num1 + " Number is Greater than " + num2 + " Number ");
        } else {
            System.out.println(num2 + " Number is Greater than " + num1 + " Number ");
        }
    }

    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        num1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        num2 = sc.nextInt();

        greatestNum(num1, num2);
    }
}