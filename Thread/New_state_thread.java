                    //========New State Thread========//
public class New_state_thread extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }
    public static void main(String[] args) {
    New_state_thread t1 = new New_state_thread();
    System.out.println(t1.getState());   
    }
}