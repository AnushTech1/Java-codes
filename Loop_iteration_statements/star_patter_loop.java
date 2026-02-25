                        //=======Star Patter with loop=======//
public class star_patter_loop {

    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 8; j >= i; j--) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
