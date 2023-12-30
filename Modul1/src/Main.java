public class Main {
    public static void main(String[] args) {
        Handphone hp = new Handphone("Asus", "Putih", "Intel Atom Z3560", "2 GB", "16 GB", "GSM,HSPA,LTE");
        Tablet tablet = new Tablet("Samsung", "Hitam", "Marvell PXA1088", "1,5 GB", "8 GB", "Wifi");
        Laptop laptop = new Laptop("Lenovo ThinkPad T4000", "Hitam", "Core 2 Duo 2.53 GHz", "2 GB", "160 GB", 3) ;
        Mahasiswa mhs1 = new Mahasiswa("225314181", "Stevando", hp, tablet, laptop);

        System.out.println("Mahasiswa dengan data berikut :");
        System.out.println("Nama  : " + mhs1.getNama());
        System.out.println("NIM   : " + mhs1.getNim());
        System.out.println("");

        System.out.println("Memiliki gadget berikut ini : ");
        System.out.println("\t\tHandphone ");
        System.out.println("merk        : " + hp.getMerk());
        System.out.println("warna       : " + hp.getWarna());
        System.out.println("prosesor    : " + hp.getProsesor());
        System.out.println("ram         : " + hp.getRam());
        System.out.println("rom         : " + hp.getRom());
        System.out.println("konktivitas : " + hp.getKonektivitas());
        System.out.println("");
        System.out.println("\t\tTablet ");
        System.out.println("merk        : " + tablet.getMerk());
        System.out.println("warna       : " + tablet.getWarna());
        System.out.println("prosesor    : " + tablet.getProsesor());
        System.out.println("ram         : " + tablet.getRam());
        System.out.println("rom         : " + tablet.getRom());
        System.out.println("konktivitas : " + tablet.getKonektivitas());
        System.out.println("");
        System.out.println("\t\tLaptop");
        System.out.println("merk        : " + laptop.getMerk());
        System.out.println("warna       : " + laptop.getWarna());
        System.out.println("prosesor    : " + laptop.getProsesor());
        System.out.println("ram         : " + laptop.getRam());
        System.out.println("rom         : " + laptop.getHardisk());
        System.out.println("konktivitas : " + laptop.getJumlahUSB() + " buah");
    }
}
