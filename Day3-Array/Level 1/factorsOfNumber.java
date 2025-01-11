import java.util.Scanner;

class factorsOfNumber{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		int maxFactor = 10;
		int[] factors = new int[maxFactor];
		int index = 0; //To track the number of factors 
		
		for(int i = 1;i < number;i++){
			if(number%i == 0){
				if(index == maxFactor){
					maxFactor*=2;
					int[] newFactors = new int[maxFactor];
					System.arraycopy(factors, 0, newFactors, 0, factors.length);
					factors = newFactors; //updating factors array
				}
				factors[index++] = i;
			}
		}
		System.out.print("The factors are : ");
		for(int factor: factors){
			if(factor != 0) System.out.print(factor + " ");
		}
		scanner.close();
	}
}