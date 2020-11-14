public class Majalah extends Koleksi {
    private int noEdisi;
    private String jenisTerbit;

    public Majalah(int noKoleksi, String nama, String penerbit, String tanggalTerbit, String jenis,
                   String status, int noEdisi, String jenisTerbit) {
        super(noKoleksi, nama, penerbit, tanggalTerbit, jenis, status);
        this.noEdisi = noEdisi;
        this.jenisTerbit = jenisTerbit;
    }

    public int getNoEdisi() {
        return noEdisi;
    }

    public String getJenisTerbit() {
        return jenisTerbit;
    }

    @Override
    public void display() {
        System.out.println("No Koleksi : "+getNoKoleksi());
        System.out.println("Nama  \t: "+getNama()+"\t\tPenerbit : "+getPenerbit());
        System.out.println("Jenis \t: "+getJenis()+"\nStatus \t: "+getStatus());
        System.out.println("Tanggal Terbit : "+getTanggalTerbit());
        System.out.println("=======================================================");
        System.out.println("Info Majalah :");
        System.out.println("No Edisi : "+getNoEdisi());
        System.out.println("Jenis Terbit : "+getJenisTerbit());
        System.out.println("-------------------------------------------------------");
    }
}
