public class Main {

	public static void main(String[] args) {
		
		System.out.println("--SAMSUNG--");
		Phone samsung = new Phone();
		samsung.printPhone();
		samsung.printPerformance();
		samsung.caltotalPrice();
		samsung.calInstallment();
		
		System.out.println();
		
		System.out.println("--IPHONE--");
		Phone iphone = new Phone();
		iphone.printPhone();
		iphone.printPerformance();
		iphone.caltotalPrice();
		iphone.calInstallment();
	}     
}
