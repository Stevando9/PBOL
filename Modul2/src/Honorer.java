public class Honorer extends Pegawai implements Pendapatan{
    private double lemburan;

    public Honorer(String noInduk, String nama, double gajiPokok, double lemburan) {
        super(noInduk, nama, gajiPokok);
        this.lemburan = lemburan;
    }

    public double getLemburan() {
        return lemburan;
    }

    public void setLemburan(double lemburan) {
        this.lemburan = lemburan;
    }

    @Override
    public double hitungGaji(){
        return gajiPokok + lemburan;
    }
}
