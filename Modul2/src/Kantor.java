public class Kantor {
    private Manager manager;
    private Marketing marketing;
    private Pegawai[] pegawai;
    private Honorer[] honorer;

    public Kantor() {

    }

    public Kantor(Manager manager, Marketing marketing, Pegawai[] pegawai, Honorer[] honorer) {
        this.manager = manager;
        this.marketing = marketing;
        this.pegawai = pegawai;
        this.honorer = honorer;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Marketing getMarketing() {
        return marketing;
    }

    public void setMarketing(Marketing marketing) {
        this.marketing = marketing;
    }

    public Pegawai[] getPegawai() {
        return pegawai;
    }

    public void setPegawai(Pegawai[] pegawai) {
        this.pegawai = pegawai;
    }

    public Honorer[] getHonorer() {
        return honorer;
    }

    public void setHonorer(Honorer[] honorer) {
        this.honorer = honorer;
    }

    public double totalGaji() {
        double totalGaji = 0;

        double gajiManager = manager.hitungGaji();
        totalGaji += gajiManager;

        double gajiMarketing = marketing.hitungGaji();
        totalGaji += gajiMarketing;

        double totalGajiHonorer = 0;
        for (Honorer honorer : honorer){
            totalGajiHonorer += honorer.hitungGaji();
        }
        totalGaji += totalGajiHonorer;

        double totalGajiPegawai = 0;
        for (Pegawai pegawai : pegawai){
            totalGajiPegawai += pegawai.hitungGaji();
        }
        totalGaji += totalGajiPegawai;

        return totalGaji;
    }
}

