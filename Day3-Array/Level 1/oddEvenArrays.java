import java.util.Scanner;

class oddEvenArrays{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		
		int oddCount = 0;
		int evenCount = 0;
		
		int[] array = new int[number];
		for(int i = 0;i < number;i++){
			array[i] = i+1;
			if(array[i]%2 == 0){
				evenCount++;
			}
			else{
				oddCount++;
			}
		}
		
		int[] oddArray = new int[oddCount];
		int[] evenArray = new int[evenCount];
		
		int k = 0;
		int j = 0;
		for(int i = 0;i < array.length;i++){
			if(array[i]%2==0){
				evenArray[k] = array[i];
				k++;
			}
			else{
				oddArray[j] = array[i];
				j++;
			}
		}
		
		System.out.print("Odd Array: ");
		for(int i = 0;i < oddArray.length;i++){
			System.out.print(oddArray[i]+" ");
		}
		
		System.out.print("\nEven Array: ");
		for(int i = 0;i < evenArray.length;i++){
			System.out.print(evenArray[i]+" ");
		}

		scanner.close();
	}
}