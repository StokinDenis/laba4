package com;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        com.MainFrame frame=new com.MainFrame();//создание окна с интерфейсом
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
