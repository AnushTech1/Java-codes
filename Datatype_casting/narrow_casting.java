package Datatype_casting;
public class narrow_casting {

    public static void main(String[] args){

        //narrow casting me big data type se small data type me change kia jata hai
        // ise manual casting bhi kahte hai becuase ise manually kerna padta hai.

        double num1 = 1200.50d;
        int num2 = (int)num1; // yah (int) ka use explicit casting ke liye hote hai.
        System.out.println(num1);
        System.out.println(num2);
                
    }
}