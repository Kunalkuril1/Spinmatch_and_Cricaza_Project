package Live_Project;

import java.util.Scanner;

public class Tax_Exclusive {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Take inputs
		System.out.print("Enter Product Amount: ");
		double productAmount = Double.parseDouble(scanner.nextLine());

		System.out.print("Enter GST Rate (%): ");
		double gstRate = Double.parseDouble(scanner.nextLine());

		System.out.print("Enter Cess Rate (%): ");
		double cessRate = Double.parseDouble(scanner.nextLine());

		System.out.print("Enter Discount Rate (%): ");
		double discountRate = Double.parseDouble(scanner.nextLine());

		// Calculations
		double discountAmount = productAmount * discountRate / 100;
		double subtotalAmount = productAmount - discountAmount;
		double gstAmount = subtotalAmount * gstRate / 100;
		double cessAmount = subtotalAmount * cessRate / 100;
		double totalAmount = subtotalAmount + gstAmount + cessAmount;

		// Output
		System.out.printf("\nSubtotal Amount: ₹%.2f\n", subtotalAmount);
		System.out.printf("GST Amount: ₹%.2f\n", gstAmount);
		System.out.printf("Cess Amount: ₹%.2f\n", cessAmount);
		System.out.printf("Total Amount: ₹%.2f\n", totalAmount);

		scanner.close();
	}
}
