import javax.swing.*;
public class Main1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ini Frame Pertamaku");

        int tinggi = 400;
        int lebar = 400;

        frame.setBounds(0, 0, lebar, tinggi);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

