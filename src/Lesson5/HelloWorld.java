package Lesson5;


import javax.swing.*;

/**
 * Created by Андрей on 02.07.2015.
 */
public class HelloWorld extends JFrame{

    public HelloWorld() {
        setSize(200, 300);
        setTitle("Hello World");
        setVisible(true);
    }

    public static void main(String[] args) {

        HelloWorld myHello = new HelloWorld();

    }
}
