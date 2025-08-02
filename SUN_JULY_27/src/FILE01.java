// COLLECTION FRAMEWORK 02

import java.util.*;

public class FILE01 {
    public static void main(String[] args) {
        // --ARRAYLIST
        List<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple"); // Duplicate is allowed
        fruits.add("Orange");

        System.out.println("Full List: " + fruits); // Output: [Apple, Banana, Apple, Orange]

        // Get element by index (it's ordered)
        System.out.println("Element at index 1: " + fruits.get(1)); // Output: Banana

        // --HASHSET
        Set<String> uniqueFruits = new HashSet<>();

        // Add elements
        uniqueFruits.add("Apple");
        uniqueFruits.add("Banana");
        uniqueFruits.add("Apple"); // This duplicate will be ignored
        uniqueFruits.add("Orange");

        System.out.println("Set of unique fruits: " + uniqueFruits);
        // Possible Output: [Orange, Apple, Banana] - order is not guaranteed



        // --QUEUE
        Queue<String> customerLine = new LinkedList<>();

        // Customers get in line (offer adds to the back)
        customerLine.offer("Alice");
        customerLine.offer("Bob");
        customerLine.offer("Charlie");

        System.out.println("Current Line: " + customerLine); // Output: [Alice, Bob, Charlie]

        // Peek at the front of the line
        System.out.println("Next to be served: " + customerLine.peek()); // Output: Alice

        // Serve the first person (poll removes from the front)
        String servedCustomer = customerLine.poll();
        System.out.println("Served: " + servedCustomer); // Output: Served: Alice

        System.out.println("Remaining Line: " + customerLine); // Output: [Bob, Charlie]



        // --MAP
        Map<Integer, String> studentMap = new HashMap<>();

        // Add key-value pairs
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");

        // Update the value for an existing key
        studentMap.put(102, "Robert"); // "Bob" is replaced by "Robert"

        System.out.println("Full Map: " + studentMap);
        // Possible Output: {101=Alice, 102=Robert, 103=Charlie}

        // Get a value using its key
        System.out.println("Student with ID 103: " + studentMap.get(103)); // Output: Charlie

        Map<String, Integer> fruitPrices = new HashMap<>();
        fruitPrices.put("Apple", 10);
        fruitPrices.put("Banana", 5);
        fruitPrices.put("Cherry", 20);

        // --- Option 1: Loop over the keys ---
        System.out.println("## Looping over keys:");
        for (String key : fruitPrices.keySet()) {
            System.out.println("Key: " + key + ", Value: " + fruitPrices.get(key));
        }

        // --- Option 2: Loop over the values ---
        System.out.println("\n## Looping over values:");
        for (Integer value : fruitPrices.values()) {
            System.out.println("Value: " + value);
        }

        // --- Option 3: Loop over the key-value entries (Most common) ---
        System.out.println("\n## Looping over entries:");
        for (Map.Entry<String, Integer> entry : fruitPrices.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }


        
        // --STACK
        Stack<String> bookStack = new Stack<>();

        // Push books onto the stack
        System.out.println("Adding books...");
        bookStack.push("The Hobbit");
        bookStack.push("Dune");
        bookStack.push("Foundation");

        System.out.println("Current Stack: " + bookStack); // [The Hobbit, Dune, Foundation]

        // Look at the top book
        System.out.println("Top book is: " + bookStack.peek()); // Foundation

        // Remove the top book
        String topBook = bookStack.pop();
        System.out.println("Removed book: " + topBook); // Foundation

        System.out.println("Remaining Stack: " + bookStack); // [The Hobbit, Dune]

        // Check if the stack is empty
        System.out.println("Is the stack empty? " + bookStack.empty()); // false



        // --DEQUE
        Deque<String> deque = new ArrayDeque<>();

        // Add to the back (tail)
        deque.offerLast("B");
        deque.offerLast("C");
        // Deque: [B, C]

        // Add to the front (head)
        deque.offerFirst("A");
        // Deque: [A, B, C]

        System.out.println("Current Deque: " + deque);

        // --- Peek at elements ---
        System.out.println("Peek First (Head): " + deque.peekFirst()); // A
        System.out.println("Peek Last (Tail):  " + deque.peekLast());  // C

        // --- Remove elements ---
        String removedFromFront = deque.pollFirst();
        System.out.println("Polled from front: " + removedFromFront); // A
        System.out.println("Deque after pollFirst: " + deque); // [B, C]

        String removedFromBack = deque.pollLast();
        System.out.println("Polled from back: " + removedFromBack); // C
        System.out.println("Deque after pollLast: " + deque); // [B]
    }
}
