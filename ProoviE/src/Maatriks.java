/**
 * Created by Kairi on 25.01.2016.
 */

/**
 * Prindi konsooli 9x9 maatriks selliselt, et
 * joonistub suur X üle laua, nagu bingo diagonaalid.
 *
 * Näide:
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
 * Kasuta mis iganes tähiseid soovid ülesande lahendamiseks.
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
