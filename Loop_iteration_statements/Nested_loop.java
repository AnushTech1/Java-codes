                    //=======Nested For Loop Statement=======//
package Loop_iteration_statements;

public class Nested_loop {

    public static void main(String[] arga) {
        //Nested loop me hum ek loop ke andar dusra loop chala sakte hai.
        //iske use se complex works ko asan tarike se kar sakte hai.
        //isme ek outer loop hota hai aur ek inner loop hota hai.
        for(int i = 1; i <= 10; i++){
            System.out.println("The table of " + i + " is");
            for(int j = 1; j <= 10; j++){
                System.out.println(i+" * "+ j +" = "+ (i*j));
            }
        }
    }
}
