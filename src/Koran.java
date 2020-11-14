public class Koran extends Koleksi {
    private String jenisTerbit;

    public Koran(int noKoleksi, String nama, String penerbit, String tanggalTerbit, String jenis,
                 String status, String jenisTerbit) {
        super(noKoleksi, nama, penerbit, tanggalTerbit, jenis, status);
        this.jenisTerbit = jenisTerbit;
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
        System.out.println("Info Koran :");
        System.out.println("Jenis Terbit : "+getJenisTerbit());
        System.out.println("-------------------------------------------------------");
    }
}

