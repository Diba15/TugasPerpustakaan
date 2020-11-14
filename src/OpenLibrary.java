import java.util.ArrayList;
import java.util.Comparator;

public class OpenLibrary {
    private ArrayList<Koleksi> ar = new ArrayList<>();

    public void addKoleksi(Koleksi koleksi) {
        ar.add(koleksi);
    }

    public void displayBuku() {
        System.out.println("==== BUKU ====");
        for (Koleksi koleksi: ar) {
            if (koleksi.getJenis().equalsIgnoreCase("Buku")) {
                koleksi.display();
            }
        }
    }

    public void displayMajalah() {
        System.out.println("==== MAJALAH ====");
        for (Koleksi koleksi: ar) {
            if (koleksi.getJenis().equalsIgnoreCase("Majalah")) {
                koleksi.display();
            }
        }
    }

    public void displayKoran() {
        System.out.println("==== KORAN ====");
        for (Koleksi koleksi: ar) {
            if (koleksi.getJenis().equalsIgnoreCase("Koran")) {
                koleksi.display();
            }
        }
    }

    public void displayCakram() {
        System.out.println("==== CD ====");
        for (Koleksi koleksi: ar) {
            if (koleksi.getJenis().equalsIgnoreCase("Cakram Digital")) {
                koleksi.display();
            }
        }
    }

    public void compare(int pilihUrut) {
        Comparator<Koleksi> title = new CompareTitle();
        Comparator<Koleksi> noKol = new CompareNoKol();
        switch (pilihUrut) {
            case 1:
                ar.sort(title);
                break;
            case 2:
                ar.sort(noKol);
                break;
            default:
                System.out.println("Pilih yang ada pada pilihan!");
                break;
        }
    }
}
