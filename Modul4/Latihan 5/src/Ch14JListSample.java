import javax.swing.*;
import java.awt.*;

public class Ch14JListSample extends JFrame {
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 250;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    private JList list;

    public static void main(String[] args) {
        Ch14JListSample frame = new Ch14JListSample();
        frame.setVisible(true);
    }

    public Ch14JListSample(){
        Container contentPane;
        JPanel listPanel, okPanel;

        JButton okButton;
        String[] names = {
                "Ape", "Bat", "Bee", "Cat", "Dog", "Eel", "Fox",
                "Gnu", "Hen", "Man", "Sow", "Yak"
        };

        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setTitle("Program Ch14JListSample2");
        this.setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        contentPane = getContentPane();
        contentPane.setBackground(Color.WHITE);
        contentPane.setLayout(new BorderLayout());

        listPanel = new JPanel(new GridLayout(0, 1));
        listPanel.setBorder(BorderFactory.createTitledBorder("Three-letter Animal Names"));

        list = new JList(names);
        listPanel.add(new JScrollPane(list));

        okPanel = new JPanel(new FlowLayout());
        okButton = new JButton("OK");
        okPanel.add(okButton);

        contentPane.add(listPanel, BorderLayout.CENTER);
        contentPane.add(okPanel, BorderLayout.SOUTH);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}