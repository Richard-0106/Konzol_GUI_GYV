
package vizsgafelkeszitoKonzol;

import java.util.Comparator;

public class NevComparator implements Comparator<Eszkoz>{

    @Override
    public int compare(Eszkoz t, Eszkoz t1) {
           return t.getNev().compareTo(t1.getNev());
    }
    
}
