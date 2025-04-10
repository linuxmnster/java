import javax.swing.*;
import java.awt.*;

public class SwingDemo extends JFrame implements ActionListener {
    JTextField nameField;
    JList<String> languageList;
    JSlider skillSlider;
    JLabel resultLabel;

    public SwingDemo() {
        setTitle("Swing Components Demo");
        setSize(350, 350);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Name Input
        add(new JLabel("Name:"));
        nameField = new JTextField(15);
        add(nameField);

        // Language Selection
        add(new JLabel("Favorite Language:"));
        String[] langs = {"Java", "Python", "C++", "JavaScript"};
        languageList = new JList<>(langs);
        languageList.setVisibleRowCount(2);
        add(new JScrollPane(languageList));

        // Skill Slider
        add(new JLabel("Skill (1-10):"));
        skillSlider = new JSlider(1, 10, 5);
        skillSlider.setPaintTicks(true);
        skillSlider.setPaintLabels(true);
        skillSlider.setMajorTickSpacing(1);
        add(skillSlider);

        // Submit Button
        JButton submitBtn = new JButton("Submit");
        submitBtn.addActionListener(this);
        add(submitBtn);

        // Result Label
        resultLabel = new JLabel("Fill the form and click Submit.");
        add(resultLabel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String lang = languageList.getSelectedValue();
        int skill = skillSlider.getValue();

        if (name.isEmpty() || lang == null)
            resultLabel.setText("Please fill all fields.");
        else
            resultLabel.setText("Name: " + name + ", Language: " + lang + ", Skill: " + skill);
    }

    public static void main(String[] args) {
        new SwingDemo();
    }
}
