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

    }
}
