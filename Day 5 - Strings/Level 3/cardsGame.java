import java.util.*;

class cardsGame{

    static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    static String[] initializeDeck() {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    static String[] shuffleDeck(String[] deck) {
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + rand.nextInt(deck.length - i);
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    static String[][] distributeCards(String[] deck, int numOfCards, int numOfPlayers) {
        if (numOfCards % numOfPlayers != 0) {
            System.out.println("The cards cannot be evenly distributed among players.");
            return null;
        }

        String[][] playersCards = new String[numOfPlayers][numOfCards / numOfPlayers];
        int cardIndex = 0;

        for (int i = 0; i < numOfPlayers; i++) {
            for (int j = 0; j < numOfCards / numOfPlayers; j++) {
                playersCards[i][j] = deck[cardIndex++];
            }
        }

        return playersCards;
    }

    static void printPlayersCards(String[][] playersCards) {
        for (int i = 0; i < playersCards.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (String card : playersCards[i]) {
                System.out.print(card + " | ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of players: ");
        int numOfPlayers = sc.nextInt();
        System.out.print("Enter the number of cards per player: ");
        int numOfCards = sc.nextInt();

        String[] deck = initializeDeck();
        deck = shuffleDeck(deck);
        String[][] playersCards = distributeCards(deck, numOfCards * numOfPlayers, numOfPlayers);

        if (playersCards != null) {
            printPlayersCards(playersCards);
        }
    }
}
