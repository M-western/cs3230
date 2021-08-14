package src.com.github.M_western.cs3230.GUI;

import javax.swing.*;

public class mainGui {
    private JPanel rootPanel;
    private JTabbedPane tabbedPane1;

    public JPanel getRootPanel() {
        return rootPanel;
    }
    public JTabbedPane getTabbedPane1() {
        return tabbedPane1;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Main");
        mainGui gui = new mainGui();
        gui.getTabbedPane1().addTab("Math", new mathGui().getpanel1());
        gui.getTabbedPane1().addTab("NBA", new nbaGui().getRootPanel());
        frame.setContentPane(gui.rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();frame.setVisible(true);
    }
}
