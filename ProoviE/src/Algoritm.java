/**
 * Created by Kairi on 26.01.2016.
 */
import java.util.Arrays;

/**
 * if, while, int[]
 * Sulle antakse ette mitu gruppi tudengite hindeid. Kuna maksimum hinne on
 * tegelikult 60 punkti, pead esiteks k�ik suuremad arvud 60 peale �mardama.
 * Teiseks leia mitu tudengit said alla mediaani?
 */
public class Algoritm {

    // Main klass on ainult sulle endale testimiseks
    public static void main(String[] args) {

        System.out.println(allaMediaani(new int[]{19, 45, 55, 67, 89}));
        System.out.println(allaMediaani(new int[]{55, 23, 88, 56, 43, 90, 34}));
        System.out.println(allaMediaani(new int[]{21, 85, 45}));

    }

    // Siia meetodi sisse kirjuta lahendus.
   private static int allaMediaani(int[] ints) {

       for (int i = 0; i < ints.length; i++) {
           if (ints[i] > 60){
               ints[i] = 60;
           }
       }
   }
}