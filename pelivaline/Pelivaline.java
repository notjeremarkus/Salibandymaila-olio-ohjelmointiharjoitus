/* Olio-ohjelmointi 1 kevät 2020
 * Harjoitus 6 Tehtävä 7
 * Jere Salomaa
 * jere.salomaa@tuni.fi
 */

package pelivaline;

public abstract class Pelivaline implements Kunto {
    
    // Onko maila sallitun mittainen
    private boolean sallittu;
    
    // Mailan kunto
    private int kuluma;

    public Pelivaline() {
        sallittu = true;
        kuluma = 0;

    }
    public Pelivaline(int p) {
        sallittu(p);
        kuluma();
    }


    // Aksessorit
    public boolean sallittu() {
        return sallittu;
    }

    public void sallittu(int p) {
        if (p >= 87 && p <= 103) {
            sallittu = true;
        }
        else {
            System.out.println(p);
            sallittu = false;
        }
    }

    // Maila kuluu, kun sillä pelaa. Maila ei voi kulua, jos se on rikki.
    public void kuluu() throws IllegalStateException {
        if (onkoRikki()) {
            throw new IllegalStateException();
        }
        else {
            kuluma++;
        }
    }

    public int kuluma() {
        return kuluma;
    }

    public void kuluma(int k) throws IllegalArgumentException {
        if (k < 0 || k > 10) {
            throw new IllegalArgumentException();
        }
        else {
            kuluma = k;
        }
    }

    public boolean onkoRikki() {
        return (kuluma() == 10);
    }

    @Override
    public String toString() {
        String luokanNimi = getClass().getSimpleName();

        return luokanNimi + " " + sallittu() + " " + kuluma();
    }

}