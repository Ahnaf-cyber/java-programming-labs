import javax.swing.*;
import java.awt.*;

public class Exercise2 {

    private JFrame frame;
    private JPanel panel;
    private JLabel title;

    private JButton addBtn;
    private JButton viewBtn;
    private JButton updateBtn;
    private JButton deleteBtn;
    private JButton searchBtn;
    private JButton exitBtn;

    public Exercise2() {

        // ===== Frame =====
        frame = new JFrame("Employee Management System");
        frame.setLayout(new BorderLayout());

        // ===== Title =====
        title = new JLabel("Employee Management System", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setForeground(Color.WHITE);
        title.setOpaque(true);
        title.setBackground(new Color(70, 130, 180));

        // ===== Panel for buttons =====
        panel = new JPanel(new GridLayout(6, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50));
        panel.setBackground(new Color(240, 240, 240));

        // ===== Buttons =====
        addBtn    = new JButton("Add Employee");
        viewBtn   = new JButton("View Employees");
        updateBtn = new JButton("Update Employee");
        deleteBtn = new JButton("Delete Employee");
        searchBtn = new JButton("Search Employee");
        exitBtn   = new JButton("Exit");

        Font btnFont = new Font("Arial", Font.BOLD, 14);

        JButton[] buttons = {
            addBtn, viewBtn, updateBtn, deleteBtn, searchBtn, exitBtn
        };

        for (JButton b : buttons) {
            b.setFont(btnFont);
            b.setFocusPainted(false);
            panel.add(b);
        }

        // ===== Add to frame =====
        frame.add(title, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);

        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Exercise2();
    }
}
