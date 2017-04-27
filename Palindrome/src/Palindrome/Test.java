package Palindrome;

public class Test {

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
		int firstNumber_temp = 999;
		int lastNumber = 999;
		int rezult = firstNumber * lastNumber;

		while (!isPaledrom(rezult)) {
			lastNumber=firstNumber_temp;
			while (!isPaledrom(rezult)) {
				if (String.valueOf(firstNumber).length() > 2 && String.valueOf(lastNumber).length() > 2) {
					rezult = firstNumber * lastNumber;
				}else{
					break;
				}
				--lastNumber;
			}
			--firstNumber;
		}
		System.out.println("This is palindrom largest " + rezult + " = " + firstNumber + " * " + lastNumber);
	}

}
