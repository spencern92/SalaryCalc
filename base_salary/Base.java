package base_salary;

public class Base {
	
	public static double computeIncome(double salesAmount) {
		
		double maximumAmount = 0;
		double maxFromPreviousTier = 0;
		double maxSecondTier = 0;
		double incomeAmount = 0.00;
		
		if (salesAmount < 5001) {	
			incomeAmount = (salesAmount * 0.08) + 5000;
		}
		
		else if (salesAmount < 10001) {
			maximumAmount = 5000;
			maxFromPreviousTier = 5000;
			incomeAmount = (maxFromPreviousTier * 0.08) + ((salesAmount - maximumAmount) * 0.1) + 5000;
		}
		
		else if (salesAmount < 20001) {
			maximumAmount = 10000;
			maxFromPreviousTier = 5000;
			maxSecondTier = 5000;
			incomeAmount = (maxFromPreviousTier * 0.08) + (maxSecondTier * 0.1) + ((salesAmount - maximumAmount) * 0.12) + 5000;
		}
		
		return incomeAmount;
	}
	
	public static void main(String[] args) {

		
		double sales = 1000.00;
		
		System.out.println("Sales" + "           " + "Income");
		
		for (int i = 0; i < 20; i++) {
			
			System.out.format("$%.2f",sales);
			double result = computeIncome(sales);
			System.out.format("        $%.2f", result);
			
			System.out.println("");
			
			sales += 1000;
			
		}

	}
	

}
