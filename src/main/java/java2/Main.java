package java2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
         lab3 lab3 = new lab3();

         frame.add(lab3);
        frame.setSize(542, 590);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}