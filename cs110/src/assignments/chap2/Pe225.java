package assignments.chap2;

import java.util.Scanner;

public class Pe225 {

	/**
	 Prints a payroll statement
	 */
	public static void main(String[] args) {
		
	String name;
	double hoursWorked;
	double hourlyWage;
	double grossPay;
	double fedTaxRate;
	double fedTax;
	double stateTaxRate;
	double stateTax;
	double totalTax;
	double netPay;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter employee's name: ");
	name = input.next();
	System.out.println("Enter the number of hours worked in a week: ");
	hoursWorked = input.nextDouble();
	System.out.println("Enter the hourly wage: ");
	hourlyWage = input.nextDouble();
	System.out.println("Enter the Federal tax withholding rate (as a decimal): ");
	fedTaxRate = input.nextDouble();
	System.out.println("Enter the State tax withholding rate (as a decimal): ");
	stateTaxRate = input.nextDouble();
	
	grossPay = hoursWorked * hourlyWage;
	fedTax = grossPay * fedTaxRate;
	stateTax = grossPay * stateTaxRate;
	totalTax = fedTax + stateTax;
	netPay = grossPay - totalTax;
	
	System.out.println("\nEmployee name: " + name);
	System.out.println("Hours Worked: " + hoursWorked);
	System.out.println("Pay Rate: $" + hourlyWage);
	System.out.println("Gross Pay: $" + grossPay);
	System.out.println("Deductions:");
	System.out.println("   Federal Withholding (" + fedTaxRate * 100 + "%): $" + fedTax);
	System.out.println("   State Withholding (" + stateTaxRate * 100 + "%): $" + stateTax);
	System.out.println("   Total Deduction: $" + totalTax);
	System.out.println("Net Pay: $" + netPay);
	
	}

}
