import java.util.Scanner;

class arrayIndexOutOfBoundsException{
	
	public static void generateException(String[] input){
		System.out.print("Last name : " + input[input.length]);
	}	

	public static void handleException(String[] input){
		try{
			System.out.print("Last name : " + input[input.length]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.print("\nerr : " + e.getMessage());
		}
	}
	
	public static void main(String[] args){
		//Creating scanner object
		Scanner scanner = new Scanner(System.in);
		
		//Taking user inputs 
		System.out.print("Enter number of names : ");
		int numberOfNames = scanner.nextInt();
		
		String[] names = new String[numberOfNames];
		System.out.print("\nEnter names : \n");
		
		for(int i = 0; i < names.length;i++){
			System.out.print("\nEnter name of person " + (i+1) + " : ");
			names[i] = scanner.next();
		}
		
		try{
			generateException(names);
		}
		catch(Exception e){
			System.out.print("err : " + e);
		}
		handleException(names);
		//Closing scanner object
		scanner.close();
	}
}