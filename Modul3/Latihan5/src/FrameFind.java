import javax.swing.*;
import java.awt.*;
public class FrameFind extends JFrame{
    public FrameFind(){
        this.setSize(400, 130);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Find");

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel label = new JLabel("Keyword : ");
        label.setBounds(15, 5, 85, 20);
        JTextField text = new JTextField(15);
        text.setBounds(15, 27, 350, 20);
        JButton button = new JButton("Find");
        button.setBounds(15,55,73,23);

        this.add(text);
        this.add(button);
        this.add(label);
        this.add(panel);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new FrameFind();
    }
}