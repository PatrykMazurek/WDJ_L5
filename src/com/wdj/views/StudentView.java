package com.wdj.views;

import javax.swing.*;
import java.awt.*;

public class StudentView {

    public StudentView(){}

    public JPanel view(){
        JPanel studentPanel = new JPanel();
        studentPanel.setLayout(new BoxLayout(studentPanel, BoxLayout.Y_AXIS));
        JPanel unName = new JPanel();
        JLabel nameLabel = new JLabel("Nazwa uniwersytetu");
        unName.add(nameLabel);
        JTextField nameField = new JTextField(20);
        unName.add(nameField);
        unName.setAlignmentX(Component.LEFT_ALIGNMENT);
        studentPanel.add(unName);

        JPanel yearName = new JPanel();
        JLabel yearLabel = new JLabel("Rok akademicki");
        yearName.add(yearLabel);
        JSpinner yearField = new JSpinner(new SpinnerNumberModel(1,1,5,1));
        yearName.add(yearField);
        yearName.setAlignmentX(Component.LEFT_ALIGNMENT);
        studentPanel.add(yearName);

        return studentPanel;
    }
}
