public class Nested_method_basic {
    // main method ko aise define kiya gaya hai ki args array pass karein
    public static void main(String[] args) {
        // Proper way to call main method with String[] args
        String[] newArgs = {"hello"};  // args array banaya
        Nested_method_basic.main(newArgs);  // Main method ko call kiya
    }
}
