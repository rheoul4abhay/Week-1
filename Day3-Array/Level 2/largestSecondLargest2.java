import java.util.Scanner;

public class largestSecondLargest2{
    public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = scanner.nextInt();
		
		int maxDigits = 10;
		int index = 0;
		int[] digitsArray = new int[maxDigits];
		while(number != 0){
			if(index == maxDigits){
				maxDigits *= 2;
				int[] newArray = new int[maxDigits];
				System.arraycopy(digitsArray, 0, newArray, 0, digitsArray.length);
				digitsArray = newArray;
			}
			digitsArray[index] = number%10;
			index++;
			number /= 10;
		}
		
		int largest = digitsArray[0];
		int smallest = digitsArray[0];
		
		for(int i = 0;i < index-1;i++){
			if(digitsArray[i] > largest) largest = digitsArray[i];
			if(digitsArray[i] < smallest) smallest = digitsArray[i];
		}
		System.out.print("Largest: " + largest);
		System.out.print("\nSmallest: " + smallest);
		scanner.close();
    }
}
