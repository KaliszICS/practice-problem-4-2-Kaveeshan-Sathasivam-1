/*File: Practice Problem 4-2
Author: Kaveeshan Sathasivam
Date Created: Apr 9, 2026
Date Modified: Apr 9, 2026
 */
public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String repeatLetter(char letter, int times) {
        String result = "";

        for (int i = 0; i < times; i++) {
            result = result + letter;
        }

        return result;
    }

    public static int countLetter(String text, char letter) {
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == letter) {
                count++;
            }
        }

        return count;
    }

    public static int evenSum(int num1, int num2) {
        int sum = 0;

        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) { 
                sum += i;
            }
        }

        return sum;
    }

}
