/* Olio-ohjelmointi 1 kevät 2020
 * Harjoitus 6 Tehtävä 7
 * Jere Salomaa
 * jere.salomaa@tuni.fi
 */

import java.util.Scanner;

public class SalibandymailaTesti {
    public static void main(String[] args) {

        Salibandymaila maila = new Salibandymaila();
        Salibandymaila varaMaila = new Salibandymaila();


        maila.merkki("oxdog");
        maila.pituus(106);
        maila.sallittu(maila.pituus());
        System.out.println(maila.kuluma());
        

        varaMaila.merkki("fatpipe");
        varaMaila.pituus(87);
        varaMaila.sallittu(varaMaila.pituus());

        // Katsotaan, onko maila rikki. Lisätään kulumaa ja tarkistetaan kuluman määrä.
        System.out.println("Is the stick broken? " + maila.onkoRikki());
        System.out.println("Mailan kuluma: " + maila.kuluma());
        maila.kuluu();
        System.out.println("Mailan kuluma: " + maila.kuluma());

        System.out.println("Is the stick broken? " + varaMaila.onkoRikki());
        varaMaila.kuluma(9);
        varaMaila.kuluu();
        System.out.println("Is the stick broken? " + varaMaila.onkoRikki());

        try {
            maila.kuluma(12);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Väärin argumentoitu.");
        }

        try {
            varaMaila.kuluu();
        }
        catch (IllegalStateException e) {
            System.out.println("Maila on paskana, eikä voi kulua enempää.");
        }
        System.out.println("Merkki " + maila.merkki() + ". Pituus " +
        maila.pituus() + ". Onko sallittu:" + maila.sallittu() + ".");

        System.out.println(varaMaila.merkki() + " " + varaMaila.pituus() + " " + varaMaila.sallittu());
        System.out.println(maila.toString());
    }


}