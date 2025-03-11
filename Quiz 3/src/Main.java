import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // scanner util
        Scanner scanner = new Scanner(System.in);
        // random util
        Random random = new Random();

        PlayerQueue players = new PlayerQueue(10);
        int gamesCompleted = 0;

        // program terminates when 10 games have been made
        while (gamesCompleted < 10) {
            System.out.println("\nPress Enter to attempt to start a match...");
            scanner.nextLine();

            // enqueue x players from 1-7
            int playersToEnqueue = random.nextInt(7) + 1;
            System.out.println("Queuing up with " + playersToEnqueue + " other player/s...");
            for (int i = 0; i < playersToEnqueue; i++) {
                players.enqueue(new Player(i + 1, "Player" + (i + 1), random.nextInt(100))); // Random level between 0 and 999
            }

            System.out.println("\nCurrent Queue:");
            players.printQueue();

            // start if there's at least 5 players in queue
            if (players.getSize() >= 5) {
                System.out.println("\n\nStarting the match alongside the following players:");
                for (int i = 0; i < 5; i++) {
                    Player player = players.dequeue();
                    System.out.println(player);
                }
                gamesCompleted++;
                System.out.println("\nGames completed: " + gamesCompleted);
            } else {
                System.out.println("\n\nSorry. There weren't enough players to start a match. Needs " + (5 - players.getSize()) + " more.");
            }
        }

        System.out.println("\n10 games have been completed. Thank you for participating.");
        scanner.close();
    }
}