public class Gadget {
    private String merk;
    private String warna;
    private String prosesor;
    private String ram;

    public Gadget(){
    }

    public Gadget(String merk, String warna, String prosesor, String ram) {
        this.merk = merk;
        this.warna = warna;
        this.prosesor = prosesor;
        this.ram = ram;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getProsesor() {
        return prosesor;
    }

    public void setProsesor(String prosesor) {
        this.prosesor = prosesor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }
}
