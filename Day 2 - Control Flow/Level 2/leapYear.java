import java.util.Scanner;

class leapYear{
	public static void main(String[] args){	
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the year : ");
		
		int year = scanner.nextInt();
		boolean isValidInput = true;
		if(year < 1582){
			System.out.print("Please Enter an year after 1582");
			isValidInput = false;
		}
		
		if(isValidInput){
			if(year%4 == 0){
				if(year%100 == 0){
					if(year%400 == 0){
						System.out.print("Leap Year");
					}
					else{
						System.out.print("Not Leap Year");
					}
				}
				else{
					System.out.print("Not a Leap Year");
				}
			}
			else{
				System.out.println("Not Leap Year");
			}

		scanner.close();
		}

	}
}