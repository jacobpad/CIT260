
/****************
 * Jacob Padgett
 * Bro Jones
 * CIT 260
 * Assignment 4.23
 * Payroll 
 ****************/

import java.util.Scanner;

public class A4dot23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// PROMPT FOR NAME
		System.out.print("Enter employee's last name: ");
		String employeeName = input.nextLine();

		// PROMPT FOR HOURS WORKED
		System.out.print("Enter number of hours worked in a week: ");
		double hoursWorked = input.nextDouble();

		// PROMPT FOR PAY RATE
		System.out.print("Enter employee's pay rate: ");
		double payRate = input.nextDouble();

		// PROMPT FOR FEDERAL THEFT PERCENTAGE WITHHOLD
		System.out.print("Enter the Federal Tax withholding rate (e.g., .2 for 20%): ");
		double fedTax = getTax();

		// PROMPT FOR MANDATORY STATE DONATION
		System.out.print("Enter the State Tax withholding rate (e.g., .2 for 20%): ");
		double stateTax = getTax();

		/* CALCULATE & DISPLAY RESULTS */
		// NAME
		System.out.println("\n=======================================");
		System.out.println("Employee Name: " + employeeName);
		System.out.println("=======================================");

		// HOURS
		System.out.format("Hours Worked: %6.2f\r\n", hoursWorked);

		// PAY RATE
		System.out.format("Hourly Pay Rate: $%6.2f\r\n", payRate);

		// GROSS PAY
		double gross = hoursWorked * payRate;
		System.out.format("Gross Pay: $%7.2f", gross);
		System.out.println("\n=======================================");

		// DEDUCTIONS - FED, STATE & TOTAL
		double fedAmmount = fedTax * gross;
		double stateAmmount = stateTax * gross;
		double totalTaxes = fedAmmount + stateAmmount;
		System.out.println("Deductions:");
		System.out.format("\tFederal Tax: $%6.2f", fedAmmount);
		System.out.format("\n\tState Tax: $%6.2f", stateAmmount);
		System.out.format("\n\tTotal Deductions: $%6.2f", totalTaxes);

		// NET PAY
		System.out.println("\n=======================================");
		double net = gross - totalTaxes;
		System.out.format("Net Pay: $%7.2f", net);
		System.out.println("\n=======================================");
	}

	public static double getTax() {
		Scanner input = new Scanner(System.in);
		double percentage = input.nextDouble();
		if (percentage > 1) {
			System.out.println("\n*******************\nError: Please enter a percentage "
					+ "like this: .14 for 14% or .06 for 6%\nThank you, now please, try again."
					+ "\n*******************");
			System.out.print("Enter the tax rate (e.g., .2 for 20%): ");
			getTax();
		}
		return percentage;
	}
}
