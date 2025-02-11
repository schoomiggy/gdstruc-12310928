public class Main {
    public static void main(String[] args) {
        PlayerLinkedList playerLinkedList = new PlayerLinkedList();
        playerLinkedList.addToFront(new Player(1, "Saitama", 999));
        playerLinkedList.addToFront(new Player(2, "Deku", 100));
        playerLinkedList.addToFront(new Player(3, "Saiki K.", 500));

        playerLinkedList.printLinkedList();
        System.out.println("\nSize: " + playerLinkedList.size());

        // remove first element
        Player removedPlayer = playerLinkedList.removeFromFront();
        System.out.println("\nRemoved Player: " + removedPlayer);
        playerLinkedList.printLinkedList();
        System.out.println("\nSize: " + playerLinkedList.size());

        // test if removed
        Player searchPlayer = new Player(3, "Saiki K.", 500);
        System.out.println("\nContains: " + searchPlayer + "? " + playerLinkedList.contains(searchPlayer));
        System.out.println("Index of " + searchPlayer + " is " + playerLinkedList.indexOf(searchPlayer));
    }
}