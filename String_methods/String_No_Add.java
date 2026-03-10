package String_methods;

public class String_No_Add {
    public static void main(String[] args) {
        // (+) ka use integer numbers ko add kerne or strings ko combine kerne ke liye
        // kia jata hai.
        // Add numbers-
        int x = 3, y = 2;
        int z = x + y;
        System.out.println(z);

        // Add string or combine string
        String text1 = "Hello";
        String text2 = "India";
        String text3 = text1 + " " + text2;
        System.out.println(text3);

        // Add String and Integer
        System.out.println(text1 + x);
        String text4 = "new";
        String text5 = "4"; // Here 4 is string because its in double quotes;
        System.out.println(text4 + text5);
        System.out.println(5 + "5");// output was 55 because second 5 is string(double quotes)

    }

}
