package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class claculatorJava implements ActionListener{
	JFrame frame;
	JTextField textfield;
	JButton[] numberButtons = new JButton[10];
	JButton [] functionsButton = new JButton[9];
	JButton addButton,subButton,mulButton,divButton;
	JButton decButton,equButton,delButton,clrButton,negButton;
	JPanel panel;
	
	Font myFont = new Font("italic", Font.BOLD,25);
	
	double num1=0,num2=0,result=0;
	char operator; // this like holder for such signs - ! = /
	claculatorJava() {
		
		frame = new JFrame("CALC");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 550);
		frame.setLayout(null);
		
		textfield = new JTextField();
		textfield.setBounds(50,25,300,50);
		textfield.setFont(myFont);
		textfield.setEditable(false);
		
		
		mulButton = new JButton("*"); 
        addButton = new JButton("+"); 
        subButton = new JButton("-"); 
        divButton = new JButton("/"); 
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Delete");
        clrButton = new JButton("Clear");
        negButton = new JButton("(-)");
		
		    functionsButton[0] = mulButton;
	        functionsButton[1] = addButton;
	        functionsButton[2] = subButton;
	        functionsButton[3] = divButton;
	        functionsButton[4] = decButton;
	        functionsButton[5] = equButton;
	        functionsButton[6] = delButton;
	        functionsButton[7] = clrButton;
	        functionsButton[8] = negButton;
				
		for (int i = 0; i < 9; i++) {
            functionsButton[i].addActionListener(this);
            functionsButton[i].setFont(myFont);
            functionsButton[i].setFocusable(false);
		
		}
		 for (int i = 0; i < 10; i++) {
			 numberButtons[i] = new JButton(String.valueOf(i));
			 numberButtons[i].addActionListener(this);
			 numberButtons[i].setFont(myFont);
			 numberButtons[i].setFocusable(false);
			 
		 }
		 negButton.setHorizontalAlignment(SwingConstants.CENTER);
		 delButton.setHorizontalAlignment(SwingConstants.CENTER);
	     clrButton.setHorizontalAlignment(SwingConstants.CENTER);
	     negButton.setBounds(50,430,100,50);
		 delButton.setBounds(150, 430, 100, 50); 
		 clrButton.setBounds(250, 430, 100, 50); 
		 
		 
		 
		 panel = new JPanel();
		 panel.setBounds(50, 100, 300, 300);
		 panel.setLayout(new GridLayout(4,4,10,10)); // the grit definition
		 // Demonstration of the grit panel.setBackground(Color.gray);
		
		 	panel.add(numberButtons[1]);
			panel.add(numberButtons[2]);
			panel.add(numberButtons[3]);
			panel.add(divButton);
			panel.add(numberButtons[4]);
			panel.add(numberButtons[5]);
			panel.add(numberButtons[6]);
			panel.add(mulButton);
			panel.add(numberButtons[7]);
			panel.add(numberButtons[8]);
			panel.add(numberButtons[9]);
			panel.add(subButton);
			panel.add(decButton);
			panel.add(numberButtons[0]);
			panel.add(addButton);
			panel.add(equButton);
	
		frame.add(panel); 
		frame.add(negButton);
		frame.add(clrButton);
		frame.add(delButton);
		frame.add(textfield);
		frame.setVisible(true);
	}
	public static void main (String[] args) {

		// creating instance of this file
		claculatorJava calc = new claculatorJava();
		
	}
	@Override
	public void actionPerformed(ActionEvent ff) {
	
		for (int i=0;i<10; i++) {
			if(ff.getSource() == numberButtons[i]) {
				textfield.setText(textfield.getText().concat(String.valueOf(i)));
				
			}
			
		}
		if(ff.getSource()==decButton) {
			textfield.setText(textfield.getText().concat(String.valueOf(".")));
			
		}
		
		if(ff.getSource()==addButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '+';
			textfield.setText("");
			
		}
		if(ff.getSource()==subButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator ='-';
			textfield.setText("");

		}

		if(ff.getSource()==mulButton) {

			num1 = Double.parseDouble(textfield.getText());
			operator ='*';
			textfield.setText("");

		}
		if(ff.getSource()==divButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator ='/';
			textfield.setText("");

		}
		if(ff.getSource()==equButton) {
			num2 = Double.parseDouble(textfield.getText());
			
			if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
				switch (operator) {
	            case '+':
	                result = num1 + num2;
	                break;
	            case '-':
	                result = num1 - num2;
	                break;
	            case '*':
	                result = num1 * num2;
	                break;
	            case '/':
	                if (num2 != 0) {
	                    result = num1 / num2;
	                } else {
	                    System.out.println("Division by zero is not allowed");
	                    // You may want to handle this error case more gracefully.
	                }
	                break;
	        }
				textfield.setText(String.valueOf(result));
				num1 = result;
				
			} else if (operator == '=') {
		        // Do nothing when the previous operator is '='
		    } else {
		        // Handle the case where an operator is not specified.
		        System.out.println("Operator is missing");
		        // You may want to handle this error case more gracefully.
		    }
			 operator = '=';
			 
		}
		if(ff.getSource()==clrButton) {
			textfield.setText("");
		
		}
		if(ff.getSource()==delButton) {
			String string = textfield.getText();
			textfield.setText("");
			for(int i = 0; i < string.length()-1; i++) {
				textfield.setText(textfield.getText()+string.charAt(i));
			}
		}
		if(ff.getSource()==negButton) {
			double temp = Double.parseDouble(textfield.getText());
			temp*=-1;
			textfield.setText(String.valueOf(temp));

		}
	}
}
