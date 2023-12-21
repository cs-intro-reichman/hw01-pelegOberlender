/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int indexOne = Integer.parseInt(args[0]);
		int indexTwo = Integer.parseInt(args[1]);

		int min = Math.min(indexOne,indexTwo);
		int max = Math.max(indexOne,indexTwo);

		int randomNum1 = (int)(Math.random()*(max - min) + min);
		int randomNum2 = (int)(Math.random()*(max - min) + min);
		int randomNum3 = (int)(Math.random()*(max - min) + min);

		System.out.println(randomNum1);
		System.out.println(randomNum2);
		System.out.println(randomNum3);

		int tempRandomMin = Math.min(randomNum1,randomNum2);
		int newRandomMin = Math.min(tempRandomMin,randomNum3);

		System.out.println("The minimal generated number was " + newRandomMin);

	}
}
