import java.util.Scanner;

class GenerateAndValidateOTP{
	
	public static int generateRandomOTP()
	{
		return (int)((Math.random()*900000 + 100000));
	}
	
	public static boolean isUnique(int[] array){
		for(int i = 0;i < array.length-1;i++){
			for(int j = i+1;j < array.length;j++){
				if(array[i] == array[j]) return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){

		//Declaring scanner object
		Scanner scanner = new Scanner(System.in);
		
		int numberOfDigits = 6;
		int numberOfOTP = 10;
		int[] OTP = new int[numberOfOTP];
		
		//Displaying results
		System.out.print("\nGenerated " + numberOfDigits + " digits OTP below : \n");
		for(int i = 0;i < numberOfOTP;i++){
			int randomOTP = generateRandomOTP();
			System.out.print("\nGenerated OTP " + (i+1) + " : " + randomOTP);
			OTP[i] = randomOTP;
		}
		
		System.out.print("\nOTPs are unique ? " + isUnique(OTP));
		//closing scanner object
		scanner.close();	
	}
}