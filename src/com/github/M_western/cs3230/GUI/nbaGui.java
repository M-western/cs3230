package src.com.github.M_western.cs3230.GUI;

import src.com.github.M_western.cs3230.calculations;
//import src.com.github.M_western.cs3230.httpClient;
//import src.com.github.M_western.cs3230.httpClient;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class nbaGui {
    private JPanel rootPanel;
    private JTextField playerOneFirstText;
    private JTextField playerOneLastText;
    private JTextField playerTwoFirstText;
    private JTextField playerTwoLastText;
    private JLabel fnameLbl;
    private JLabel lnameLbl;
    private JButton submitBtn;
    private JTextArea statsArea;

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public nbaGui() {

        submitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = playerOneFirstText.getText();
                String lastName = playerOneLastText.getText();
                String firstName2 = playerTwoFirstText.getText();
                String lastName2 = playerTwoLastText.getText();

                if ((playerOneFirstText.getText().length()!=0)&&(playerOneLastText.getText().length()!=0)&&
                        (playerTwoFirstText.getText().length()!=0)&&(playerTwoLastText.getText().length()!=0)) {
                    int id1 = httpClient.getIdNum(firstName, lastName);
                    int id2 = httpClient.getIdNum(firstName2, lastName2);
                    float fg_pct = httpClient.getFgPct(id1, id2);
                    statsArea.append("PLayer 1 fg%: " + fg_pct + "\n");
                }

            }
        });
    }
}
