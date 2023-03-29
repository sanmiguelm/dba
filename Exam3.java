package dba_exam;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exam3 {

	private static final DecimalFormat dfZero = new DecimalFormat("0.00");
	
	public static void main(String []args) {
		System.out.println("Enter the number of newly hired males: ");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		Integer hiredMales = 0;;
		Integer hiredFemales = 0;;
		Integer permanentMales = 0;
		Integer permanentFemales = 0;
		Integer resignedMales = 0;
		Integer resignedFemales = 0;
		try {
			hiredMales = Integer.parseInt(scanner.nextLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Enter the number of newly hired females: ");
		try {
			hiredFemales = Integer.parseInt(scanner.nextLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Enter the number of permanent position males: ");
		try {
			permanentMales = Integer.parseInt(scanner.nextLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Enter the number of permanent position females: ");
		try {
			permanentFemales = Integer.parseInt(scanner.nextLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Enter the number of resigned males: ");
		try {
			resignedMales = Integer.parseInt(scanner.nextLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Enter the number of resigned females: ");
		try {
			resignedFemales = Integer.parseInt(scanner.nextLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("===");
		System.out.println("Thank you for the Information");
		System.out.println("===");
		System.out.println("Here is the Summary !!!");
		int hiredTotal = hiredMales + hiredFemales;
		System.out.println("Number of hired employee = " + hiredTotal);
		double hiredMalesPercentage = (hiredMales / (double) hiredTotal) * 100;
		System.out.println("Male = " + dfZero.format(hiredMalesPercentage) + "%");
		double hiredFemalesPercentage = (hiredFemales / (double) hiredTotal) * 100;
		System.out.println("Female = " + dfZero.format(hiredFemalesPercentage) + "%");
		System.out.println();
		
		int permanentTotal = permanentMales + permanentFemales;
		System.out.println("Number of Permanent Employee = " + permanentTotal);
		double permanentMalesPercentage = (permanentMales / (double) permanentTotal) * 100;
		System.out.println("Male = " + dfZero.format(permanentMalesPercentage) + "%");
		double permanentFemalesPercentage = (permanentFemales / (double) permanentTotal) * 100;
		System.out.println("Female = " + dfZero.format(permanentFemalesPercentage) + "%");
		System.out.println();
		
		int resignedTotal = resignedMales + resignedFemales;
		System.out.println("Number of Resigned Employee = " + resignedTotal);
		double resignedMalesPercentage = (resignedMales / (double) resignedTotal) * 100;
		System.out.println("Male = " + dfZero.format(resignedMalesPercentage) + "%");
		double resignedFemalesPercentage = (resignedFemales / (double) resignedTotal) * 100;
		System.out.println("Female = " + dfZero.format(resignedFemalesPercentage) + "%");
		System.out.println();
		
	}
	
}
