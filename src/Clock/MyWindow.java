package Clock;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class MyWindow extends JFrame {

    private JLabel heading;
    private JLabel clockLabel;

    private Font font = new Font("", Font.BOLD, 35);
    MyWindow(){
        super.setTitle("Clock");
        super.setSize(500, 300);
        super.setLocation(200, 100);
        super.setLocationRelativeTo(null);
        this.createGUI();
        this.startClock();

        super.setVisible(true);
    }

    // GUI for clock
    public void createGUI(){

        heading = new JLabel("---------------  Clock  ---------------");
        heading.setForeground(Color.BLUE);
        clockLabel = new JLabel("My Clock");

        heading.setFont(font);
        clockLabel.setFont(font);

        this.setLayout(new GridLayout(2, 1)); // Creating a grid for where my clock will be show

        this.add(heading);
        this.add(clockLabel);

    }

    // Using Timer
    public void startClock(){

        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //String dateTime = new Date().toString(); // For International standard time

                String dateTime = new Date().toLocaleString(); //For Indian time AM/PM



                clockLabel.setText(dateTime);

            }
        });

        timer.start(); //Start timer
    }
}
