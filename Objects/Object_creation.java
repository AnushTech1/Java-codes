                //==============Object Creation==============//
//ek object create kerne ke liey class name ka use kia jata hai.

public class Object_creation {
    int Age = 18;
    String Name = "Hello";
    public static void main(String[] args) {
        //Syntax for object creation :- classname objectname = New classname(); 
        Object_creation myobj1 = new Object_creation();
        System.out.println(myobj1.Age);
        System.out.println(myobj1.Name);
    }
}
