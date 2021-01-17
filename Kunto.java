/* Olio-ohjelmointi 1 kevät 2020
 * Harjoitus 6 Tehtävä 7
 * Jere Salomaa
 * jere.salomaa@tuni.fi
 */

public interface Kunto {

    // Peliväline kuluu pelikerroista.
    // Ei voi kulua, jos on rikki.
    public abstract void kuluu() throws IllegalStateException;

    public abstract boolean onkoRikki();
}