public class Tablet extends Gadget{
    private String rom;
    private String konektivitas;

    public Tablet(String rom, String konektivitas) {
        this.rom = rom;
        this.konektivitas = konektivitas;
    }

    public Tablet(String merk, String warna, String prosesor, String ram, String rom, String konektivitas) {
        super(merk, warna, prosesor, ram);
        this.rom = rom;
        this.konektivitas = konektivitas;
    }

    public String getRom() {
        return rom;
    }

    public void setRom(String rom) {
        this.rom = rom;
    }

    public String getKonektivitas() {
        return konektivitas;
    }

    public void setKonektivitas(String konektivitas) {
        this.konektivitas = konektivitas;
    }
}
