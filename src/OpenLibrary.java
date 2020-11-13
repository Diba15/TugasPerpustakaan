import java.util.ArrayList;

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
}
