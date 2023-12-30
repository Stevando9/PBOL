public class Manager extends Pegawai implements TugasBelajar, Pendapatan{
    private double tunjanganJabatan;
    private double lemburan;

    public Manager(String noInduk, String nama, double gajiPokok,
                   double tunjanganJabatan, double lemburan) {
        super(noInduk, nama, gajiPokok);
        this.tunjanganJabatan = tunjanganJabatan;
        this.lemburan = lemburan;
    }

    public double getTunjanganJabatan() {
        return tunjanganJabatan;
    }

    public void setTunjanganJabatan(double tunjanganJabatan) {
        this.tunjanganJabatan = tunjanganJabatan;
    }

    public double getLemburan() {
        return lemburan;
    }

    public void setLemburan(double lemburan) {
        this.lemburan = lemburan;
    }

    @Override
    public double hitungGaji(){
        return gajiPokok + tunjanganJabatan + lemburan;
    }

    @Override
    public boolean isSelesai(){
        return true;
    }
}
