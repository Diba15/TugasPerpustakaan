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

    }
}

