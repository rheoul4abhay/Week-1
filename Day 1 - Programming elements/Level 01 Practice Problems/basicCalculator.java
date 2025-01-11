import java.util.Scanner;

class basicCalculator{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("First number : ");
                float num1 = scanner.nextFloat();

		System.out.print("Second number : ");
		float num2 = scanner.nextFloat();

		System.out.println("The addition, subtraction, division and multiplication of 2 numbers "
				   + num1 + " and " + num2 + " is " + add(num1, num2) + "," + subtract(num1, num2) + ","
				   + division(num1, num2) + " and " + multiply(num1, num2));
		scanner.close();
	}

	public static float add(float n1, float n2){
		return n1 + n2;
	}
	public static float subtract(float n1, float n2){
		return n1 - n2;
	}
	public static float division(float n1, float n2){
		return n1/n2;
	}
	public static float multiply(float n1, float n2){
		return n1*n2;	
	}
}