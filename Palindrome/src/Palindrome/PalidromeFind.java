package Palindrome;

public class PalidromeFind {

	public static boolean isPaledrom(int rezult) {
		String palidrom = rezult + "";
		boolean isPalidrom = true;
		for (int i = 0; i < palidrom.length() / 2; i++) {
			if (palidrom.charAt(i) != palidrom.charAt(palidrom.length() - 1 - i) && isPalidrom) {
				isPalidrom = false;
			}
		}
		return isPalidrom;
	}

	public static void main(String[] args) {

		int firstNumber = 999;
		int lastNumber = 999;
		int rezult = firstNumber * lastNumber;
		int maxValue = 0;
		int firstMax = 0;
		int lastMax = 0;
		int n = 2;

		while (String.valueOf(firstNumber).length() > n) {
			while (String.valueOf(lastNumber).length() > n) {
				rezult = firstNumber * lastNumber;
				if (isPaledrom(rezult)) {
					if (rezult > maxValue) {
						maxValue = rezult;
						lastMax = lastNumber;
						firstMax = firstNumber;
					}
				}
				--lastNumber;
			}
			--firstNumber;
			lastNumber = 999;
		}
		System.out.println("The Palidrim number is " + maxValue + " = " + firstMax + " * " + lastMax);

		// while (!isPaledrom(rezult)) {
		//
		// if (String.valueOf(firstNumber).length() > 2) {
		// --firstNumber;
		// --lastNumber;
		// } else {
		// System.out.println("Palidrom don't exist");
		// break;
		// }
		// rezult = firstNumber * lastNumber;
		// }
		// System.out.println("This is palindrom largest " + rezult + " = " +
		// firstNumber + " * " + lastNumber);
	}

}
