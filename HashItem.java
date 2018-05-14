public class HashItem {
    private int key;
    private String value;
    private HashItem next;

    public HashItem(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public HashItem getNext() {
        return next;
    }

    public void setNext(HashItem hashItem) {
        next = hashItem;
    }
}
