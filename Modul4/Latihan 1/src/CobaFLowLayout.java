import javax.swing.*;
import java.awt.*;
public class CobaFLowLayout extends JFrame {
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    public static void main(String[] args) {
        CobaFLowLayout frm = new CobaFLowLayout();
        frm.setVisible(true);
    }
    public CobaFLowLayout(){
        Container contentPane;
        JButton button1, button2, button3, button4, button5;

        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("Coba Menggunakan FLowLayoutManager");
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        contentPane = getContentPane();
        contentPane.setBackground(Color.WHITE);
        FlowLayout flowLay = new FlowLayout();
        contentPane.setLayout(flowLay);

        button1 = new JButton("button 1");
        button2 = new JButton("button 2");
        button3 = new JButton("button 3");
        button4 = new JButton("button 4");
        button5 = new JButton("button 5");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}