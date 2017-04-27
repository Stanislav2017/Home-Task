package Palindrome;

public class FindPalindrome {

	public static int readingFromTheEnd(int a) {
		String strRightBorder = a + "";
		String intermediateState = "";
		char[] ch = new char[strRightBorder.length()];
		for (int i = 0; i < ch.length/2; i++) {
			ch[i] = strRightBorder.charAt(ch.length - 1 - i);
			ch[ch.length - 1 - i] = strRightBorder.charAt(i);
			intermediateState += ch[i];
		}
		return Integer.parseInt(intermediateState);
	}

	public static void main(String[] args) {

		int firstNumber = 999;
		int lastNumber = 999;
		int leftBorder = 999999;
		int rightBorder = firstNumber * lastNumber;
		
		while (true) {
			if (leftBorder == rightBorder) {
				System.out.println(leftBorder + " " + rightBorder);
			}
			
			if (leftBorder == readingFromTheEnd(rightBorder)) {
				System.out.println(rightBorder + " = " + firstNumber + " * " + lastNumber);
				System.out.println(leftBorder + " = " + leftBorder);
				break;
			}

			if (leftBorder == rightBorder) {
				
				--firstNumber;
				rightBorder = firstNumber * lastNumber;
				System.out.println(rightBorder + " = " + firstNumber + " * " + lastNumber + " " + leftBorder);
			} else {
				--leftBorder;
			}
			
		}
	}
}
