package main.java.com.levochka108.oop.calculate.view;

import javax.swing.*;

public class MainFrame {

    public void showMainFrame(){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });

    }
    private static void createAndShowGUI() {
        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        JFrame frame = new JFrame("CNC 1.1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MainPanel mainPane = new MainPanel();
        mainPane.setOpaque(true);
        frame.setContentPane(mainPane);
        frame.getRootPane().setDefaultButton(mainPane.getButton());

        frame.pack();
        frame.setVisible(true);
    }

}
