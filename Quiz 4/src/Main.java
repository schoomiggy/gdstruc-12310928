public class Main {
    public static void main(String[] args) {
        Player pikachu = new Player(1, "Pikachu", 10);
        Player celebi = new Player(2, "Celebi", 20);
        Player hitmonchan = new Player(3, "Hitmonchan", 30);
        Player mankey = new Player(4, "Mankey", 40);
        Player starmie = new Player(5, "Starmie", 50);
        Player togepi = new Player(6, "Togepi", 60);

        // add the players to the hashtable
        SimpleHashtable players = new SimpleHashtable();

        players.put(pikachu.getUsername(), pikachu);
        players.put(celebi.getUsername(), celebi);
        players.put(hitmonchan.getUsername(), hitmonchan);

        System.out.println("Before collision:");
        players.printHashtable();

        players.put(mankey.getUsername(), mankey);
        players.put(starmie.getUsername(), starmie);
        players.put(togepi.getUsername(), togepi);

        System.out.println("\nAfter collision:");
        players.printHashtable();

        // test retrieving a value
        String key = mankey.getUsername();
        System.out.println("\nPlayer at key " + key + " = " + players.get(key) +"\n");

        // test removing a value
        players.remove("Mankey");
        players.printHashtable();

        // test retrieving a removed value
        System.out.println("\nPlayer at key " + key + " = " + players.get(key));

        //test removing a removed value
        players.remove("Mankey");
    }
}