import java.util.Scanner;

public class Main {
    static OpenLibrary openLibrary = new OpenLibrary();
    static Scanner scanner = new Scanner(System.in);

    public static void add() {


        openLibrary.addKoleksi(new Buku(1,"Petualangan Dimas","Kadokawa",
                "10 Maret 2001","Buku","Ada","Dimas","A0192",
                "A1029","A82828","PQO102",2001));
    }

    public static void main(String[] args) {
        add();
        openLibrary.displayBuku();
    }
}
