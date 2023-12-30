import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        Manager manager1 = new Manager("1220", "Stevando", 5000000, 500000, 100000);
        Marketing marketing1 = new Marketing("1221", "Christian", 3000000, 350000);
        Honorer honorer1 = new Honorer("1222", "Hesha", 1000000, 100000);
        Honorer honorer2 = new Honorer("1223", "Caecillia", 1000000, 100000);
        Pegawai pegawai1 = new Pegawai("1224", "Dewani", 2500000);
        Pegawai pegawai2 = new Pegawai("1225", "Puspitaningrum", 2500000);

        Honorer[] daftarHonorer = {honorer1, honorer2};
        Pegawai[] daftarPegawai = {pegawai1, pegawai2};

        Kantor kantor = new Kantor(manager1, marketing1, daftarPegawai, daftarHonorer);

        String input = JOptionPane.showInputDialog("Kantor Jaya Jaya Jaya\n"
                + "1. Info Manager\n"
                + "2. Info Marketing\n"
                + "3. Info Honorer\n"
                + "4. Info Pegawai\n"
                + "5. Info Total Gaji Para Pegawai");

        switch (input) {
            case "1":
                String studiManager = manager1.isSelesai() ? "Selesai" : "Belum Selesai";
                JOptionPane.showMessageDialog(null,
                        "NIK        : " + manager1.getNoInduk() + "\n"
                        + "Nama   : " + manager1.getNama() + "\n"
                        + "Studi    : " + studiManager + "\n"
                        + "Gaji Pokok Rp." + manager1.getGajiPokok() + "\n"
                        + "Gaji Lembur Rp." + manager1.getLemburan() + "\n"
                        + "Tunjangan Rp." + manager1.getTunjanganJabatan() + "\n"
                        + "Total Gaji Rp. " + manager1.hitungGaji());
                break;
            case "2":
                String studiMarketing = marketing1.isSelesai() ? "Selesai" : "Belum Selesai";
                JOptionPane.showMessageDialog(null,
                        "NIK        : " + marketing1.getNoInduk() + "\n"
                        + "Nama   : " + marketing1.getNama() + "\n"
                        + "Studi    : " + studiMarketing + "\n"
                        + "Gaji Pokok Rp." + marketing1.getGajiPokok() + "\n"
                        + "Gaji Bonus Rp." + marketing1.getBonus() + "\n"
                        + "Total Gaji Rp. " + marketing1.hitungGaji());
                break;
            case "3":
                String honorerInput = JOptionPane.showInputDialog("Honorer 1 atau Honorer 2");
                if (honorerInput.equals("Honorer 1") || honorerInput.equals("1")) {
                    JOptionPane.showMessageDialog(null,
                            "NIK        : " + honorer1.getNoInduk() + "\n"
                            + "Nama   : " + honorer1.getNama() + "\n"
                            + "Gaji Pokok Rp." + honorer1.getGajiPokok() + "\n"
                            + "Gaji Lembur Rp." + honorer1.getLemburan() + "\n"
                            + "Total Gaji Rp. " + honorer1.hitungGaji());
                } else if (honorerInput.equals("Honorer 2") || honorerInput.equals("2")) {
                    JOptionPane.showMessageDialog(null,
                            "NIK        : " + honorer2.getNoInduk() + "\n"
                            + "Nama   : " + honorer2.getNama() + "\n"
                            + "Gaji Pokok Rp." + honorer2.getGajiPokok() + "\n"
                            + "Gaji Lembur Rp." + honorer2.getLemburan() + "\n"
                            + "Total Gaji Rp. " + honorer2.hitungGaji());
                }
                break;
            case "4":
                String pegawaiInput = JOptionPane.showInputDialog("Pegawai 1 atau Pegawai 2");
                if (pegawaiInput.equals("1")) {
                    JOptionPane.showMessageDialog(null,
                            "NIK        : " + pegawai1.getNoInduk() + "\n"
                            + "Nama   : " + pegawai1.getNama() + "\n"
                            + "Gaji Pokok Rp." + pegawai1.getGajiPokok() + "\n"
                            + "Total Gaji Rp. " + pegawai1.hitungGaji());
                } else if (pegawaiInput.equals("2")) {
                    JOptionPane.showMessageDialog(null,
                            "NIK        : " + pegawai2.getNoInduk() + "\n"
                            + "Nama   : " + pegawai2.getNama() + "\n"
                            + "Gaji Pokok Rp." + pegawai2.getGajiPokok() + "\n"
                            + "Total Gaji Rp. " + pegawai2.hitungGaji());
                }
                break;
            case "5":
                double totalGajiHonorer = honorer1.hitungGaji() + honorer2.hitungGaji();
                double totalGajiPegawai = pegawai1.hitungGaji() + pegawai2.hitungGaji();
                JOptionPane.showMessageDialog(null,
                        "Total Gaji Manager Rp." + manager1.hitungGaji() + "\n"
                        + "Total Gaji Marketing Rp." + marketing1.hitungGaji() + "\n"
                        + "Total Gaji Honorer Rp." + totalGajiHonorer + "\n"
                        + "Total Gaji Pegawai Rp. " + totalGajiPegawai + "\n"
                        + "Total Gaji Semua Pegawai Rp." + kantor.totalGaji());
        }
    }
}