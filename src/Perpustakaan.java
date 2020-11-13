import java.util.ArrayList;

public class Perpustakaan {
    private ArrayList<Koleksi> ar = new ArrayList<>();

    public void addKoleksi(Koleksi koleksi) {
        ar.add(koleksi);
    }

    public void displayBuku() {
        for (Koleksi koleksi: ar) {
            if (koleksi.getJenis().equalsIgnoreCase("Buku")) {
                koleksi.display();
            }
        }
    }

    public void displayMajalah() {
        for (Koleksi koleksi: ar) {
            if (koleksi.getJenis().equalsIgnoreCase("Majalah")) {
                koleksi.display();
            }
        }
    }

    public void displayKoran() {
        for (Koleksi koleksi: ar) {
            if (koleksi.getJenis().equalsIgnoreCase("Koran")) {
                koleksi.display();
            }
        }
    }

    public void displayCakram() {
        for (Koleksi koleksi: ar) {
            if (koleksi.getJenis().equalsIgnoreCase("Cakram Digital")) {
                koleksi.display();
            }
        }
    }
}
