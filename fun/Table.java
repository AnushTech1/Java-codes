public class Table{
    public static void main(String[] args){
        // simple nested loopp example to print table of 1 to 10
        for( int a = 1; a<= 10; a++){
            for(int b = 1; b<= 10; b++){
                System.out.println(a + " * " + b + " = " + a*b);
            }
            System.out.println();//for space
        }
    }
}