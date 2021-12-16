package ru.mirea.gibo01.pr11;

import javax.swing.*;
import java.awt.*;

public class Pinkpanter extends JFrame {
    JTextField pole = new JTextField(10); // размер поля , тектовое поле
    //Font font = new Font("Calibri", Font.ITALIC, 14); // стиль текста
    JButton button = new JButton("Поiхали");

    Pinkpanter() {
        super("Bandana");
        setLayout(new BorderLayout());
        setSize(200, 75);
        add(pole, BorderLayout.NORTH);
        add(button, BorderLayout.CENTER);
        pole.setForeground(Color.RED);
        pole.setFont(new Font("Calibri", Font.ITALIC, 14)); // анонимный класс
        setVisible(true);

    }

}