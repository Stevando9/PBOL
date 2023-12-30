public class Pegawai implements Pendapatan{
    protected String noInduk;
    protected String nama;
    protected double gajiPokok;

    public Pegawai(){

    }

    public Pegawai(String noInduk, String nama, double gajiPokok) {
        this.noInduk = noInduk;
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public String getNoInduk() {
        return noInduk;
    }

    public void setNoInduk(String noInduk) {
        this.noInduk = noInduk;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getGajiPokok()  {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    @Override
    public double hitungGaji(){
        return gajiPokok;
    }
}
