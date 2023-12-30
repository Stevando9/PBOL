public class Mahasiswa {
    private String nim;
    private String nama;
    private Handphone handphone;
    private Tablet tablet;
    private Laptop laptop;

    public Mahasiswa(String nim, String nama, Handphone handphone, Tablet tablet, Laptop laptop) {
        this.nim = nim;
        this.nama = nama;
        this.handphone = handphone;
        this.tablet = tablet;
        this.laptop = laptop;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Handphone getHandphone() {
        return handphone;
    }

    public void setHandphone(Handphone handphone) {
        this.handphone = handphone;
    }

    public Tablet getTablet() {
        return tablet;
    }

    public void setTablet(Tablet tablet) {
        this.tablet = tablet;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
}
