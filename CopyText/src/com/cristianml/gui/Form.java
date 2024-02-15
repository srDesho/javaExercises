package com.cristianml.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form {
    private JTextField txtText;
    private JButton btnCopy;
    private JTextField txtTextCopied;
    private JPanel panel;
    private JButton btnClean;

    public Form() {
        btnCopy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textCopied = txtText.getText();
                txtTextCopied.setText(textCopied);
            }
        });
        btnClean.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtText.setText("");
                txtTextCopied.setText("");
            }
        });
    }

    public JPanel getPanel(){
        return panel;
    }


}
