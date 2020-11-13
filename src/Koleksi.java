public abstract class Koleksi {
    protected int noKoleksi;
    protected String nama, penerbit, tanggalTerbit, jenis, status;

    public Koleksi(int noKoleksi, String nama, String penerbit, String tanggalTerbit, String jenis, String status) {
        this.noKoleksi = noKoleksi;
        this.nama = nama;
        this.penerbit = penerbit;
        this.tanggalTerbit = tanggalTerbit;
        this.jenis = jenis;
        this.status = status;
    }

    public int getNoKoleksi() {
        return noKoleksi;
    }

    public String getNama() {
        return nama;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public String getTanggalTerbit() {
        return tanggalTerbit;
    }

    public String getJenis() {
        return jenis;
    }

    public String getStatus() {
        return status;
    }

    public abstract void display();
}
