public class Counter {
    static int count = 0;  // Static variable

    public void increment() {
        count++;  // Static variable ko increment karna
    }

    public static void main(String[] args) {
        Counter counter1 = new Counter();  // Object 1
        Counter counter2 = new Counter();  // Object 2
        Counter counter3 = new Counter();
        counter1.increment();  // First increment
        counter2.increment();
        counter3.increment();  // Second increment

        // Print count
        System.out.println("Count: " + count);  // Output: 3
    }
}
