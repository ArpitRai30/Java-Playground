package sessional3;

import java.awt.event.*;
import javax.swing.*;

public class RegistrationForm extends JFrame implements ActionListener {
    JTextField nameField, mobileField, dobField;
    JTextArea addressArea, outputArea;
    JRadioButton male, female;
    JCheckBox terms;
    JButton submit, reset;
    ButtonGroup genderGroup;

    public RegistrationForm() {
        setTitle("Registration Form");
        setSize(400, 500);
        setLayout(null);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(20, 20, 100, 30);
        nameField = new JTextField();
        nameField.setBounds(150, 20, 200, 30);

        JLabel mobileLabel = new JLabel("Mobile:");
        mobileLabel.setBounds(20, 60, 100, 30);
        mobileField = new JTextField();
        mobileField.setBounds(150, 60, 200, 30);

        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(20, 100, 100, 30);
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        male.setBounds(150, 100, 70, 30);
        female.setBounds(230, 100, 80, 30);
        genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        JLabel dobLabel = new JLabel("DOB:");
        dobLabel.setBounds(20, 140, 100, 30);
        dobField = new JTextField();
        dobField.setBounds(150, 140, 200, 30);

        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(20, 180, 100, 30);
        addressArea = new JTextArea();
        addressArea.setBounds(150, 180, 200, 60);

        terms = new JCheckBox("Accept Terms & Conditions");
        terms.setBounds(50, 250, 250, 30);

        submit = new JButton("Submit");
        submit.setBounds(50, 290, 100, 30);
        reset = new JButton("Reset");
        reset.setBounds(200, 290, 100, 30);

        outputArea = new JTextArea();
        outputArea.setBounds(20, 340, 340, 100);

        add(nameLabel); add(nameField);
        add(mobileLabel); add(mobileField);
        add(genderLabel); add(male); add(female);
        add(dobLabel); add(dobField);
        add(addressLabel); add(addressArea);
        add(terms); add(submit); add(reset);
        add(outputArea);

        submit.addActionListener(this);
        reset.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            if (terms.isSelected()) {
                String gender = male.isSelected() ? "Male" : "Female";
                String data = "Name: " + nameField.getText() + "\n" +
                              "Mobile: " + mobileField.getText() + "\n" +
                              "Gender: " + gender + "\n" +
                              "DOB: " + dobField.getText() + "\n" +
                              "Address: " + addressArea.getText();
                outputArea.setText(data);
            } else {
                outputArea.setText("Please accept Terms & Conditions.");
            }
        } else if (e.getSource() == reset) {
            nameField.setText("");
            mobileField.setText("");
            dobField.setText("");
            addressArea.setText("");
            genderGroup.clearSelection();
            terms.setSelected(false);
            outputArea.setText("");
        }
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}
