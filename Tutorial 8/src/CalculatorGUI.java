import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorGUI implements ActionListener {

    private JButton add, min, mul, div;
    private JLabel numL1, numL2;
    private JTextField numT1, numT2;
    private JTextArea outputTextArea;

    private JPanel northPanel, centerPanel, southPanel;
    private JFrame jf;

    public CalculatorGUI() {

        jf = new JFrame("Calculator");
        jf.setLayout(new BorderLayout());

        northPanel = new JPanel(new FlowLayout());
        centerPanel = new JPanel(new BorderLayout());
        southPanel = new JPanel(new FlowLayout());

        numL1 = new JLabel("First number");
        numT1 = new JTextField(10);
        numL2 = new JLabel("Second number");
        numT2 = new JTextField(10);

        northPanel.add(numL1);
        northPanel.add(numT1);
        northPanel.add(numL2);
        northPanel.add(numT2);

        outputTextArea = new JTextArea(5, 40);
        outputTextArea.setEditable(false);
        outputTextArea.setText("Result:\n");

        centerPanel.add(new JScrollPane(outputTextArea));

        add = new JButton("Plus");
        min = new JButton("Minus");
        mul = new JButton("Times");
        div = new JButton("Divides");

        southPanel.add(add);
        southPanel.add(min);
        southPanel.add(mul);
        southPanel.add(div);

        jf.add(northPanel, BorderLayout.NORTH);
        jf.add(centerPanel, BorderLayout.CENTER);
        jf.add(southPanel, BorderLayout.SOUTH);

        add.addActionListener(this);
        min.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        add.setFocusPainted(false);
        min.setFocusPainted(false);
        mul.setFocusPainted(false);
        div.setFocusPainted(false);

        add.setBackground(Color.GREEN);
        min.setBackground(Color.ORANGE);
        mul.setBackground(Color.GREEN);
        div.setBackground(Color.BLUE);

        add.setForeground(Color.BLACK);
        min.setForeground(Color.BLACK);
        mul.setForeground(Color.BLACK);
        div.setForeground(Color.BLACK);

        northPanel.setBackground(new Color(200, 230, 255)); // light blue
        centerPanel.setBackground(Color.WHITE);
        southPanel.setBackground(new Color(220, 220, 220));



        Font f = new Font("Arial", Font.BOLD, 14);

        numL1.setFont(f);
        numL2.setFont(f);
        numT1.setFont(f);
        numT2.setFont(f);

        add.setFont(f);
        min.setFont(f);
        mul.setFont(f);
        div.setFont(f);

        outputTextArea.setFont(new Font("Monospaced", Font.PLAIN, 14));



        jf.setSize(400, 300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        double n1 = Double.parseDouble(numT1.getText());
        double n2 = Double.parseDouble(numT2.getText());
        double result = 0;

        if (e.getSource() == add)
            result = n1 + n2;
        if (e.getSource() == min)
            result = n1 - n2;
        if (e.getSource() == mul)
            result = n1 * n2;
        if (e.getSource() == div)
            result = n1 / n2;

        outputTextArea.append("Result: " + result + "\n");
    }

    public static void main(String[] args) {
        new CalculatorGUI();
    }
}
