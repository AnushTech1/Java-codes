                        //=======MultiThread program=======//
class mythread extends Thread{
    @Override
    public void run(){
        System.out.println("Thread is running");
    }
}
public class multi_thread{
    public static void main(String args[]){
        mythread t1 = new mythread();
        mythread t2 = new mythread();
        t1.start();
        t2.start();
    }
}

