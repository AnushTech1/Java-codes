                //==========Public Method==========//
//Ek public method ko ek class me ek object ke through call kiya ja sakta hai.
//Ek public method ko ek class ke bahar bhi call kiya ja sakta hai.
public class Public_Method{
    public void display(){
        System.out.println("This is a public method");
    }
    public static void main(String[] args){
        Public_Method MyObj = new Public_Method();
        MyObj.display();
         
    }
}