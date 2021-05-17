package factorial;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number:");

		int fNum = scanner.nextInt();
		scanner.nextLine();
		scanner.close();

		Integer check = working(fNum);
		if (check != null) {
			System.out.println(check);
		}
		else {
		System.out.println("Not a factorial");
		}
	}

	public static Integer working(int fNum) {
		int factorial = 1;
		int num = fNum;

		while (num != 1) {
			factorial++;
			if ((num / factorial) * factorial == num) {
				num = num / factorial;
				continue;
			}
			return null;
		}
		return factorial;

	}

}
