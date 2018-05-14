public class HashTable {

    private HashItem[] hashTable;

    public HashTable() {
        hashTable = new HashItem[Constants.TABLE_SIZE];
    }

    public String get(int key) {
        int hashArrayIndex = hash(key);

        if (hashTable[hashArrayIndex] == null) {
            return null;
        }
        else {
            HashItem hashItem = hashTable[hashArrayIndex];

            while (hashItem.getNext() != null && hashItem.getKey() != key) {
                hashItem = hashItem.getNext();
            }

            if (hashItem == null) {
                return null;
            }
            else {
                return hashItem.getValue();
            }
        }
    }

    public void put(int key, String value) {
        int hashArrayIndex = hash(key);

        if (hashTable[hashArrayIndex] == null) {
            System.out.println("No collision simple insertion...");
            hashTable[hashArrayIndex] = new HashItem(key, value);
        }
        else {
            System.out.println("Collision when inserting with key " + key);
            HashItem hashItem = hashTable[hashArrayIndex];

            while (hashItem.getNext() != null) {
                System.out.println("Considering the next item in linked list " + hashItem.getValue());
                hashItem = hashItem.getNext();
            }

            System.out.println("Finally we have found the place to insert...");
            hashItem.setNext(new HashItem(key, value));
        }
    }

    private int hash(int key) {
        return key % Constants.TABLE_SIZE;

        // Create collisions
        // return 1;
    }
}
