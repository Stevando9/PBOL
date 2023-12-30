import javax.swing.*;

public class FrameKu extends JFrame {
    public FrameKu(){
        this.setSize(300, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Ini Class turunan dari class JFrame");
        this.setVisible(true);
    }

    public static void main(String[] args){
        new FrameKu();
    }
}
