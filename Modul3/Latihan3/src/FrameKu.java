import javax.swing.*;

public class FrameKu extends JFrame {
    public FrameKu(){
        this.setSize(300, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Ini Class turunan dari class JFrame");
        this.setVisible(true);

        JPanel panel = new JPanel();
        JButton tombol = new JButton();
        tombol.setText("Ini Tombolku");
        panel.add(tombol);
        this.add(panel);
    }

    public static void main(String[] args){
        new FrameKu();
    }
}
