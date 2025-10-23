import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BillingSystem extends JFrame implements ActionListener {
    JCheckBox laptop, phone, tablet;
    JButton billBtn;
    JLabel result;

    public BillingSystem() {
        setTitle("Billing System");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        laptop = new JCheckBox("Laptop - ₹50,000");
        phone = new JCheckBox("Phone - ₹20,000");
        tablet = new JCheckBox("Tablet - ₹30,000");

        billBtn = new JButton("Generate Bill");
        billBtn.addActionListener(this);

        result = new JLabel("Total: ₹0");

        setLayout(new FlowLayout());
        add(laptop);
        add(phone);
        add(tablet);
        add(billBtn);
        add(result);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int total = 0;
        if (laptop.isSelected()) total += 50000;
        if (phone.isSelected()) total += 20000;
        if (tablet.isSelected()) total += 30000;
        result.setText("Total: ₹" + total);
    }

    public static void main(String[] args) {
        new BillingSystem();
    }
}
