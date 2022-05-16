package vizsgafelkeszitoKonzol;

import java.io.IOException;
import java.util.Iterator;

public class Harcos extends Karakter implements Comparable<Harcos>,Iterable<Harcos>{

    private int ero;
    private int ugyesseg;

    public Harcos(int ero, int ugyesseg, String nev) throws IOException {
        this(ero, ugyesseg, nev, "ember");
    }

    public Harcos(int ero, int ugyesseg, String nev, String faj) throws IOException {
        super(nev, faj);
        this.ero = ero;
        this.ugyesseg = ugyesseg;
    }

    @Override
    public String toString() {
        return super.toString() + "Harcos{" + "ero=" + ero + ", ugyesseg=" + ugyesseg + '}';
    }

    public void eroSzerintiRendezes() {

    }

    public void ugyessegSzerintiRendezes() {

    }

    public int getEro() {
        return ero;
    }

    public int getUgyesseg() {
        return ugyesseg;
    }

    @Override
    public int compareTo(Harcos t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator<Harcos> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
