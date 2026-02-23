package Datatype_casting;

public class wideing_casting {
    public static void main(String[] args) {
        
        //Wideing casting me small data type ki value ko big data type ki value me change kia jata hai.
        //yah automatic hoti hai
        short num1 = 127; //samll data type
        double num2 = num1; // big data type me change kerna

        System.out.println(num1);// output : 127
        System.out.println(num2);// output : 127.0
    }
    
}
