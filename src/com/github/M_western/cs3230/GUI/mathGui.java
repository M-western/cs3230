package src.com.github.M_western.cs3230.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import src.com.github.M_western.cs3230.calculations;

public class mathGui {
    private JButton submitButton;
    private JPanel panel1;
    private JTextField entryField;
    private JCheckBox sumCheckBox;
    private JTextArea resultArea;
    private JCheckBox evensCheckBox;
    private JCheckBox oddsCheckBox;
    private JCheckBox maxCheckBox;
    private JCheckBox minCheckBox;
    private JLabel userInputGuide;

    public JPanel getpanel1() {
        return panel1;
    }

    public mathGui() {

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] userInts = entryField.getText().split("\\s+");
                int[] nums = new int[userInts.length];
                for(int i = 0; i <userInts.length; i++){
                    try{
                        nums[i] = Integer.parseInt(userInts[i]);
                    }
                    catch(NumberFormatException ex){
                        System.out.println("Invalid number:" + userInts[i]);
                    }
                }
                if (sumCheckBox.isSelected()) {
                    resultArea.append("sum: " + calculations.sum(nums) + "\n");
                }
                if (evensCheckBox.isSelected()) {
                    resultArea.append("evens: " + calculations.evens(nums) + "\n");
                }
                if (oddsCheckBox.isSelected()) {
                    resultArea.append("odds: " + calculations.odds(nums) + "\n");
                }
                if (maxCheckBox.isSelected()) {
                    resultArea.append("max: " + calculations.max(nums) + "\n");
                }
                if (minCheckBox.isSelected()) {
                    resultArea.append("min: " + calculations.min(nums) + "\n");
                }
            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new JFrame( "CS3230 Project");
        frame.setContentPane(new mathGui().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
        }

