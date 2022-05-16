/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vizsgafelkeszitoKonzol;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;

public class main {

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        ArrayList<Harcos> harcosEmberek = new ArrayList<>();
        Harcos h1 = new Harcos(7, 2, "J");

        Harcos h2 = new Harcos(3, 5, "Józsi");
        Harcos h3 = new Harcos(6, 1, "Pál");
        Harcos h4 = new Harcos(2, 1, "János");
        harcosEmberek.add(h1);
        harcosEmberek.add(h2);
        harcosEmberek.add(h3);
        harcosEmberek.add(h4);
        System.out.println("Lista kiírás: ");
        h1.felvesz(new Eszkoz("valami", 2.5));

        System.out.println(h1.toString());

        h2.felvesz(new Eszkoz("Kard", 3));
        h2.felvesz(new Eszkoz("Samurajkard", 10));
        h2.felvesz(new Eszkoz("Bomba", 2));
        System.out.println(h2.toString());

        h3.felvesz(new Eszkoz("Pajzs", 4));
        System.out.println(h3.toString());

        h4.felvesz(new Eszkoz("Bomba", 1));
        h4.felvesz(new Eszkoz("AGránát", 0));
        System.out.println(h4.toString());

        System.out.println("\nKiírás tömbbel:");
        Harcos[] harcosok = {h2, h3, h4};
        kiir(harcosok);

        System.out.println("\nEro szerinti rendezés");
        Arrays.sort(harcosok, new EroComparator());
        kiir(harcosok);

        System.out.println("\nÜgyesség szerinti rendezés");
        Arrays.sort(harcosok, new UgyessegComparator());
        kiir(harcosok);
        System.out.println("\nEszköz szerinti rendezés");
        System.out.println(h2.nevSzerintRendez());

        System.out.println("Állapotmentés");
        System.out.println(h4);
        allapotMentes(h4);
        
        System.out.println(h4.nevSzerintRendez());
        allapotMentes(h4);
        System.out.println("Beolvasás");
        beolvas();
    }

    public static void kiir(Harcos[] harcosok) {

        for (Object harcos : harcosok) {
            System.out.println(harcos);
        }
    }

    public static void allapotMentes(Harcos h) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream("harcos.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(h);
    }

    public static void beolvas() throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream("harcos.dat");
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);

        Harcos h = (Harcos) objectIn.readObject();
        objectIn.close();
        System.out.println(h);
    }
}
