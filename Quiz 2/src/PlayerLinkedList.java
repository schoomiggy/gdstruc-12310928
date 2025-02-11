public class PlayerLinkedList {
    private PlayerNode head;
    private int size;

    public PlayerLinkedList() {
        this.head = null;
        this.size = 0; // initialize to 0
    }

    public void addToFront(Player player) {
        PlayerNode newNode = new PlayerNode(player);
        newNode.setNextPlayerNode(head);
        head = newNode;
        size++; // in-place counter
    }

    public Player removeFromFront() {
        if (head == null) {
            return null; // returns null if empty
        }
        Player removedPlayer = head.getPlayer();
        head = head.getNextPlayerNode();
        size--; // in-place counter
        return removedPlayer;
    }

    // size function
    public int size() {
        return size;
    }

    // contains function
    public boolean contains(Player player) {
        PlayerNode current = head;
        while (current != null) {
            if (current.getPlayer().equals(player)) {
                return true;
            }
            current = current.getNextPlayerNode();
        }
        return false;
    }

    // index function
    public int indexOf(Player player) {
        PlayerNode current = head;
        int index = 0;
        while (current != null) {
            if (current.getPlayer().equals(player)) {
                return index;
            }
            current = current.getNextPlayerNode();
            index++;
        }
        return -1; // -1 if no player
    }

    public void printLinkedList() {
        System.out.print("[HEAD] -> ");
        PlayerNode current = head;

        while (current != null) {
            System.out.print(current.getPlayer() + " -> ");
            current = current.getNextPlayerNode();
        }

        System.out.print("NULL");
    }
}
