import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, String> table = new MyHashTable<>(50); // 50 бакетов
        Random rand = new Random();

        for (int i = 0; i < 10000; i++) {
            int id = rand.nextInt(100000);
            String name = "name" + rand.nextInt(1000);
            MyTestingClass key = new MyTestingClass(id, name);
            table.put(key, "value" + i);
        }

        // Печать количества элементов в каждом бакете
        for (int i = 0; i < 50; i++) {
            System.out.println("Bucket " + i + ": " + table.getChainLength(i) + " elements");
        }

    }
}
