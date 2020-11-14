import java.util.Comparator;

public class CompareNoKol implements Comparator<Koleksi> {

    @Override
    public int compare(Koleksi o1, Koleksi o2) {
        return Integer.compare(o1.getNoKoleksi(), o2.noKoleksi);
    }
}
