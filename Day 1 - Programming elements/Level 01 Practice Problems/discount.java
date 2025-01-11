class discount{
	public static void main(String[] args){
		int fee = 125000;
		int discountPercent = 10;
		
		double discount = (double)(discountPercent)/(100) * fee;

		double discountedFee = fee - discount;

		System.out.println("The discount amount is INR " + discount +
				   " and final discounted fee is INR " + discountedFee);
	}
}