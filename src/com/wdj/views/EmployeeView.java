package com.wdj.views;

import com.wdj.classes.Employee;

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;
import java.util.Date;

public class EmployeeView {

    public JPanel view(){

        JPanel tempEmployee = new JPanel(new GridLayout(3,2));
        tempEmployee.add(new JLabel("Zarobki"));
        JSpinner salary = new JSpinner(new SpinnerNumberModel(2000, 1000, null, 50));
        tempEmployee.add(salary);
        JLabel lBonus = new JLabel("Bonus");
        lBonus.setAlignmentX(Component.RIGHT_ALIGNMENT);
        tempEmployee.add(lBonus);
        JSpinner bonus = new JSpinner(new SpinnerNumberModel( 0, 0, 50, 0.5));
        tempEmployee.add(bonus);
        tempEmployee.add(new JLabel("Data zatrudnienia"));
        JSpinner dateWork = new JSpinner(new SpinnerDateModel(new Date(), null, null , Calendar.DAY_OF_MONTH));
        JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(dateWork, "DD-MM-YYYY");
        dateWork.setEditor(dateEditor);
        tempEmployee.add(dateWork);
        return tempEmployee;
    }
}
