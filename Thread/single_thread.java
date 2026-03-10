                        //=======Thread simple program=======//
public class single_thread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread Running: " + Thread.currentThread().getName());
    }
    public static void main(String args[]) {
        single_thread t1 = new single_thread();
        t1.start(); // Thread execution start karega
    }
}
