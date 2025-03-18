public class SavedPlayer {
    private String key;
    private Player value;

    public SavedPlayer(String key, Player value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public Player getValue() {
        return value;
    }
}
