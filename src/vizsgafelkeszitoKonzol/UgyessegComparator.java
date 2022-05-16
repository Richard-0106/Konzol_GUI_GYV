/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vizsgafelkeszitoKonzol;

import java.util.Comparator;

/**
 *
 * @author ROG Strix
 */
public class UgyessegComparator implements Comparator<Harcos> {

    @Override
    public int compare(Harcos t, Harcos t1) {
       return t.getUgyesseg()-t1.getUgyesseg();
    }
    
}
