package OOP_Lab_01; // Optional: Remove if not needed

import javax.swing.JOptionPane;

public class Ex2_2_5 {
    public static void main(String[] args) {
        String a, b;
        String strnoti = "You have just entered the numbers: ";

        a = JOptionPane.showInputDialog(null,
                "Please input the first number:",
                "Input the first number",
                JOptionPane.INFORMATION_MESSAGE);
        b = JOptionPane.showInputDialog(null,
                "Please input the second number:",
                "Input the second number",
                JOptionPane.INFORMATION_MESSAGE);
        try {
            double a1 = Double.parseDouble(a);
            double b1 = Double.parseDouble(b);

            strnoti += a + " and " + b + "\n";
            strnoti += "Sum: " + (a1 + b1) + "\n";
            strnoti += "Difference: " + (a1 - b1) + "\n";
            strnoti += "Product: " + (a1 * b1) + "\n";

            if (b1 == 0) {
                strnoti += "Division: Cannot divide by zero!";
            } else {
                strnoti += "Division: " + (a1 / b1);
            }

            JOptionPane.showMessageDialog(null, strnoti,
                    "Show two numbers, sum, difference, product, division",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter numeric values only.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}