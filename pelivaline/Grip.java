/* Olio-ohjelmointi 1 kevät 2020
 * Harjoitus 6 Tehtävä 7
 * Jere Salomaa
 * jere.salomaa@tuni.fi
 */

package pelivaline;

public class Grip {

    // Mailan grippi ja kaksi sallittua väriä
    public static final char MUSTA = 'M';
    public static final char HARMAA = 'H';
    // Attribuutti
    private char vari;
    // Oletusrakentaja, grippi on oletuksena harmaa
    public Grip() {
        vari = HARMAA;
    }
    // Parametrillinen rakentaja
    public Grip(char uusiVari) throws IllegalArgumentException {
        vari(uusiVari);
    }

    // Aksessorit
    public char vari() {
        return vari;
    }

    public void vari(char a) throws IllegalArgumentException {
        if (a != MUSTA && a != HARMAA) {
            throw new IllegalArgumentException();
        }
        else {
            vari = a;
        }
    }

    // Kuormitetaan toString
    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + vari();
    }
}