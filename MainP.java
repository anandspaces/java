import java.util.Scanner;

public class MainP {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Q1.To print multiplication table of a given number.\nEnter an integer: ");
        int num = myObj.nextInt(); // Use nextInt() to read an integer
		System.out.println("Table of " + num);
        for (int i = 1; i <= 10; i++) {
            System.out.println(num * i);
        }
		System.out.println("Q2.To add two numbers.\nEnter numbers:");
		int num1 = myObj.nextInt();
		int num2 = myObj.nextInt();
		int sum = num1 + num2;
		System.out.println("Sum = " + sum + "\nQ3.To find out day of the week of the given number.");
		System.out.println("Q4.To calculate income tax on a given income considering Indian Laws.\nQ5.To sum first n even number using for loop.\nQ6.To print a pattern.");
		for(int i = 5;i > 0;i--){
			for(int k=5;k>i;k--){
				System.out.print(" ");
			}
			for(int j = i;j > 0;j--){
				
				System.out.print("*");
			}
			System.out.print("\n");
		}
		myObj.close();
    }
}
