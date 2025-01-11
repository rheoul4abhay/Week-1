import java.util.Scanner;

public class reverseNumber{
    public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = scanner.nextInt();
		
		int maxDigits = 10;
		int temp = number;
		int index = 0; //to keep a track of elements 
		
		int[] reverseArray = new int[maxDigits];
		while(temp != 0){
			int digit = temp%10;
			reverseArray[index++] = digit;
			temp /= 10;
		}
		
		System.out.println("Elements of reverse array : ");
		for(int i = 0;i < index;i++){
			System.out.println("Element " + (i+1) + ": " + reverseArray[i]);
		}
		scanner.close();
    }
}
