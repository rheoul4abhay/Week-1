class profitLoss{
	public static void main(String[] args){
		
		//cp and sp
		int costPrice = 129, sellingPrice = 191;
		
		//calculated profit 
		int profit = sellingPrice - costPrice;

		//calculated profitPercentage
		double profitPercentage = (double)(profit)/(double)(costPrice) * 100;
		
		//Displaying result
		System.out.println("The Cost price is INR " + costPrice + " and Selling Price is INR " + sellingPrice +
				   "\nThe profit is INR " + profit + " and the profit percentage is " + profitPercentage);
							
	}
}