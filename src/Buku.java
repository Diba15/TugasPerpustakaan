public class Buku extends Koleksi {
    private String pengarang, issn, isbn, doi, arxivId;
    private int tahunMasuk;

    public Buku(int noKoleksi, String nama, String penerbit, String tanggalTerbit, String jenis,
                String status, String pengarang, String issn, String isbn, String doi, String arxivId,
                int tahunMasuk) {
        super(noKoleksi, nama, penerbit, tanggalTerbit, jenis, status);
        this.pengarang = pengarang;
        this.issn = issn;
        this.isbn = isbn;
        this.doi = doi;
        this.arxivId = arxivId;
        this.tahunMasuk = tahunMasuk;
    }

    public String getPengarang() {
        return pengarang;
    }

    public String getIssn() {
        return issn;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getDoi() {
        return doi;
    }

    public String getArxivId() {
        return arxivId;
    }

    public int getTahunMasuk() {
        return tahunMasuk;
    }

    @Override
    public void display() {
        System.out.println("No Koleksi : "+getNoKoleksi());
        System.out.println("Nama  : "+getNama()+"\tPenerbit : "+getPenerbit());
        System.out.println("Jenis : "+getJenis()+"\nStatus : "+getStatus());
        System.out.println("Tanggal Terbit : "+getTanggalTerbit());
        System.out.println("=======================================================");
        System.out.println("Info Buku :");
        System.out.println("Pengarang : "+getPengarang());
        System.out.println("ISSN \t: "+getIssn()+"\t\tISBN : "+getIsbn());
        System.out.println("DOI \t: "+getDoi()+"\tArxiv ID : "+getArxivId());
        System.out.println("Tahun Masuk : "+getTahunMasuk());
        System.out.println("-------------------------------------------------------");
    }
}
