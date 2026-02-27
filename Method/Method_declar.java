                        //========Method Declaration========//
//Every method ko main method ke outside me declare karte hai.
//And main method ke andar method call karte hai.

//Method declaration
public class Method_declar{
    static void My_method(float num1,float num2){
        float result;
        result = num1 + num2;
        System.out.println("Result is: "+result);
    }

public static void main(String[] args){
    My_method(10, 20);//method call
}
}