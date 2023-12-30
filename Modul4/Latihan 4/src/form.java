import javax.swing.*;
import java.awt.*;
public class form extends JFrame {
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 500;
    private static final int FRAME_X_ORIGIN = 200;
    private static final int FRAME_Y_ORIGIN = 100;
    private static final int BUTTON_WIDHT = 150;
    private static final int BUTTON_HEIGHT = 30;
    private JButton cancelButton;
    private JButton okButton;

    public static void main(String[] args) {
        form frame = new form();
        frame.setVisible(true);
    }

    public form(){
        this.setBackground(Color.white);
        this.setLayout(null);
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setResizable(false);
        this.setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Input Data");

        JLabel nama = new JLabel("Nama:");
        nama.setBounds(20, 30, BUTTON_WIDHT, BUTTON_HEIGHT);
        JTextField textNama = new JTextField(15);
        textNama.setBounds(160, 40, 400,BUTTON_HEIGHT);

        JLabel jenisKelamin = new JLabel("Jenis Kelamin:");
        jenisKelamin.setBounds(20, 100,2* BUTTON_WIDHT , BUTTON_HEIGHT);
        JRadioButton jk1 = new JRadioButton("Laki-laki");
        jk1.setBounds(160, 100, BUTTON_WIDHT , BUTTON_HEIGHT);
        JRadioButton jk2 = new JRadioButton("Perempuan");
        jk2.setBounds(320, 100, BUTTON_WIDHT , BUTTON_HEIGHT);

//        jenisKelamin.setOpaque(false);
//        jk1.setOpaque(false);
//        jk2.setOpaque(false);

        ButtonGroup gender = new ButtonGroup();
        gender.add(jk1);
        gender.add(jk2);


        JLabel hobi = new JLabel("Hobi:");
        hobi.setBounds(20, 150, BUTTON_WIDHT, BUTTON_HEIGHT);
        JCheckBox olahraga = new JCheckBox("Olahraga");
        olahraga.setBounds(160, 150, BUTTON_WIDHT, BUTTON_HEIGHT);
        JCheckBox shopping = new JCheckBox("Shopping");
        shopping.setBounds(160, 200, BUTTON_WIDHT , BUTTON_HEIGHT);
        JCheckBox ComputerGames = new JCheckBox("Computer Games");
        ComputerGames.setBounds(160, 250, BUTTON_WIDHT , BUTTON_HEIGHT);
        JCheckBox nontonBioskop = new JCheckBox("Nonton Bioskop");
        nontonBioskop.setBounds(160, 300, BUTTON_WIDHT , BUTTON_HEIGHT);

//        hobi.setOpaque(false);
//        olahraga.setOpaque(false);
//        shopping.setOpaque(false);
//        ComputerGames.setOpaque(false);
//        nontonBioskop.setOpaque(false);

        okButton = new JButton("OK");
        okButton.setBounds(150,400, 100, 30);
        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(350, 400, 100, 30);

        this.add(nama);
        this.add(textNama);
        this.add(jenisKelamin);
        this.add(jk1);
        this.add(jk2);
        this.add(hobi);
        this.add(olahraga);
        this.add(shopping);
        this.add(ComputerGames);
        this.add(nontonBioskop);
        this.add(okButton);
        this.add(cancelButton);

    }
}
