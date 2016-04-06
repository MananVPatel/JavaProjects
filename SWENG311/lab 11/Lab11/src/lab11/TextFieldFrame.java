/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

/**
 *
 * @author mvp5542
 */
public class TextFieldFrame extends JFrame {
    
    private final JTextField textField1; // the textfield
    private final JButton button; // just a button
    private final JPasswordField passwordField; // the password field
    private final JRadioButton redJRadioButton; // selects red color
    private final JRadioButton greenJRadioButton; // selects green color
    private final JRadioButton orangeJRadioButton; // selects orange color
    private final JRadioButton blueJRadioButton; // selects blue color
    private final ButtonGroup radioGroup; // holds radio buttons
    
    public TextFieldFrame()
    {
        //call super constructor and pass in the string LAB 11
        super("LAB 11");
        //set the flow layout for jframe
        setLayout(new FlowLayout());
        
        //create an object of JTextField and add it to JFrame
        textField1 = new JTextField("Uneditable text field", 21);
        textField1.setEditable(false);
        add(textField1);
       
       
        //create an object of JButton and add it to JFrame
        button = new JButton("Button"); //button with text "button"
        add(button);
        
        //handle the event when button is pressed
        TextFieldHandler handler;
        handler = new TextFieldHandler();
        button.addActionListener(handler);
        
        //create an object of JPasswordField and add it to JFrame
        passwordField = new JPasswordField("Hidden text");
        add(passwordField);
        
        //create new objects of JRadioButton
        redJRadioButton = new JRadioButton("Red", false);
        greenJRadioButton = new JRadioButton("green", false);
        orangeJRadioButton = new JRadioButton("orange", false);
        blueJRadioButton = new JRadioButton("blue", false);
        
        //add JRadiobuttons to JFrame
        add(redJRadioButton);
        add(greenJRadioButton);
        add(orangeJRadioButton);
        add(blueJRadioButton);
        
        //create logical relationship between JRadioButtons
        radioGroup = new ButtonGroup(); // create button group
        //add following radio buttons to radio group
        radioGroup.add(redJRadioButton);
        radioGroup.add(greenJRadioButton);
        radioGroup.add(orangeJRadioButton);
        radioGroup.add(blueJRadioButton);
        
        //register events for JRadioButtons
        redJRadioButton.addItemListener(new RadioButtonHandler());
        orangeJRadioButton.addItemListener(new RadioButtonHandler());
        greenJRadioButton.addItemListener(new RadioButtonHandler());
        blueJRadioButton.addItemListener(new RadioButtonHandler());
        
    }
    
    private class TextFieldHandler implements ActionListener
    {
        //handle textfield and passwordfield event
        @Override
        public void actionPerformed(ActionEvent event)
        {
            String string = "";
            //when button is pressed copy the contents in the password field and paste them into JtextField
         if (event.getSource() == button)
                textField1.setText(passwordField.getText());

        }
    }
    
    private class ButtonHandler implements ActionListener
    {
        //handle the button event when pressed
        @Override
        public void actionPerformed (ActionEvent event)
        {
            JOptionPane.showMessageDialog(TextFieldFrame.this,event.getActionCommand());
        }
    }
    
    private class RadioButtonHandler implements ItemListener
    {
        //handle the radio button handler event when any of the buttons are selected
        @Override
        public void itemStateChanged(ItemEvent event)
        {
            //when a specific radio button is pressed, set the background color of the content pane to that color
            if(event.getSource() == redJRadioButton)
            {
                getContentPane().setBackground(Color.RED);
            }
            else if(event.getSource() == blueJRadioButton)
            {
                 getContentPane().setBackground(Color.BLUE);
            }
            else if(event.getSource() == orangeJRadioButton)
            {
                 getContentPane().setBackground(Color.ORANGE);
            }
            else if(event.getSource() == greenJRadioButton)
            {
                 getContentPane().setBackground(Color.GREEN);
            }
        }
    }
}
