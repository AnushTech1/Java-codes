public class Nested_Disigning {
    public static void main(String[] args) {
        int rows = 7;
        int cols = 6;
        for (int i = 0; i < rows; i++) {
            // H
            for (int j = 0; j < cols; j++) {
                if (j == 0 || j == cols - 1 || i == rows / 2) 
                    System.out.print("* ");
                else 
                    System.out.print("  ");
            }
            System.out.print("   ");
            // E
            for (int j = 0; j < cols; j++) {
                if (j == 0 || i == 0 || i == rows - 1 || i == rows / 2)
                    System.out.print("* ");
                else 
                    System.out.print("  ");
            }
            System.out.print("   ");
            // L
            for (int j = 0; j < cols; j++) {
                if (j == 0 || i == rows - 1)
                    System.out.print("* ");
                else 
                    System.out.print("  ");
            }
            System.out.print("   ");

            // L
            for (int j = 0; j < cols; j++) {
                if (j == 0 || i == rows - 1)
                    System.out.print("* ");
                else 
                    System.out.print("  ");
            }
            System.out.print("   ");

            // O
            for (int j = 0; j < cols; j++) {
                if (j == 0 || j == cols - 1 || i == 0 || i == rows - 1)
                    System.out.print("* ");
                else 
                    System.out.print("  ");
            }

            System.out.println(); // Next row
        }
    }
}
