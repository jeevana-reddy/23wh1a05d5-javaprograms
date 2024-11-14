import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormFillingApp extends JFrame {

    // Form fields
    private JTextField nameField;
    private JComboBox<String> branchCombo;
    private JTextField sectionField;
    private JTextField rollNoField;
    private JTextField mailIdField;
    private JRadioButton maleRadio, femaleRadio, otherRadio;
    private JCheckBox termsCheckBox;
    private JButton submitButton;
    private JButton resetButton;
    private JTextArea displayArea;
    private ButtonGroup genderGroup;

    public FormFillingApp() {
        setTitle("Student Form");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel to hold form elements
        JPanel formPanel = new JPanel(new GridLayout(10, 2, 10, 10));

        // Name field
        formPanel.add(new JLabel("Name:"));
        nameField = new JTextField(20);
        formPanel.add(nameField);

        // Branch field with ComboBox
        formPanel.add(new JLabel("Branch:"));
        String[] branches = {"CSE", "ECE", "ME", "CE", "EEE"};
        branchCombo = new JComboBox<>(branches);
        formPanel.add(branchCombo);

        // Section field
        formPanel.add(new JLabel("Section:"));
        sectionField = new JTextField(20);
        formPanel.add(sectionField);

        // Roll Number field
        formPanel.add(new JLabel("College Roll No:"));
        rollNoField = new JTextField(20);
        formPanel.add(rollNoField);

        // Mail ID field
        formPanel.add(new JLabel("Mail ID:"));
        mailIdField = new JTextField(20);
        formPanel.add(mailIdField);

        // Gender Radio Buttons
        formPanel.add(new JLabel("Gender:"));
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        maleRadio = new JRadioButton("Male");
        femaleRadio = new JRadioButton("Female");
        otherRadio = new JRadioButton("Other");
        genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);
        genderGroup.add(otherRadio);
        genderPanel.add(maleRadio);
        genderPanel.add(femaleRadio);
        genderPanel.add(otherRadio);
        formPanel.add(genderPanel);

        // Terms and Conditions Checkbox
        termsCheckBox = new JCheckBox("I agree to the terms and conditions");
        formPanel.add(termsCheckBox);

        // Empty label to fill grid cell
        formPanel.add(new JLabel());

        // Submit and Reset buttons
        submitButton = new JButton("Submit");
        resetButton = new JButton("Reset");
        formPanel.add(submitButton);
        formPanel.add(resetButton);

        add(formPanel, BorderLayout.CENTER);

        // Display area
        displayArea = new JTextArea(6, 30);
        displayArea.setEditable(false);
        add(new JScrollPane(displayArea), BorderLayout.SOUTH);

        // Add action listeners
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleSubmit();
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleReset();
            }
        });
    }

    private void handleSubmit() {
        // Validate if terms are accepted
        if (!termsCheckBox.isSelected()) {
            JOptionPane.showMessageDialog(this, "You must agree to the terms and conditions.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String name = nameField.getText();
        String branch = (String) branchCombo.getSelectedItem();
        String section = sectionField.getText();
        String rollNo = rollNoField.getText();
        String mailId = mailIdField.getText();

        // Determine selected gender
        String gender = "Not specified";
        if (maleRadio.isSelected()) gender = "Male";
        else if (femaleRadio.isSelected()) gender = "Female";
        else if (otherRadio.isSelected()) gender = "Other";

        // Display the entered information in the text area
        displayArea.setText("Submitted Information:\n" +
                "Name: " + name + "\n" +
                "Branch: " + branch + "\n" +
                "Section: " + section + "\n" +
                "College Roll No: " + rollNo + "\n" +
                "Mail ID: " + mailId + "\n" +
                "Gender: " + gender + "\n" +
                "Terms Accepted: Yes\n");
    }

    private void handleReset() {
        // Clear all fields and the display area
        nameField.setText("");
        branchCombo.setSelectedIndex(0);
        sectionField.setText("");
        rollNoField.setText("");
        mailIdField.setText("");
        genderGroup.clearSelection();
        termsCheckBox.setSelected(false);
        displayArea.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FormFillingApp formApp = new FormFillingApp();
            formApp.setVisible(true);
        });
    }
}
