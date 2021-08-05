package src.com.github.M_western.cs3230.GUI;

import javax.swing.*;
import javax.xml.transform.Result;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

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
    String radioButton = "";
    private ButtonGroup buttonGroup;

    public Gui() {
        //this.getContentPane().setLayout(new FlowLayout());
        minRadioButton = new JRadioButton("min");
        minRadioButton.setActionCommand("min");
        maxRadioButton = new JRadioButton("max");
        maxRadioButton.setActionCommand("max");
        evensRadioButton = new JRadioButton("evens");
        evensRadioButton.setActionCommand("evens");
        oddsRadioButton = new JRadioButton("odds");
        oddsRadioButton.setActionCommand("odds");
        sumRadioButton = new JRadioButton("sum");
        sumRadioButton.setActionCommand("sum");
        standardDeviationRadioButton = new JRadioButton("standard dev");
        standardDeviationRadioButton.setActionCommand("std");
        fiveNumberSummaryRadioButton = new JRadioButton("five number summary");
        fiveNumberSummaryRadioButton.setActionCommand("five");
        sumRadioButton.setSelected(true);
        buttonGroup = new ButtonGroup();
        buttonGroup.add(minRadioButton);
        buttonGroup.add(maxRadioButton);
        buttonGroup.add(evensRadioButton);
        buttonGroup.add(oddsRadioButton);
        buttonGroup.add(sumRadioButton);
        buttonGroup.add(standardDeviationRadioButton);
        buttonGroup.add(fiveNumberSummaryRadioButton);
        submitButton = new JButton("submit");
        //submitButton.addActionListener(this);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
                    AbstractButton button = buttons.nextElement();

                    if (button.isSelected()) {
                        ResultField.setText(buttonGroup.getSelection().getActionCommand());
                    }
                }
            }
        });
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
        }

