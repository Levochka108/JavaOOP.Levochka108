package com.levochka108.dynamicarray.testversion.ui;

import com.levochka108.dynamicarray.model.BusinessLogic;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.MessageFormat;


public class GUIInterface extends JFrame {
    private final JTextField textField;
    private final JLabel lblResult;
    private final BusinessLogic businessLogic;

    public GUIInterface() {
        businessLogic = new BusinessLogic();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 300);
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnInsert = new JButton("Insert");
        btnInsert.addActionListener(e -> insertItem());
        btnInsert.setBounds(10, 10, 89, 23);
        contentPane.add(btnInsert);

        JButton btnRemove = new JButton("Remove");
        btnRemove.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                removeItem();
            }
        });
        btnRemove.setBounds(10, 44, 89, 23);
        contentPane.add(btnRemove);

        JButton btnSearch = new JButton("Search");
        btnSearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                searchItem();
            }
        });
        btnSearch.setBounds(10, 78, 89, 23);
        contentPane.add(btnSearch);

        JButton btnPrint = new JButton("Print");
        btnPrint.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                printArray();
            }
        });
        btnPrint.setBounds(10, 112, 89, 23);
        contentPane.add(btnPrint);

        textField = new JTextField();
        textField.setBounds(109, 11, 265, 20);
        contentPane.add(textField);
        textField.setColumns(10);

        lblResult = new JLabel("");
        lblResult.setBounds(109, 45, 265, 90);
        contentPane.add(lblResult);
    }

    private void insertItem() {
        try {
            int item = Integer.parseInt(textField.getText());
            businessLogic.insertItem(item);
            lblResult.setText("Item inserted successfully.");
        } catch (NumberFormatException ex) {
            lblResult.setText("Invalid input.");
        }
    }

    private void removeItem() {
        try {
            int index = Integer.parseInt(textField.getText());
            businessLogic.removeItem(index);
            lblResult.setText("Item removed successfully.");
        } catch (NumberFormatException ex) {
            lblResult.setText("Invalid input.");
        } catch (IndexOutOfBoundsException ex) {
            lblResult.setText("Index out of bounds.");
        }
    }

    private void searchItem() {
        try {
            int item = Integer.parseInt(textField.getText());
            int index = businessLogic.searchItem(item);
            if (index == -1) {
                lblResult.setText("Item not found.");
            } else {
                lblResult.setText("Item found at index " + index + ".");
            }
        } catch (NumberFormatException ex) {
            lblResult.setText("Invalid input.");
        }
    }

    private void printArray() {
        lblResult.setText(MessageFormat.format("Array: {0}", businessLogic.printArray()));
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GUIInterface frame = new GUIInterface();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
