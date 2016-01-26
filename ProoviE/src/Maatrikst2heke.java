/**
 * Created by Kairi on 25.01.2016.
 */
public class Maatrikst2heke {

    public static void main(String[] args) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i == 4 || j == 4 || i == j || j + i == 8 ) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}

