/****************
 * Jacob Padgett
 * Bro Jones
 * CIT 260
 * Assignment 5.10
 * Find numbers divisible by 5 & 6 between 100 & 1,000 (10 numbers per line separated by one space.
 ****************/
public class A5dot10 {

	public static void main(String[] args) {
		final int NUM_IN_LINE = 10;
		System.out.println("This is a display of all the numbers from 100 to 1,000, "
				+ "ten per line, that are divisible by 5 and 6. Numbers are separated by exactly one space.\n");
		int count=0;
		for (int i = 100; i <= 1000; i++) {
			if (i % 5 == 0 && i % 6 == 0) {
				count++;
				if (count % NUM_IN_LINE == 0) 
					System.out.println(i);
				else
					System.out.print(i + " ");		
			}
		}
	}
}
