import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // scanner util
        Scanner scanner = new Scanner(System.in);
        // random util
        Random random = new Random();

        // card name array
        String[] cardNames = {
                "Black Lotus", "Timetwister", "Ancestral Recall", "Time Walk", "Mishra's Workshop",
                "Mox Jet", "Mox Emerald", "Mox Sapphire", "Mox Ruby", "Mox Pearl",
        };

        // player deck
        CardStack playerDeck = new CardStack(30);
        for (int i = 0; i < 30; i++) {
            // select card names at random for simplicity
            String cardName = cardNames[random.nextInt(cardNames.length)];
            playerDeck.push(new Card(cardName));
        }

        // player hand
        CardStack playerHand = new CardStack(30);
        // discard pile
        CardStack discardPile = new CardStack(30);

        while (!playerDeck.isEmpty()) {
            System.out.println("\n[[[ New Turn ]]]");

            // generate random command
            int command = random.nextInt(3);
            int x = random.nextInt(5) + 1;

            switch (command) {
                // draw cards
                case 0:
                    System.out.println("I COMMAND YOU! \033[1mDRAW\033[0m " + x + " CARD/S!");
                    for (int i = 0; i < x && !playerDeck.isEmpty(); i++) {
                        Card drawnCard = playerDeck.pop();
                        System.out.println("You drew: " + drawnCard);
                        playerHand.push(drawnCard);
                    }
                    break;
                // discard cards
                case 1:
                    System.out.println("I COMMAND YOU! \033[1mDISCARD\033[0m " + x + " CARD/s!");
                    for (int i = 0; i < x && !playerHand.isEmpty(); i++) {
                        Card discardedCard = playerHand.pop();
                        System.out.println("You discarded: " + discardedCard);
                        discardPile.push(discardedCard);
                    }
                    break;
                // get discarded cards
                case 2:
                    System.out.println("I COMMAND YOU! \033[1mGET\033[0m " + x + " CARD/S BACK FROM YOUR DISCARDED PILE!");
                    for (int i = 0; i < x && !discardPile.isEmpty(); i++) {
                        Card retrievedCard = discardPile.pop();
                        System.out.println("You retrieved: " + retrievedCard);
                        playerHand.push(retrievedCard);
                    }
                    break;
            }

            // display current state
            System.out.println("\nPlayer Hand:");
            playerHand.printStack();
            System.out.println("\nRemaining cards in player deck: " + playerDeck.size());
            System.out.println("Cards in discard pile: " + discardPile.size());

            // enter scanner
            System.out.println("\nPress Enter to proceed to the next turn...");
            scanner.nextLine();
        }

        System.out.println("\nGG! The player deck is finally empty.");
    }
}