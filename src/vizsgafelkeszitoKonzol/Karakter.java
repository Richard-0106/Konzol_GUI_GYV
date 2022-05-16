package vizsgafelkeszitoKonzol;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Karakter implements Serializable {

    private String nev;
    private String faj;
    private ArrayList<Eszkoz> eszkozok;

//    private ArrayList<String> nevLista;
    public Karakter(String nev, String faj) {
        if (nev.length() < 3) {
            try {
                throw new IOException();
            } catch (IOException ex) {
                System.err.println("3 minimum");
            }
        } else {
            this.nev = nev;
        }
        this.faj = faj;
        eszkozok = new ArrayList<>();
        try {
            if (nev.length() < 3) {
                throw new IOException();
            } else {
                this.nev = nev;
            }
        } catch (IOException ex) {
            System.err.println(ex + "A név hossza kisebb mint 3");
        }

    }

    public String getNev() {
        return nev;
    }

    public String getFaj() {
        return faj;
    }

    public void felvesz(Eszkoz eszkoz) {
        eszkozok.add(eszkoz);

    }

    public void eldob(Eszkoz eszkoz) {
        eszkozok.remove(eszkoz);
    }

    public List<Eszkoz> nevSzerintRendez() {
//        nevLista= new ArrayList<>();
//        for (Eszkoz eszkoz : eszkozok) {
//            String s = eszkoz.getNev();
//            nevLista.add(s);
//        }
//        
//    Collections.sort(nevLista);
//        for (String nevek : nevLista) {
//            System.out.println(nevek);
//        }
        ArrayList<Eszkoz> ujlista = new ArrayList(eszkozok);
        Collections.sort(ujlista, new NevComparator());
        return ujlista;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Karakter: (");
        sb.append("nev: ");
        sb.append(nev + " ");
        sb.append("faj: ");
        sb.append(faj + " ");
        for (Eszkoz eszkoz1 : eszkozok) {
            sb.append(eszkoz1);
        }
        return "" + sb;
    }

}
