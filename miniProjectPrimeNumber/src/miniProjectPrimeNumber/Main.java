package miniProjectPrimeNumber;

public class Main {

	public static void main(String[] args) {
		int number = 25;
		int remainder = number % 2;

		if (remainder != 0 || number > 0) {
			System.out.println("Sayı asaldır.");
		} else if (remainder == 0 || number > 0) {
			System.out.println("Sayı asal değildir.");
		} else {
			System.out.println("Girilen sayı pozitif değildir.");
		}

		System.out.println(remainder);

	}

}