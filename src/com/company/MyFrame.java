package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JPanel;
public class MyFrame extends JFrame {
    Calendar calendar;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    JLabel timeLabel;
    String time;
    JLabel dayLabel;
    String day;
    JLabel dateLabel;
    String date;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Clock Program");
        this.setLayout(new FlowLayout());
        this.setSize(350, 300);
        this.setResizable(false);
        this.setIconImage(new ImageIcon("Wallpaper.jpg").getImage()

        );
        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        dayFormat = new SimpleDateFormat("EEEE");
        dateFormat = new SimpleDateFormat("MMMM dd, yyyy");
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Verdana",Font.PLAIN,50));
        timeLabel.setBackground(new Color(0x066350));
        timeLabel.setForeground(Color.black);
        timeLabel.setOpaque(true);
        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Ink Free",Font.PLAIN,35));
        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Ink Free",Font.PLAIN,35));
        time = timeFormat.format(Calendar.getInstance().getTime());
        timeLabel.setText(time);
        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.setVisible(true);

        setTime();
    }

    public void setTime() {
        while (true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

            day=dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);
            date=dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
