import java.util.*;

public class maxOfThreeNumber {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0, num2 = 0, num3 = 0;
		
		System.out.println("Enter first number: ");
		num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		num2 = sc.nextInt();
		System.out.println("Enter third number: ");
		num3 = sc.nextInt();
		
		int maxNum = Math.max(num1, Math.max(num2, num3));
		
		System.out.println("The maximum number of "+num1+", "+num2+" and "+num3+" is "+maxNum);
		
		sc.close();
	}
	
}


