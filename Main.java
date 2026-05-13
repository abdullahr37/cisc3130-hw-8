import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {

        HashTable ht = new HashTable(5);

        ht.insert("apple");
        ht.insert("banana");
        ht.insert("orange");
        ht.insert("grape");
        ht.insert("melon");

        System.out.println("Hash Table:");
        ht.printTable();

        System.out.println("\nSearch apple: " + ht.search("apple"));
        System.out.println("Search kiwi: " + ht.search("kiwi"));

        System.out.println("\nLoad Factor: " + ht.loadFactor());
        System.out.println("Collisions: " + ht.getCollisions());

        PriorityQueue<Task> pq =
                new PriorityQueue<>(new TaskComparator());

        pq.add(new Task("Homework", 2));
        pq.add(new Task("Study for exam", 5));
        pq.add(new Task("Laundry", 1));
        pq.add(new Task("Project", 4));

        System.out.println("\nPriority Queue:");

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
