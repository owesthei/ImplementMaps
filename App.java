public class App {

    public final int ARRAY_SIZE = 10;

    public static void main(String[] args) {
        HashTable ht = new HashTable();

        ht.put(1, "One");
        System.out.println();

        ht.put(2, "Two");
        System.out.println();

        ht.put(3, "Three");
        System.out.println();

        ht.put(4, "Four");
        System.out.println();
 
        System.out.println(ht.get(1));
        System.out.println(ht.get(3));

        ht.put(5, "Five");
        ht.put(6, "Six");
        ht.put(7, "Seven");
        ht.put(8, "Eight");
        ht.put(9, "Nine");
        ht.put(10, "Ten");
        ht.put(11, "Eleven");
        ht.put(12, "Twelve");
        ht.put(13, "Thirteen");
        ht.put(14, "Fourteen");
        ht.put(15, "Fifteen");
    }

}
