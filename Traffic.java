package javaprograms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Traffic extends JFrame implements ItemListener {
    private JLabel displayLabel;
    private JRadioButton redButton, yellowButton, greenButton;
    private ButtonGroup buttonGroup;

    public Traffic() {
        // Set up the frame
    	setTitle("Traffic signal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1));
        setSize(800, 400);

        // Initialize components
        displayLabel = new JLabel(" ", JLabel.CENTER);
        Font font = new Font("Arial", Font.BOLD, 60);
        displayLabel.setFont(font);
        add(displayLabel);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Create radio buttons for traffic lights
        redButton = new JRadioButton("Red");
        yellowButton = new JRadioButton("Yellow");
        greenButton = new JRadioButton("Green");

        // Group the radio buttons
        buttonGroup = new ButtonGroup();
        buttonGroup.add(redButton);
        buttonGroup.add(yellowButton);
        buttonGroup.add(greenButton);

        // Set background colors
        redButton.setBackground(Color.RED);
        yellowButton.setBackground(Color.YELLOW);
        greenButton.setBackground(Color.GREEN);

        // Add action listeners
        redButton.addItemListener(this);
        yellowButton.addItemListener(this);
        greenButton.addItemListener(this);

        // Add radio buttons to the panel
        panel.add(redButton);
        panel.add(yellowButton);
        panel.add(greenButton);

        // Add panel to the frame
        add(panel);

        // Set default selection
        redButton.setSelected(true);

        // Make the frame visible
        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            JRadioButton selectedButton = (JRadioButton) e.getSource();
            switch (selectedButton.getText()) {
                case "Red":
                    displayLabel.setText("Stop");
                    displayLabel.setForeground(Color.RED);
                    break;
                case "Yellow":
                    displayLabel.setText("Ready");
                    displayLabel.setForeground(Color.YELLOW);
                    break;
                case "Green":
                    displayLabel.setText("Go");
                    displayLabel.setForeground(Color.GREEN);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new Traffic();
    }
}
