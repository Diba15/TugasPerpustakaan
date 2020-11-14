public class CakramDigital extends Koleksi {
    private String jenisMedia;

    public CakramDigital(int noKoleksi, String nama, String penerbit, String tanggalTerbit, String jenis,
                         String status, String jenisMedia) {
        super(noKoleksi, nama, penerbit, tanggalTerbit, jenis, status);
        this.jenisMedia = jenisMedia;
    }

    public String getJenisMedia() {
        return jenisMedia;
    }

    @Override
    public void display() {
        System.out.println("No Koleksi : "+getNoKoleksi());
        System.out.println("Nama  \t: "+getNama()+"\t\tPenerbit : "+getPenerbit());
        System.out.println("Jenis \t: "+getJenis()+"\nStatus \t: "+getStatus());
        System.out.println("Tanggal Terbit : "+getTanggalTerbit());
        System.out.println("=======================================================");
        System.out.println("Info CD :");
        System.out.println("Jenis Media : "+getJenisMedia());
        System.out.println("-------------------------------------------------------");
    }
}
