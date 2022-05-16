
package vizsgafelkeszitoKonzol;

import java.io.Serializable;


public class Eszkoz implements Comparable<Eszkoz>, Serializable {
    private String nev;
    private double suly;

    public Eszkoz(String nev, double suly) {
        this.nev = nev;
        if(this.suly<=10){
        this.suly=10;
        }else{
        this.suly = suly;
        }
    }

    public String getNev() {
        return nev;
    }

    public double getSuly() {
        return suly;
    }

    @Override
    public String toString() {
        return "Eszkoz{" + "nev=" + nev + ", suly=" + suly + '}';
    }

    @Override
    public int compareTo(Eszkoz t) {
       return this.nev.compareTo(t.nev);
    }
    
}
