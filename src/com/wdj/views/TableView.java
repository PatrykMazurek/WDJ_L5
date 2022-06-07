package com.wdj.views;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class TableView {

    List<Object[]> temp;

    public TableView(){
//        final String[] textValue = {""};
//        final int[] numberValue = {0};
        temp = new ArrayList<>();

        JFrame frame = new JFrame("Tabel");

        frame.setBounds(30,30,300,350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel navigationPanel = new JPanel();

        JTextField textName = new JTextField(10);
        JSpinner number = new JSpinner(new SpinnerNumberModel(1,0,100,1));
        JButton addRecord = new JButton("Zapisz");
        addRecord.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textValue = textName.getText();
                int numberValue = Integer.valueOf(number.getValue().toString());

                JOptionPane.showMessageDialog(null,
                        "wpisano " + textValue + " wartość " + numberValue,
                        "Nowy rekord", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        navigationPanel.add(textName);
        navigationPanel.add(number);
        navigationPanel.add(addRecord);

        String[] columnName = {"nr", "Nazwa", "Wartość"};



        Object[][] data = {{ 1, "Owoc", 12},
                { 2, "Skała", 40},
                { 3, "Zienia", 13},
                { 4, "Zwierze", 0},
                { 5, "NIebo", 4}};

        JTable table = new JTable(data, columnName);
        table.setAutoCreateRowSorter(true);

        JScrollPane scrolTable = new JScrollPane(table);

        frame.setJMenuBar(createMenu());
        frame.setLayout(new BorderLayout());
        frame.add(navigationPanel, BorderLayout.NORTH);
        frame.add(scrolTable, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private Object[] addToTable(){

        temp.add(new Object[] {1, "teskt", 45});
        Object[] obj = temp.toArray();
//        for (Object o : obj ){
//            System.out.println(o.toString());
//        }
//        System.out.println(obj.length);
        return obj;
    }

    private JMenuBar createMenu(){
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("Pliki");
        JMenuItem openFile = new JMenuItem("Otwórz");
        openFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser jfc =
                        new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
                jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int resultCode = jfc.showOpenDialog(null);

                if (resultCode == JFileChooser.APPROVE_OPTION){
//                    System.out.println(jfc.getSelectedFile().getParent());
                    System.out.println(jfc.getSelectedFile());
                }
            }
        });
        JMenuItem saveFile = new JMenuItem("Zapisz");
        JMenuItem closeFile = new JMenuItem("Zakończ");
        fileMenu.add(openFile);
        fileMenu.add(saveFile);
        fileMenu.add(closeFile);
        menuBar.add(fileMenu);

        return menuBar;
    }
}
