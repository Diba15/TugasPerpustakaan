import java.util.Scanner;

public class Main {
    static OpenLibrary openLibrary = new OpenLibrary();
    static Scanner scanner = new Scanner(System.in);
    static int pilih;

    public static void add() {
        String jenis,status, namaKoleksi, penerbit, tangter;
        int noKoleksi, pilihStatus;
        System.out.println("Data Apa yang ingin anda tambahkan : ");
        System.out.println("1.Buku\t2.Majalah\n3.Koran\t4.Cakram Digital");
        pilih = scanner.nextInt();
        switch (pilih) {
            case 1:
                jenis = "Buku";
                System.out.print("Masukkan Nomor Koleksi : ");
                noKoleksi = scanner.nextInt();
                System.out.print("Masukkan Judul : ");
                namaKoleksi = scanner.next();
                System.out.print("Masukkan Pihak Penerbit : ");
                penerbit = scanner.next();
                System.out.print("Masukkan Tanggal Terbit : ");
                tangter = scanner.next();
                System.out.println("Status[1.Ada\t2.Rusak\t3.Hilang]");
                System.out.print("Pilih : ");
                pilihStatus = scanner.nextInt();
                switch (pilihStatus) {
                    case 1:
                        status = "Ada";
                        break;
                    case 2:
                        status = "Rusak";
                        break;
                    case 3:
                        status = "Hilang";
                        break;
                    default:
                        status = "Koleksi";
                        break;
                }
                System.out.print("Masukkan Pengarang : ");
                String pengarang = scanner.next();
                System.out.print("Masukkan ISSN : ");
                String issn = scanner.next();
                System.out.print("Masukkan ISBN : ");
                String isbn = scanner.next();
                System.out.print("Masukkan DOI : ");
                String doi = scanner.next();
                System.out.print("Masukkan Arxiv ID : ");
                String arxivId = scanner.next();
                System.out.print("Masukkan Tahun Masuk : ");
                int tahunMasuk = scanner.nextInt();
                openLibrary.addKoleksi(new Buku(noKoleksi,namaKoleksi,penerbit,tangter,jenis,status,pengarang,
                        issn,isbn,doi,arxivId,tahunMasuk));
                break;
            case 2 :
                jenis = "Majalah";
                System.out.print("Masukkan Nomor Koleksi : ");
                noKoleksi = scanner.nextInt();
                System.out.print("Masukkan Judul : ");
                namaKoleksi = scanner.next();
                System.out.print("Masukkan Pihak Penerbit : ");
                penerbit = scanner.next();
                System.out.print("Masukkan Tanggal Terbit : ");
                tangter = scanner.next();
                System.out.println("Status[1.Ada\t2.Rusak\t3.Hilang]");
                System.out.print("Pilih : ");
                pilihStatus = scanner.nextInt();
                switch (pilihStatus) {
                    case 1:
                        status = "Ada";
                        break;
                    case 2:
                        status = "Rusak";
                        break;
                    case 3:
                        status = "Hilang";
                        break;
                    default:
                        status = "Koleksi";
                        break;
                }
                System.out.print("Masukkan No Edisi : ");
                int noEdisi = scanner.nextInt();
                System.out.println("Jenis Terbit[1.Mingguan\t2.Bulanan]");
                System.out.print("Pilih : ");
                int jenisTerbit = scanner.nextInt();
                String jenisMajalah;
                switch (jenisTerbit) {
                    case 1:
                        jenisMajalah = "Mingguan";
                        break;
                    case 2:
                        jenisMajalah = "Bulanan";
                        break;
                    default:
                        jenisMajalah = "";
                        break;
                }
                openLibrary.addKoleksi(new Majalah(noKoleksi,namaKoleksi,penerbit,tangter,jenis,status,noEdisi,
                        jenisMajalah));
                break;
            case 3 :
                jenis = "Koran";
                System.out.print("Masukkan Nomor Koleksi : ");
                noKoleksi = scanner.nextInt();
                System.out.print("Masukkan Judul : ");
                namaKoleksi = scanner.next();
                System.out.print("Masukkan Pihak Penerbit : ");
                penerbit = scanner.next();
                System.out.print("Masukkan Tanggal Terbit : ");
                tangter = scanner.next();
                System.out.println("Status[1.Ada\t2.Rusak\t3.Hilang]");
                System.out.print("Pilih : ");
                pilihStatus = scanner.nextInt();
                switch (pilihStatus) {
                    case 1:
                        status = "Ada";
                        break;
                    case 2:
                        status = "Rusak";
                        break;
                    case 3:
                        status = "Hilang";
                        break;
                    default:
                        status = "Koleksi";
                        break;
                }
                System.out.println("Jenis Terbit[1.Harian\t2.Mingguan]");
                System.out.print("Pilih : ");
                int pilihJenis = scanner.nextInt();
                String jenisKoran = "Harian";
                switch (pilihJenis) {
                    case 1:
                        jenisKoran = "Harian";
                        break;
                    case 2:
                        jenisKoran = "Mingguan";
                         break;
                }
                openLibrary.addKoleksi(new Koran(noKoleksi,namaKoleksi,penerbit,tangter,jenis,status, jenisKoran));
                break;
            case 4 :
                jenis = "Cakram Digital";
                System.out.print("Masukkan Nomor Koleksi : ");
                noKoleksi = scanner.nextInt();
                System.out.print("Masukkan Judul : ");
                namaKoleksi = scanner.next();
                System.out.print("Masukkan Pihak Penerbit : ");
                penerbit = scanner.next();
                System.out.print("Masukkan Tanggal Terbit : ");
                tangter = scanner.next();
                System.out.println("Status[1.Ada\t2.Rusak\t3.Hilang]");
                System.out.print("Pilih : ");
                pilihStatus = scanner.nextInt();
                switch (pilihStatus) {
                    case 1:
                        status = "Ada";
                        break;
                    case 2:
                        status = "Rusak";
                        break;
                    case 3:
                        status = "Hilang";
                        break;
                    default:
                        status = "Koleksi";
                        break;
                }
                System.out.println("Jenis Media[1.Biasa\t2.Bluray\t3.CD RIP]");
                System.out.print("Pilih : ");
                int pilihMedia = scanner.nextInt();
                String jenisMedia = "Biasa";
                switch (pilihMedia) {
                    case 1:
                        jenisMedia = "Biasa";
                        break;
                    case 2:
                        jenisMedia = "Bluray";
                        break;
                    case 3:
                        jenisMedia = "CD RIP";
                        break;
                }
                openLibrary.addKoleksi(new CakramDigital(noKoleksi,namaKoleksi,penerbit,tangter,jenis,status,
                        jenisMedia));
                break;
        }
    }

    public static void displayKoleksi() {
        System.out.println("Tampilkan");
        System.out.println("1.Buku\t2.Majalah\n3.Koran\t4.Cakram Digital");
        System.out.print("Pilih : ");
        pilih = scanner.nextInt();
        switch (pilih) {
            case 1:
                openLibrary.displayBuku();
                break;
            case 2:
                openLibrary.displayMajalah();
                break;
            case 3:
                openLibrary.displayKoran();
                break;
            case 4:
                openLibrary.displayCakram();
                break;
            default:
                System.out.println("Pilih yang ada Pada Pilihan");
                break;
        }
    }

    public static void runThis() {
        do {
            System.out.println("===== Open Library =====");
            System.out.println("1.Tambah Koleksi\n2.Display Koleksi\n3.Exit");
            System.out.print("Pilih : ");
            pilih = scanner.nextInt();
            switch (pilih) {
                case 1:
                    add();
                    break;
                case 2:
                    displayKoleksi();
                    break;
                case 3:
                    System.out.println("Terima Kasih!");
                    System.exit(1);
                    break;
                default:
                    System.out.println("Pilih yang ada pada pilihan!");
                    break;
            }
        } while (true);
    }

    public static void dummy() {
        openLibrary.addKoleksi(new Buku(1,"Petualangan Dimas","Kadokawa",
                "10 Maret 2001","Buku","Ada","Dimas","A0192",
                "A1029","A82828","PQO102",2001));
    }

    public static void main(String[] args) {
        dummy();
        runThis();
    }
}
