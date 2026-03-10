                    //============Block Scope============//
public class Method_blockScope {

    public static void main(String[] args) {
        //here can access X value.
        //System.out.println(X);
        {

            //here can access X value.
            //System.out.println(X);
            int X = 10;
            //here can acces X value.
            System.out.println(X);
        }
        //here can access X value.
    }
}
