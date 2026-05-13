import java.util.LinkedList;

public class HashTable {

    private LinkedList<String>[] table;
    private int size;
    private int collisions;

    public HashTable(int size) {
        this.size = size;
        table = new LinkedList[size];

        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }

        collisions = 0;
    }

    private int hash(String key) {
        return Math.abs(key.hashCode()) % size;
    }

    public void insert(String key) {
        int index = hash(key);

        if (!table[index].isEmpty()) {
            collisions++;
        }

        table[index].add(key);
    }

    public boolean search(String key) {
        int index = hash(key);
        return table[index].contains(key);
    }

    public double loadFactor() {
        int total = 0;

        for (LinkedList<String> bucket : table) {
            total += bucket.size();
        }

        return (double) total / size;
    }

    public int getCollisions() {
        return collisions;
    }

    public void printTable() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ": " + table[i]);
        }
    }
}
