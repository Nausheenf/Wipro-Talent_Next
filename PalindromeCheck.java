import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int reversedNum = 0;
        int digitCount = 0;
        int oddDigitCount = 0;
        int evenDigitCount = 0;
        int tempNum = num;

        while (tempNum != 0) {
            int digit = tempNum % 10;
            if (digit % 2 != 0) {
                oddDigitCount++;
            } else {
                evenDigitCount++;
            }
            digitCount++;
            tempNum /= 10;
        }

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        System.out.println("Total digits: " + digitCount);
        System.out.println("Odd digits: " + oddDigitCount);
        System.out.println("Even digits: " + evenDigitCount);
        System.out.println(originalNum + (originalNum == reversedNum ? " is a palindrome." : " is not a palindrome."));

        sc.close();
    }
}
