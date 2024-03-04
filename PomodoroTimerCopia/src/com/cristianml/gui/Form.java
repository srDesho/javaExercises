package com.cristianml.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form {
    public JPanel panel;
    private JButton btnStart;
    private JButton btnReset;
    private JLabel lblTitle;
    private JLabel lblTimer;
    private int sessionTime = 3; // 1500sec = 25min
    private int elapsedTime = sessionTime * 1000;
    private int h = elapsedTime / 3600000;
    private int m = (elapsedTime / 60000) % 60;
    private int s = (elapsedTime / 1000) % 60;
    boolean startClicked = false;
    String strH = String.format("%02d", h);
    String strM = String.format("%02d", m);
    String strS = String.format("%02d", s);
    private static JButton lastButtonClic = null;

    public Form() {
        lblTimer.setText(strH + ":" + strM + ":" + strS);

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!startClicked) {
                    timer.start();
                    btnStart.setText("Stop");
                    startClicked = true;
                    lastButtonClic = btnStart;
                } else {
                    timer.stop();
                    btnStart.setText("Continue");
                    startClicked = false;
                }
            }
        });
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lastButtonClic = btnReset;
                stopTimerInZero();
            }
        });
    }

    Timer timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (elapsedTime != 0) {
                elapsedTime -= 1000;
                int h = elapsedTime / 3600000;
                int m = (elapsedTime / 60000) % 60;
                int s = (elapsedTime / 1000) % 60;
                String strH = String.format("%02d", h);
                String strM = String.format("%02d", m);
                String strS = String.format("%02d", s);
                lblTimer.setText(strH + ":" + strM + ":" + strS);
            } else {
                stopTimerInZero();
            }
        }
    });

    public void stopTimerInZero() {
        timer.stop();
        elapsedTime = sessionTime * 1000;
        int h = elapsedTime / 3600000;
        int m = (elapsedTime / 60000) % 60;
        int s = (elapsedTime / 1000) % 60;
        String strH = String.format("%02d", h);
        String strM = String.format("%02d", m);
        String strS = String.format("%02d", s);
        lblTimer.setText(strH + ":" + strM + ":" + strS);
        btnStart.setText("Start");
        startClicked = false;
        if (lastButtonClic != btnReset) {
            message();
        }
    }
    public void message() {
        int choice = JOptionPane.showConfirmDialog(null, "Nice Session", "Session End", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Keep Going.");
        } else if (choice == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Don't Give Up Luck In Next Session.");
        }
    }
}
