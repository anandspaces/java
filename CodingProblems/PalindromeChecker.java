package CodingProblems;
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().trim();
        System.out.print(canMakePalindrome(str));

        scanner.close();
    }

    public static String canMakePalindrome(String str) {
        if (str.equals(new StringBuilder(str).reverse().toString())) {
            return "yes";
        }

        for (int i = 0; i < str.length(); i++) {
            String modifiedStr = str.substring(0, i) + str.substring(i + 1);
            if (modifiedStr.equals(new StringBuilder(modifiedStr).reverse().toString())) {
                return "yes";
            }
        }

        return "no";
    }
}