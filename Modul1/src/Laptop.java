public class Laptop extends Gadget{
    private String hardisk;
    private int jumlahUSB;

    public Laptop(String hardisk, int jumlahUSB) {
        this.hardisk = hardisk;
        this.jumlahUSB = jumlahUSB;
    }

    public Laptop(String merk, String warna, String prosesor, String ram, String hardisk, int jumlahUSB) {
        super(merk, warna, prosesor, ram);
        this.hardisk = hardisk;
        this.jumlahUSB = jumlahUSB;
    }

    public String getHardisk() {
        return hardisk;
    }

    public void setHardisk(String hardisk) {
        this.hardisk = hardisk;
    }

    public int getJumlahUSB() {
        return jumlahUSB;
    }

    public void setJumlahUSB(int jumlahUSB) {
        this.jumlahUSB = jumlahUSB;
    }
}
