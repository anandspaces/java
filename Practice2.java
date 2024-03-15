public class Practice2{
	public static void main(String [] args){
		boolean isJavaFun = true;
		boolean isFishTasty = false;
		System.out.println(isJavaFun);
		System.out.println(isFishTasty);
		
		int x = 10;
		int y = 9;
		System.out.println(x > y);
		
		int x1 = 10;
		System.out.println(x1 == 10);
		System.out.println(10 == 15);
		
		int myAge = 25;
		int votingAge = 18;
		System.out.println(myAge >= votingAge);
		if (myAge >= votingAge) {
			System.out .println("Old enough to vote!");
		}
		else {
			System.out.println("Not old enough to vote.");
		}
		int time = 22;
		if (time < 10) {
			System.out.println("Good Morning.");
		}
		else if (time < 18) {
			System.out.println("Good day.");
		}
		else {
			System.out.println("Good Evening.");
		}
		int time1 = 20;
		String result = (time1 < 18) ? "Good Day." : "Good Evening.";
		System.out.println(result);
		
		int day = 4;
		switch (day) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Looking forward to the Weekend");
		}
		int l = 0;
		while (l < 5) {
			System.out.println(l);
			l++;
		}
		int m = 0;
		do {
			System.out.println(m);
			m++;
		} while (m < 5);
		for (int k = 0; k < 5; k++) {
			System.out.println(k);
		}
		for (int i = 1; i <= 2; i++) {
			System.out.println("Outer: " + i);
			for (int j = 1; j <= 3; j++) {
				System.out.println("Inner: " + j);
			}
		}
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String n : cars) {
			System.out.println(n);
		}
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				break;
			}
			System.out.println(i);
		}
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				continue;
			}
			System.out.println(i);
		}
		int i1 = 0;
		while (i1 < 10 ) {
			System.out.println(i1);
			i1++;
			if (i1 == 4){
				break;
			}
		}
		int i2 = 0;
		while (i2 < 10) {
			if (i2 == 4) {
				i2++;
				continue;
			}
			System.out.println(i2);
			i2++;
		}
		// int[] myNum = {10, 20, 30, 40};
		String[] cars1 = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(cars1[0]);
		cars1[0] = "Ope1";
		System.out.println(cars1[0]);
		System.out.println(cars1.length);
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		int[][] myNumbers = {{1,2,3,4},{5,6,7}};
		System.out.println(myNumbers[1][2]);
		myNumbers[1][2] = 9;
		System.out.println(myNumbers[1][2]);
		for(int i = 0;i < myNumbers.length; ++i) {
			for(int j = 0; j < myNumbers[i].length; ++j) {
				System.out.println(myNumbers[i][j]);
			}
		}
	}
}