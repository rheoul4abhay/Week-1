import java.util.Scanner;

class totalPrice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter unit price : ");
		double units = scanner.nextDouble();
		
		System.out.print("Enter quantity: ");
		double quantity = scanner.nextDouble();
		
		System.out.print("The total purchase is INR " + units*quantity + " when the unit price is " + 
		units + " and units sold are " + quantity);
	}
}