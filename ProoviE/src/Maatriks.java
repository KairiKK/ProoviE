/**
 * Created by Kairi on 25.01.2016.
 */

/**
 * Prindi konsooli 9x9 maatriks selliselt, et
 * joonistub suur X �le laua, nagu bingo diagonaalid.
 *
 * N�ide:
 *
 * x       x
 *  x     x
 *   x   x
 *    x x
 *     x
 *    x x
 *   x   x
 *  x     x
 * x       x
 *
 * Kasuta mis iganes t�hiseid soovid �lesande lahendamiseks.
 */

public class Maatriks {


        public static void main(String[] args) {

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (i == j || i + j == 8) {
                        System.out.print("x");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

        }

}
