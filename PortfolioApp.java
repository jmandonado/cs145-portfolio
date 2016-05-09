/*
	v.20160429
	Use this app to run your implemented version of MyPortfolio. You SHOULD not 
	have to modify this file. Focus on implementing methods in MyPortfolio.java
*/
class PortfolioApp {

	static int[] num_list = {7, 9, 2, 99, 544, 12, 49, 24, 0, -3, 7, 66, 20, 99, 7, 23, 7, 30, 88, 77};
	static char left = 'a';
	static char right = 'z';

	public static void main(String[] args) {
		String n = MyPortfolio.getFirstName();
		System.out.println("<==== Welcome " + n + " ====>");

	/*********************************************************************/
		System.out.println("Printing integer list ==> ");
		MyPortfolio.printIntegerList(num_list);
		
		System.out.println("\n\n");

	/*********************************************************************/
		
		System.out.println("Printing integer list in reverse order ==> ");
		MyPortfolio.printIntegerListReversed(num_list);

		System.out.println("\n\n");

	/*********************************************************************/
		
		System.out.println("Swapping left with right ==> ");
		char result = MyPortfolio.swapLeftWithRight(left, right);

		if (result == 'z') {
			System.out.println("PASSED");
		} else {
			System.out.println("FAILED");
		}


		System.out.println("\n\n");

	/*********************************************************************/

		System.out.println("Swapping first with last ==> ");
		int[] values = MyPortfolio.swapFirstWithLast(num_list);

		if (values[0] == 77 && values[values.length-1] == 7) {
			System.out.println("PASSED");
		} else {
			System.out.println("FAILED");
		}

		System.out.println("\n\n");

	/*********************************************************************/

		System.out.println("Finding the minimum ==> ");
		int min = MyPortfolio.min(num_list);

		if (min == -3) {
			System.out.println("PASSED");
		} else {
			System.out.println("FAILED");
		}

		System.out.println("\n\n");

	/*********************************************************************/
		
		System.out.println("Finding the maximum ==> ");
		int max = MyPortfolio.max(num_list);
		
		if (max == 544) {
			System.out.println("PASSED");
		} else {
			System.out.println("FAILED");
		}

		System.out.println("\n\n");

	/*********************************************************************/
		
		System.out.println("Finding the average ==> ");
		int avg = MyPortfolio.findAverage(num_list);

		if (avg == 58) {
			System.out.println("PASSED");
		} else {
			System.out.println("FAILED");
		}

		System.out.println("\n\n");

	/*********************************************************************/
		
		System.out.println("Finding the frequency ==> ");
		int count = MyPortfolio.frequencyCount(num_list, 7);

		if (count == 4) {
			System.out.println("PASSED");
		} else {
			System.out.println("FAILED");
		}

		System.out.println("\n\n");

	/*********************************************************************/
		
		System.out.println("Reversing the string ==> ");
		String rev = MyPortfolio.reverseString("pots");

		if (rev.equals("stop")) {
			System.out.println("PASSED");
		} else {
			System.out.println("FAILED");
		}

	/*********************************************************************/

		System.out.println("\n\nDone.\n\n");

	}
}