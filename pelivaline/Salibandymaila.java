/* Olio-ohjelmointi 1 kevät 2020
 * Harjoitus 6 Tehtävä 7
 * Jere Salomaa
 * jere.salomaa@tuni.fi
 */

package pelivaline;

public class Salibandymaila extends Pelivaline {

    // Sallitut merkit
    public static final String OXDOG = "oxdog";
    public static final String FATPIPE = "fatpipe";
    public static final String UNIHOC = "unihoc";


    // Kätketyt attribuutit
    private String merkki;
    private int pituus;
    private Grip grip;

    public Salibandymaila() {
        super.sallittu();
        merkki = OXDOG;
        pituus = 103;
        grip = new Grip();
    }

    public Salibandymaila(String m, int p) {
        super.sallittu(pituus);
        merkki = m;
        pituus = p;
        grip = new Grip();
    }

    // Aksessorit
    public String merkki() {
        return merkki;
    }

    public void merkki(String m) {
        if (oikeaMerkki(m)) {
            merkki = m;
        }
        else {
            merkki = null;
        }
    }

    public int pituus() {
        return pituus;
    }

    public void pituus(int p) {
        pituus = p;
    }
    

    public boolean oikeaMerkki(String m) {
        return m != null && (m.equals(OXDOG) ||
            (m.equals(FATPIPE)) || (m.equals(UNIHOC)));
    }

    public boolean oikeaMitta(int p) {
        return (p >= 87 && p <= 103);
    }

    // Kuormitetaan super-luokan toString ja korvataan luokan
    // toString. Lisätään koostesuhde-luokan toString.
    @Override
    public String toString() {
        return super.toString() + " " + merkki() + " " + pituus() + " " + grip.toString();
    }
}