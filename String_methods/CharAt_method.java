package String_methods;
public class CharAt_method{
    public static void main(String[] args){
            //charAt() method ka use string ki index value ke base per ek letter ko 
            //acces ya retrive kerne ke liye kia jata hai.
   
        String str = "India";
        char letter1 = str.charAt(3);
        char letter2 = str.charAt(4);

        System.out.println("Here the third letter fo India: "+ letter1);
        System.out.println("Here the fourth letter fo India: "+ letter2);


    }
}