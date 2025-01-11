import java.util.Scanner;

class positiveNegativeOrZero{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter 5 numbers of the array: ");
		int[] numArray = new int[5];

		for(int i = 0;i < numArray.length;i++){
			System.out.print("Number " + (i+1) + " : ");
			numArray[i] = scanner.nextInt();
		}
		
		System.out.println();
		for(int i = 0;i < numArray.length;i++){
			if(numArray[i] < 0){
				System.out.println("Negative");
			}
			else if(numArray[i] == 0){
				System.out.println("Zero");
			}
			else{
				if(numArray[i]%2 == 0){
					System.out.println("Number is postive and even.");
				}
				else{
					System.out.println("Number is positive and odd");
				}
			}
		}

		System.out.println();
		if(numArray[0] == numArray[numArray.length-1]){
			System.out.println("Equal");
		}
		else if(numArray[0] < numArray[numArray.length-1]){
			System.out.println(numArray[0] + " is smaller and " + numArray[numArray.length-1] + " is greater.");
		}
		else{
			System.out.println(numArray[0] + " is greater and " + numArray[numArray.length-1] + " is smaller.");
		}
		scanner.close();
	}
}