package gui;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SwingApp {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Create Frame
        JFrame frame = new JFrame();
        // frame title
        frame.setTitle("Login Form");
        frame.setSize(600, 400);
        frame.setLayout(null); // turn off automatic layout

        JLabel label = new JLabel("Register Here");
        label.setBounds(250, 10, 100, 20);
        frame.add(label);

        JLabel name = new JLabel("Name : ");
        name.setBounds(50, 40, 50, 30);
        frame.add(name);

        JTextField nameField = new JTextField();
        nameField.setBounds(200, 40, 300, 30);
        frame.add(nameField);


        JLabel email = new JLabel("Email : ");
        email.setBounds(50, 80, 80, 30);
        frame.add(email);

        JTextField emailField = new JTextField();
        emailField.setBounds(200, 80, 300, 30);
        frame.add(emailField);

        JLabel password = new JLabel("Password : ");
        password.setBounds(50, 120, 100, 30);
        frame.add(password);

        JTextField passwordField = new JTextField();
        passwordField.setBounds(200, 120, 300, 30);
        frame.add(passwordField);

        JLabel gender = new JLabel("Gender : ");
        gender.setBounds(50, 160, 100, 30);
        frame.add(gender);

        JLabel male = new JLabel("Male");
        male.setBounds(250, 160, 100, 30);
        frame.add(male);

        JRadioButton maleButton =new JRadioButton();
        maleButton.setBounds(200, 160, 40, 30);
        frame.add(maleButton);

        JLabel female = new JLabel("Female");
        female.setBounds(350, 160, 100, 30);
        frame.add(female);

        JRadioButton femaleButton =new JRadioButton();
        femaleButton.setBounds(300, 160, 40, 30);
        frame.add(femaleButton);

         // Group the radio button so only one can be selecte at a time
        ButtonGroup group = new ButtonGroup(); 
        group.add(maleButton);
        group.add(femaleButton);

        JLabel city = new JLabel("City : ");
        city.setBounds(50, 200, 100, 30);
        frame.add(city);

        //Combobox for Dropdown
        String[] cities = {"", "Berlin", "Munich", "Cologne", "Dusseldorf", "Frankfurt", "Hamburg" };
        JComboBox<String> citiesOption = new JComboBox<>(cities);
        citiesOption.setBounds(200, 200, 300, 30);
        frame.add(citiesOption);

        JTextField cityField = new JTextField();
        cityField.setBounds(200, 200, 300, 30);
        frame.add(cityField);

        JLabel register = new JLabel("Register");
        register.setBounds(250, 240, 100, 30);
        frame.add(register); 

        JTextField registerField = new JTextField();
        registerField.setBounds(200, 240, 150, 30);
        frame.add(registerField);

        JLabel cancel = new JLabel("Cancel");
        cancel.setBounds(400, 240, 100, 30);
        frame.add(cancel);

        JTextField cancelField = new JTextField();
        cancelField.setBounds(380, 240, 100, 30);
        frame.add(cancelField);





        frame.setDefaultCloseOperation(3); // close the Frame
        frame.setVisible(true); // make frame visible
    }

}
