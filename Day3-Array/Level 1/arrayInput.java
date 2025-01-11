import java.util.Scanner;

class arrayInput{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number in array: ");
		int number = scanner.nextInt();
		int[] array = new int[10];
		
		int currentIndex = 0;
		int sum = number;
		while(number > 0 || (array.length != 10)){
			System.out.print("Enter another  number in array: ");
			number = scanner.nextInt();
			array[currentIndex] = number;
			currentIndex++;
		}

		for(int i = 0;i < array.length;i++){
			sum += array[i];
		}

		System.out.print("Total value : " + sum);
		scanner.close();
	}
}