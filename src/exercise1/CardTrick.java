package exercise1;

import java.util.Random;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card.
 *
 * @author Chintan
 * @date February 2, 2024
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(generateRandomNumber());
            card.setSuit(Card.SUITS[generateRandomNumberBetween(0, 3)]);
            hand[i] = card;
        }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here.
        // Then loop through the cards in the array to see if there's a match.

        // If the guess is successful, invoke the printInfo() method below.
    }

    /**
     * A simple method to generate a random number between 1 and 13 (inclusive) for card values.
     */
    private static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(13) + 1;
    }

    /**
     * A simple method to generate a random number between min and max (inclusive) for suits.
     */
    private static int generateRandomNumberBetween(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    /**
     * A simple method to print out personal information.
     */
    private static void printInfo() {
//        I am Done !!!
        System.out.println("Congratulations, you guessed right!");
        System.out.println();

        System.out.println("My name is Chintan");
        System.out.println();

        System.out.println("My career ambitions:");
        System.out.println("VLogger");

        System.out.println("My hobbies:");
        System.out.println("-- Your hobbies here");

        System.out.println();
    }
}
