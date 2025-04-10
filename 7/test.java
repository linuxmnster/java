import javax.swing.*;

public class SmallSwingDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Small Demo");
        JButton button = new JButton("Click Me");
        JLabel label = new JLabel("Hello, Swing!");

        frame.setLayout(null);

        label.setBounds(100, 30, 100, 30);
        button.setBounds(90, 70, 100, 30);

        button.addActionListener(e -> label.setText("Button Clicked!"));

        frame.add(label);
        frame.add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
