public class Marketing extends Pegawai implements TugasBelajar, Pendapatan{
    public double bonus;

    public Marketing(String noInduk, String nama, double gajiPokok, double bonus) {
        super(noInduk, nama, gajiPokok);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double hitungGaji(){
        return gajiPokok + bonus;
    }

    @Override
    public boolean isSelesai(){
        return true;
    }
}
