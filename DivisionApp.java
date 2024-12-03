import javax.swing.*;
import java.awt.event.*;

public class DivisionApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Integer Division");
        JTextField num1Field = new JTextField();
        JTextField num2Field = new JTextField();
        JTextField resultField = new JTextField();
        JButton divideButton = new JButton("Divide");

        num1Field.setBounds(50, 50, 100, 30);
        num2Field.setBounds(50, 100, 100, 30);
        resultField.setBounds(50, 150, 100, 30);
        divideButton.setBounds(50, 200, 100, 30);

        resultField.setEditable(false);
        frame.add(num1Field);
        frame.add(num2Field);
        frame.add(resultField);
        frame.add(divideButton);

        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());
                    int result = num1 / num2;
                    resultField.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid integers.", "Error", JOptionPane.ERROR_MESSAGE);
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(frame, "Division by zero is not allowed.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}