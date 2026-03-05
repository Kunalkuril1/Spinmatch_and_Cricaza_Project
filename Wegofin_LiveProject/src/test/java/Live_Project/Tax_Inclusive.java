package Live_Project;

import java.util.Scanner;

public class Tax_Inclusive {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input from user
		System.out.print("Enter Product Amount: ");
		double productAmount = Double.parseDouble(scanner.nextLine());

		System.out.print("Enter GST Rate (%): ");
		double gstRate = Double.parseDouble(scanner.nextLine());

		System.out.print("Enter Cess Rate (%): ");
		double cessRate = Double.parseDouble(scanner.nextLine());

		// Calculate base amount
		double base = productAmount / (1 + (gstRate / 100) + (cessRate / 100));

		System.out.print("Enter Discount Rate (%): ");
		double discountRate = Double.parseDouble(scanner.nextLine());

		// Calculations
		double discountAmount = base * discountRate / 100;
		double finalAmount = base - discountAmount;
		double gstAmount = finalAmount * gstRate / 100;
		double cessAmount = finalAmount * cessRate / 100;

		// Output results
		System.out.printf("\nBase Amount: ₹%.2f\n", base);
		System.out.printf("Final Amount (after Discount): ₹%.2f\n", finalAmount);
		System.out.printf("GST Amount: ₹%.2f\n", gstAmount);
		System.out.printf("Cess Amount: ₹%.2f\n", cessAmount);
		System.out.printf("Total Payable Amount: ₹%.2f\n", finalAmount + gstAmount + cessAmount);

		scanner.close();

	}

}
