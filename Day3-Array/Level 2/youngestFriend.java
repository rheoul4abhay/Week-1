import java.util.Scanner;

public class youngestFriend{
    public static void main(String[] args) {
        
		double[] height = new double[3];
		double[] age = new double[3];
		String[] names = {"Amar", "Akbar", "Anthony"};
		
		int j = 0;
		int k = 0;
        Scanner scanner = new Scanner(System.in);
		for(int i = 0;i < 3;i++){
			System.out.println("Enter details of " + names[i]);
			System.out.print("Enter height: ");
			height[j] = scanner.nextDouble();
			j++;
			System.out.print("Enter age: ");
			age[k] = scanner.nextDouble();
			k++;
		}
		
		int youngestFriendIndex = 0;
		double youngest = age[0];
		
		for(int i = 0;i < age.length;i++){
			if(age[i] < youngest){
				youngest = age[i];
				youngestFriendIndex = i;	
			}
		}
		
		int tallestFriendIndex = 0;
		double tallest = height[0];
		
		for(int i = 0;i < height.length;i++){
			if(height[i] > tallest){
				tallest = height[i];
				tallestFriendIndex = i;	
			}
		}
		
		System.out.print("Youngest friend : " + names[youngestFriendIndex]);
		System.out.print("\nTallest friend : " + names[tallestFriendIndex]);
		
		scanner.close();
    }
}
