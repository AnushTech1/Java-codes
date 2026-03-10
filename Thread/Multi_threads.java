                //========Multi Threads running with concurrency========//
import java.lang.*;
class mythread extends Thread{
    @Override
    public void run(){
        for(int i = 1; i<4; i++){
            System.out.println("Thread"+i);
        }
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
public class Multi_threads{
    public static void main(String[] args){
        mythread t1 = new mythread();
        mythread t2 = new mythread();
        t1.start();
        t2.start();
    }
}