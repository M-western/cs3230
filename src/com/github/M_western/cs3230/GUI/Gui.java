package src.com.github.M_western.cs3230.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import src.com.github.M_western.cs3230.calculations;

public class Gui {
    private JButton submitButton;
    private JPanel panel1;
    private JTextField EntryField;
    private JTextField ResultField;
    private JRadioButton minRadioButton;
    private JRadioButton maxRadioButton;
    private JRadioButton evensRadioButton;
    private JRadioButton oddsRadioButton;
    private JRadioButton sumRadioButton;
    private JRadioButton standardDeviationRadioButton;
    private JRadioButton fiveNumberSummaryRadioButton;

    Double[] results;

    public Gui() {
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                results = getResults();
                String resultString = String.valueOf(results);
                ResultField.setText(resultString);
            }
        });
    }

    public Gui() {
        SubmitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                results = getResults();
                String resultString = String.valueOf(results);
                ResultField.setText(resultString);
            }
        });
    }

    minRadioButton.addActionListener(new

    ActionListener() {
        @Override
        public void actionPerformed (ActionEvent e){
            ResultField.setText(String.valueOf(calculations.min(results)));
        }
    });

    public Double[] getResults(){

    }

    public static void main(String[] args){
        JFrame frame = new JFrame( "CS3230 Project");
        frame.setContentPane(new Gui().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }


