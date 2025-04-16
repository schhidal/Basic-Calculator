package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Testing {
    public static void main (String[] args){

// create an object
JFrame frame = new JFrame();
frame.setDefaultCloseOperation(3);
frame.setSize(600, 400);

// frame.setLayout(null);
frame.setLayout(null);



// create a label object
JLabel label = new JLabel();
label.setText("Hello !");
label.setBounds(100, 50, 200, 30);
frame.add(label);

JButton button = new JButton("Click Me!");
button.setBounds(100, 100, 100, 30);
frame.add(button);

// add a CLick event to the button
button.addActionListener(   new ActionListener(){
    public void actionPerformed(ActionEvent e){
        label.setText("Clicked !");
    }
}    );
// add Text field
JTextField textField = new JTextField();
textField.setBounds(100, 150, 200, 30);
frame.add(textField);

JButton button2 = new JButton("Greet !");
button2.setBounds(100, 200, 200, 30);
frame.add(button2);


button2.addActionListener(  new ActionListener() {
    public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(button2, textField.getText());
        //System.out.println("Hello : "+textField.getText());
    }
}   );






// make the frame visible
frame.setVisible(true);

    }


}
