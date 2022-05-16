
package vizsgafelkeszitoKonzol;

import java.util.Comparator;


public class EroComparator implements Comparator<Harcos> {

    @Override
    public int compare(Harcos t, Harcos t1) {
        return t.getEro()-t1.getEro();
    }
    
}
