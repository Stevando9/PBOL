// Stevando Christian Hesha
// 225314181

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class StevandoChristian_225314181 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Stevando Christian - 225314181");
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null); // Tengah layar
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu viewMenu = new JMenu("View");
        JMenu helpMenu = new JMenu("Help");

        ImageIcon newIcon = new ImageIcon("new.png");
        ImageIcon openIcon = new ImageIcon("open.png");
        ImageIcon saveIcon = new ImageIcon("save.png");
        ImageIcon exitIcon = new ImageIcon("exit.png");

        JMenuItem newMenuItem = new JMenuItem("New", newIcon);
        JMenuItem openMenuItem = new JMenuItem("Open...", openIcon);
        JMenuItem saveMenuItem = new JMenuItem("Save", saveIcon);
        JMenuItem exitMenuItem = new JMenuItem("Exit", exitIcon);

        newMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        openMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        saveMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));

        ActionListener menuActionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String menuText = ((JMenuItem) e.getSource()).getText();
                JOptionPane.showMessageDialog(frame, "Anda mengklik '" + menuText + "'");
            }
        };

        newMenuItem.addActionListener(menuActionListener);
        openMenuItem.addActionListener(menuActionListener);
        saveMenuItem.addActionListener(menuActionListener);

        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int response = JOptionPane.showConfirmDialog(frame, "Apakah Anda yakin ingin keluar?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });

        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);
        menuBar.add(helpMenu);

        frame.setJMenuBar(menuBar);

        frame.setVisible(true);
    }
}