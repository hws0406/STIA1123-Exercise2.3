import java.util.Scanner;

public class Phone {
	
		String Model, Color, operatingSystem;
		int price, quantity;
		double memory;
		
		Scanner s = new Scanner(System.in);
		
		void printPhone() {
			System.out.println("Enter Model: ");
			String m = s.nextLine();
			System.out.println("Enter Color: ");
			String c = s.nextLine();
			System.out.println("Enter OperatingSystem: ");
			String o = s.nextLine();
			System.out.println("Price: ");
			int p = s.nextInt();
			System.out.println("Enter Memory: ");
			double g = s.nextDouble();
			
			System.out.println("\nModel: " + m);
			System.out.println("color: " + c);
			System.out.println("Operating System: " + o);
			System.out.println("Price: RM" + p);
			System.out.println("Weight: " + g + "gb");
		}
		
		void printPerformance() {
			System.out.println("\n-PERFORMANCE-");
			double ramusing, totalram;
			System.out.println("Please enter total RAM: ");
			totalram = s.nextDouble();
			System.out.println("Please enter RAM using: " );
			ramusing = s.nextDouble();
			double ram = totalram - ramusing;
			System.out.println("Total RAM available: " + ram + "gb");
			
			System.out.print("Performance: ");
			if(ram < 2)
			System.out.println("Poor");
			
			else if(ram < 4)
			System.out.println("Average");
			
			else if(ram < 8)
			System.out.println("Good");
			
			else if(ram < 12)
			System.out.println("Excellent");
		}
		
		void caltotalPrice() {
			System.out.println("\n-TOTAL PRICE-");
			System.out.println("Enter Price: ");
			int p = s.nextInt();
			System.out.println("Enter Quantity: ");
			int q = s.nextInt();
			int t = p * q;
			System.out.println("Total price: RM" + t);
		}
		
		void calInstallment() {
			System.out.println("\n-INSTALLMENT-");
			System.out.println("Enter Price: ");
			int p = s.nextInt();
			System.out.println("Enter Months: ");
			int m = s.nextInt();
			int i = p / m;
			System.out.println("Payment /Month: RM" + i);
		}
}
