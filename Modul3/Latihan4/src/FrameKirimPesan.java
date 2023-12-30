import javax.swing.*;
import javax.swing.JCheckBox;
public class FrameKirimPesan extends JFrame {
    public FrameKirimPesan(){
        this.setSize(300,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Kirim Pesan");

        JPanel panel = new JPanel();

        JTextField text = new JTextField();
        text.setColumns(10);

        JLabel label = new JLabel("Masukkan Pesan");
        panel.add(label);
        panel.add(text);

        JCheckBox checkBox = new JCheckBox("Encrypt");
        panel.add(checkBox);

        this.add(panel);
        this.setVisible(true);
    }

    public static void main(String[] args){
        new FrameKirimPesan();
    }
}
