/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int minIndex = Integer.parseInt(args[0]);
		int maxIndex = Integer.parseInt(args[1]);

		int randomNum1 = (int)(Math.random()*(maxIndex - minIndex) + minIndex);
		int randomNum2 = (int)(Math.random()*(maxIndex - minIndex) + minIndex);
		int randomNum3 = (int)(Math.random()*(maxIndex - minIndex) + minIndex);

		System.out.println(randomNum1);
		System.out.println(randomNum2);
		System.out.println(randomNum3);

		int tempMid = Math.min(randomNum1,randomNum2);
		int newMin = Math.min(tempMid,randomNum3);

		System.out.println("The minimal generated number was " + newMin);

	}
}
