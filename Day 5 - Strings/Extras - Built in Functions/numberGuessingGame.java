import java.util.*;

public class numberGuessingGame {
	
    public static void startGame() {
		
		Scanner sc = new Scanner(System.in);
		
		Random r = new Random();
		int num = r.nextInt(100) + 1;
		
		System.out.print("The Game has started guess a number: ");
		int	attempt = 1;
		int guessedNumber = sc.nextInt();
		while (guessedNumber != num){
			if (guessedNumber > num) System.out.println("Try guessing a smaller number!");
			else System.out.println("Try guessing a greater number!");
			attempt++;
			guessedNumber = sc.nextInt();
		}
		System.out.println("Congrats! You have successfully guessed the number. Attempts took: "+attempt);
		
    }

    public static void main(String[] args) {
		
		startGame();
		
    }
}