package String_methods;

public class Concat_method {
    public static void main(String[] args) {
        
        //concat() method ka use two string ko combine kerne ke liye kia jata hai.
        String text1 = "Hello";
        String text2 = "World";
        //Normal use of + to add two strings

        System.out.println(text1 +" "+ text2);//(" ") ka use white space create kerne ke liye.
                //or method
        System.out.println(
            text1.concat(" ").concat(text2)
        );
    }
    
}
