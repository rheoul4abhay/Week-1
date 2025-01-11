import java.util.Scanner;

class discount2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the fee: ");
		double fee = scanner.nextDouble();

		System.out.println("Enter the discount percent: ");
		double discountPercent = scanner.nextDouble();
		
		double discount = discountPercent/100 * fee;
		
                double discountedFee = fee - discount;
		System.out.println("The discount amount is INR " + discount + " and the final discounted fee is " + discountedFee);
		scanner.close();
	}
}