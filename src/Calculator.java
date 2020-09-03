//Author Alex Shea ---Shea Technologies

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    public static void main(String[] args) {
        JFrame calFrame = new JFrame();
        JPanel calPanel = new JPanel();

        JTextField calField = new JTextField();


        //-----Row 1
        JButton buttonClear = new JButton("C");
        buttonClear.setFont(new Font("Tahoma", Font.BOLD, 20));
        buttonClear.setBounds(4, 61, 60, 60);

        JButton buttonBack = new JButton("←");
        buttonBack.setFont(new Font("Tahoma", Font.BOLD, 20));
        buttonBack.setBounds(66, 61, 60, 60);

        JButton buttonPercent = new JButton("%");
        buttonPercent.setFont(new Font("Tahoma", Font.BOLD, 20));
        buttonPercent.setBounds(128, 61, 60, 60);

        JButton buttonPlus = new JButton("+");
        buttonPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
        buttonPlus.setBounds(190, 61, 60, 60);


        //-----End of Row 1

        //--------Row 2
        JButton buttonSeven = new JButton("7");
        buttonSeven.setFont(new Font("Tahoma", Font.BOLD, 20));
        buttonSeven.setBounds(4, 120, 60, 60);
        buttonSeven.addActionListener(e -> {
            String EnterNumber = calField.getText() + buttonSeven.getText();
            calField.setText(EnterNumber);
        });

        JButton buttonEight = new JButton("8");
        buttonEight.setFont(new Font("Tahoma", Font.BOLD, 20));
        buttonEight.setBounds(66, 120, 60, 60);
        buttonEight.addActionListener(e -> {
            String EnterNumber = calField.getText() + buttonEight.getText();
            calField.setText(EnterNumber);
        });

        JButton buttonNine = new JButton("9");
        buttonNine.setFont(new Font("Tahoma", Font.BOLD, 20));
        buttonNine.setBounds(128, 120, 60, 60);

        JButton buttonMinus = new JButton("-");
        buttonMinus.setFont(new Font("Tahoma", Font.BOLD, 20));
        buttonMinus.setBounds(190, 120, 60, 60);


        //--------End of Row 2

        //-------Row 3
        JButton buttonFour = new JButton("4");
        buttonFour.setFont(new Font("Tahoma", Font.BOLD, 20));
        buttonFour.setBounds(4, 178, 60, 60);

        JButton buttonFive = new JButton("5");
        buttonFive.setFont(new Font("Tahoma", Font.BOLD, 20));
        buttonFive.setBounds(66, 178, 60, 60);

        JButton buttonSix = new JButton("6");
        buttonSix.setFont(new Font("Tahoma", Font.BOLD, 20));
        buttonSix.setBounds(128, 178, 60, 60);

        JButton buttonMultiply = new JButton("*");
        buttonMultiply.setFont(new Font("Tahoma", Font.BOLD, 20));
        buttonMultiply.setBounds(190, 178, 60, 60);
        //-----End of Row 3

        //-----Row 4
        JButton buttonOne = new JButton("1");
        buttonOne.setFont(new Font("Tahoma", Font.BOLD, 20));
        buttonOne.setBounds(4, 237, 60, 60);

        JButton buttonTwo = new JButton("2");
        buttonTwo.setFont(new Font("Tahoma", Font.BOLD, 20));
        buttonTwo.setBounds(66, 237, 60, 60);

        JButton buttonThree = new JButton("3");
        buttonThree.setFont(new Font("Tahoma", Font.BOLD, 20));
        buttonThree.setBounds(128, 237, 60, 60);

        JButton buttonDivide = new JButton("/");
        buttonDivide.setFont(new Font("Tahoma", Font.BOLD, 20));
        buttonDivide.setBounds(190, 237, 60, 60);
        //-----End of Row 4

        //-----Row 5

        JButton buttonNegative = new JButton("±");
        buttonNegative.setFont(new Font("Tahoma", Font.BOLD, 20));
        buttonNegative.setBounds(4, 295, 60, 60);

        JButton buttonZero = new JButton("0");
        buttonZero.setFont(new Font("Tahoma", Font.BOLD, 20));
        buttonZero.setBounds(66, 295, 60, 60);

        JButton buttonDecimal = new JButton(".");
        buttonDecimal.setFont(new Font("Tahoma", Font.BOLD, 20));
        buttonDecimal.setBounds(128, 295, 60, 60);

        JButton buttonEquals = new JButton("=");
        buttonEquals.setFont(new Font("Tahoma", Font.BOLD, 20));
        buttonEquals.setBounds(190, 295, 60, 60);

        //-----End of Row 5




        //frame methods
        calFrame.setVisible(true);
        calFrame.setBounds(100, 100, 276, 399);
        calFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calFrame.add(calPanel, BorderLayout.CENTER);
        calFrame.setTitle("Java Calculator Project Version 1.0 by Alex Shea");
        calFrame.getContentPane().setLayout(null);


        //panel methods
        calPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        calPanel.add(calField);
        //field methods
        calField.setBounds(5, 10, 245, 45);
        calField.setColumns(10);

        calFrame.getContentPane().add(calField);

        calFrame.add(buttonOne);
        calFrame.add(buttonTwo);
        calFrame.add(buttonThree);
        calFrame.add(buttonFour);
        calFrame.add(buttonFive);
        calFrame.add(buttonSix);
        calFrame.add(buttonSeven);
        calFrame.add(buttonEight);
        calFrame.add(buttonNine);
        calFrame.add(buttonPlus);
        calFrame.add(buttonZero);
        calFrame.add(buttonMinus);
        calFrame.add(buttonMultiply);
        calFrame.add(buttonDivide);
        calFrame.add(buttonDecimal);
        calFrame.add(buttonNegative);
        calFrame.add(buttonClear);
        calFrame.add(buttonEquals);
        calFrame.add(buttonBack);
        calFrame.add(buttonPercent);
















    }
}


