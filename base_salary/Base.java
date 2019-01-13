package base_salary;

public class Base {
	
	
	public static double computeIncome(double salesAmount) {
		System.out.println("         " + "$" + salesAmount);
		return salesAmount;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double maximumAmount = 0;
		double maxFromPreviousTier = 0;
		double maxSecondTier = 0;
		double sales = 1000;
		
		System.out.println("Sales" + "           " + "Income");
		
		for (int i = 0; i <= 20; i++) {
			
			if (sales < 5001) {
				System.out.print("$" + sales);
				computeIncome((sales * 0.08) + 5000);
				sales += 1000;
			}
			
			else if (sales < 10001) {
				maximumAmount = 5000;
				maxFromPreviousTier = 5000;
				System.out.print("$" + sales);
				computeIncome( (maxFromPreviousTier * 0.08) + ((sales - maximumAmount) * 0.1) + 5000);
				sales += 1000;
			}
			
			else if (sales < 20001) {
				maximumAmount = 10000;
				maxFromPreviousTier = 5000;
				maxSecondTier = 5000;
				System.out.print("$" + sales);
				computeIncome( (maxFromPreviousTier * 0.08) + (maxSecondTier * 0.1) + ((sales - maximumAmount) * 0.12) + 5000);
				sales += 1000;
			}
			
		}

	}
	

}
