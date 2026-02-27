                //=========Static Method=========//
//Static method ko direct main method me call kia ja sakta hai.
public class Static_Method{
    static void showdata(){
        System.out.println("This is Static Method");
    }
    public static void main(String[] args) {
       Static_Method.showdata(); 
                //or
        showdata();
    }}
//Output: This is Static Method