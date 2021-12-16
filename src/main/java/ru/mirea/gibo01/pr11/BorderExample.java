package ru.mirea.gibo01.pr11;

import javax.swing.*;
import java.awt.*;

public class BorderExample extends JFrame {
    JPanel[] array = new JPanel[12];
    public BorderExample() {
        setLayout(new GridLayout(3,4));
        for (int i = 0; i < array.length;i++) {

            int r, g, b;
            r = (int)  Math.random() * 255;
            g = (int)  Math.random() * 255;
            b = (int)  Math.random() * 255;
            //array[i].setBackground(Color.YELLOW);
            array[i] = new JPanel();

            array[i].setBackground(new Color(r,g,b));
            add(array[i]);

        }
    }

    @Override
    public void setSize(Dimension d) {
        super.setSize(800, 500);
    }

    @Override
    public void setVisible(boolean b) {
        super.setVisible(true);
    }

    @Override
    public void setDefaultCloseOperation(int operation) {
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}