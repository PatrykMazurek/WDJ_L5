package com.wdj.views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

public class MainWindow {

    public MainWindow(){

        String[] formType = new String[] { "Wybierz", "Student", "Pracownik", "Kierownik"};

        JFrame frame = new JFrame("My Application");
//        frame.setBounds(50, 60, 400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JLabel label = new JLabel("Dowolny tekst w kontrolce JLabel");
        panel.add(label);

        JTextField textField = new JTextField(10);
        panel.add(textField);

        JPanel spinnerPanel = new JPanel();
        JSpinner number = new JSpinner(new SpinnerNumberModel(0, 0.0,
                100.0, 0.1));


        SpinnerDateModel model = new SpinnerDateModel(new Date(), null, null, Calendar.DATE);
        JSpinner dateSpiner = new JSpinner(model);
        JSpinner.DateEditor editor = new JSpinner.DateEditor(dateSpiner, "dd/MM/yyyy");
        dateSpiner.setEditor(editor);
        spinnerPanel.add(number);

        JLabel result = new JLabel();
        spinnerPanel.add(result);

        JComboBox formCombo = new JComboBox(formType);


//        JCheckBox checkBox = new JCheckBox("zanacz ale bo nie");
//        checkBox.setBounds(20, 240, 100, 30);


        Button saveButton = new Button("Zapisz");
//        saveButton.setBounds(50, 110, 80, 30);
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = formCombo.getSelectedIndex();
                String form = formType[index];
                String form2 = formCombo.getSelectedItem().toString();
                result.setText(textField.getText() + " " + number.getValue() + " " + form2);

            }
        });
        frame.setLayout(new GridLayout(5,2));
        frame.add(new StudentView().view());
        frame.add(new EmployeeView().view());
//        frame.add(panel);
//        frame.add(spinnerPanel);
//        frame.add(saveButton);
//        frame.add(dateSpiner);

        frame.pack();

//        frame.setLayout(null);
        frame.setVisible(true);

    }

}
