
/**
 * Jacob Padgett Bro Jones CIT 260 DIGITAL COPY OF THE TEXTBOOK Week 7
 * Assignment
 * <ul>
 * <li>Name your class file A7</li>
 * <li>Place the folders for these projects into a single zip folder.</li>
 * <li>Submit the zip folder before the due date.</li>
 * </ul>
 */

public class A7 {

	public static void main(String[] args) {

		// ******************** INTRODUCE PROGRAM PART 1 ********************/
		System.out.println("Part 1 of 2\nUpon following the requests of the program, "
				+ "it will display the \n\taverage \n\tminimum \n\tmaximum \nof the "
				+ "positive whole numbers entered");

		// CREATE INSTANCE AND PASS THE INPUT
		ArrStats theArray = new ArrStats();

		// CALL AND DISPLAY THE AVERAGE METHOD WHILE PASSING THE USERS INPUT AS
		// PARAMETERS
		System.out.format("Average: %.2f\n", Average(valuesInt));

		// CALL AND DISPLAY THE MINIMUM METHOD WHILE PASSING THE USERS INPUT AS
		// PARAMETERS
		System.out.format("Minimum: %.2f\n", min(valuesInt));

		// CALL AND DISPLAY THE MAXIMUM METHOD WHILE PASSING THE USERS INPUT AS
		// PARAMETERS
		System.out.format("Maximum: %.2f\n", max(theArray.max(valuesInt)));

	}

}
