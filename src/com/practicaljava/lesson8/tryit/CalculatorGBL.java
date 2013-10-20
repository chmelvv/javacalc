package com.practicaljava.lesson8.tryit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CalculatorGBL {

	private JPanel windowContent;
	private JTextField displayField, emptyField;
	private JButton buttonBS, buttonCE, buttonC;
	private JButton mcButton, button7, button8, button9, buttonDivide, buttonSqrt;
	private JButton mrButton, button4, button5, button6, buttonMultiply, buttonPercent;
	private JButton msButton, button1, button2, button3, buttonSubtract, buttonDX;
	private JButton mplusButton, button0, buttonSign, buttonPoint, buttonAdd, buttonEqual;
	
	CalculatorGBL()
	{
		windowContent = new JPanel();
		GridBagLayout gb = new GridBagLayout();
		windowContent.setLayout(gb);
		
		GridBagConstraints constr = new GridBagConstraints();
		CalculatorEngine calcEngine = new CalculatorEngine(this);
		
		//displayField
		constr.gridx = 0;
		constr.gridy = 0;
		constr.gridheight = 1;
		constr.gridwidth = 6;
		constr.fill = constr.BOTH;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.anchor = constr.CENTER;
		constr.insets = new Insets(10,10,20,10); 
		
		displayField = new JTextField();
		displayField.setHorizontalAlignment(JTextField.RIGHT);
		gb.setConstraints(displayField, constr);
		windowContent.add(displayField);
		
		//zero Row
		constr.gridx = 0;
		constr.gridy = 1;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.fill = constr.BOTH;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.anchor = constr.CENTER;
		constr.insets = new Insets(0,10,10,20); 
		
		emptyField = new JTextField();
		emptyField.setEditable(false);
		gb.setConstraints(emptyField, constr);
		windowContent.add(emptyField);
		
		constr.gridx = 1;
		constr.gridy = 1;
		constr.gridheight = 1;
		constr.gridwidth = 2;
		constr.fill = constr.BOTH;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.anchor = constr.CENTER;
		constr.insets = new Insets(0,0,10,10); 
		
		buttonBS = new JButton("Backspace");
		buttonBS.addActionListener(calcEngine); //register listener
		gb.setConstraints(buttonBS, constr);
		windowContent.add(buttonBS);
		
		constr.gridx = 3;
		constr.gridy = 1;
		constr.gridheight = 1;
		constr.gridwidth = 2;
		constr.fill = constr.BOTH;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.anchor = constr.CENTER;
		
		buttonCE = new JButton("CE");
		buttonCE.addActionListener(calcEngine);
		gb.setConstraints(buttonCE, constr);
		windowContent.add(buttonCE);
		
		constr.gridx = 5;
		constr.gridy = 1;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.fill = constr.BOTH;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.anchor = constr.CENTER;
		
		buttonC = new JButton("C");
		buttonC.addActionListener(calcEngine);
		gb.setConstraints(buttonC, constr);
		windowContent.add(buttonC);
		
		
		
		//first Row
		constr.gridx = 0;
		constr.gridy = 2;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.fill = constr.BOTH;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.anchor = constr.CENTER;
		constr.insets = new Insets(0,10,10,20); 
		
		mcButton = new JButton("MC");
		mcButton.addActionListener(calcEngine);
		gb.setConstraints(mcButton, constr);
		windowContent.add(mcButton);
		
		constr.gridx = 1;
		constr.gridy = 2;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.fill = constr.BOTH;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.anchor = constr.CENTER;
		constr.insets = new Insets(0,0,10,10); 
		
		button7 = new JButton("7");
		button7.addActionListener(calcEngine);
		gb.setConstraints(button7, constr);
		windowContent.add(button7);
		
		constr.gridx = 2;
		constr.gridy = 2;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.fill = constr.BOTH;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.anchor = constr.CENTER;
		
		button8 = new JButton("8");
		button8.addActionListener(calcEngine);
		gb.setConstraints(button8, constr);
		windowContent.add(button8);
		
		constr.gridx = 3;
		constr.gridy = 2;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.fill = constr.BOTH;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.anchor = constr.CENTER;
		
		button9 = new JButton("9");
		button9.addActionListener(calcEngine);
		gb.setConstraints(button9, constr);
		windowContent.add(button9);
		
		constr.gridx = 4;
		constr.gridy = 2;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.fill = constr.BOTH;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.anchor = constr.CENTER;
		
		buttonDivide = new JButton("/");
		buttonDivide.addActionListener(calcEngine);
		gb.setConstraints(buttonDivide, constr);
		windowContent.add(buttonDivide);
		
		constr.gridx = 5;
		constr.gridy = 2;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.fill = constr.BOTH;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.anchor = constr.CENTER;
		
		buttonSqrt = new JButton("sqrt");
		buttonSqrt.addActionListener(calcEngine);
		gb.setConstraints(buttonSqrt, constr);
		windowContent.add(buttonSqrt);
		
		//second Row
		constr.gridx = 0;
		constr.gridy = 3;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.fill = constr.BOTH;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.anchor = constr.CENTER;
		constr.insets = new Insets(0,10,10,20); 
		
		mrButton = new JButton("MR");
		mrButton.addActionListener(calcEngine);
		gb.setConstraints(mrButton, constr);
		windowContent.add(mrButton);
		
		constr.gridx = 1;
		constr.gridy = 3;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.fill = constr.BOTH;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.anchor = constr.CENTER;
		constr.insets = new Insets(0,0,10,10); 
		
		button4 = new JButton("4");
		button4.addActionListener(calcEngine);
		gb.setConstraints(button4, constr);
		windowContent.add(button4);
		
		constr.gridx = 2;
		constr.gridy = 3;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.fill = constr.BOTH;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.anchor = constr.CENTER;
		
		button5 = new JButton("5");
		button5.addActionListener(calcEngine);
		gb.setConstraints(button5, constr);
		windowContent.add(button5);
		
		constr.gridx = 3;
		constr.gridy = 3;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.fill = constr.BOTH;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.anchor = constr.CENTER;
		
		button6 = new JButton("6");
		button6.addActionListener(calcEngine);
		gb.setConstraints(button6, constr);
		windowContent.add(button6);
		
		constr.gridx = 4;
		constr.gridy = 3;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.fill = constr.BOTH;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.anchor = constr.CENTER;
		
		buttonMultiply = new JButton("*");
		buttonMultiply.addActionListener(calcEngine);
		gb.setConstraints(buttonMultiply, constr);
		windowContent.add(buttonMultiply);
		
		constr.gridx = 5;
		constr.gridy = 3;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.fill = constr.BOTH;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.anchor = constr.CENTER;
		
		buttonPercent = new JButton("%");
		buttonPercent.addActionListener(calcEngine);
		gb.setConstraints(buttonPercent, constr);
		windowContent.add(buttonPercent);
		
		//third Row
		constr.gridx = 0;
		constr.gridy = 4;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.fill = constr.BOTH;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.anchor = constr.CENTER;
		constr.insets = new Insets(0,10,10,20); 
		
		msButton = new JButton("MS");
		msButton.addActionListener(calcEngine);
		gb.setConstraints(msButton, constr);
		windowContent.add(msButton);
		
		constr.gridx = 1;
		constr.gridy = 4;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.fill = constr.BOTH;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.anchor = constr.CENTER;
		constr.insets = new Insets(0,0,10,10); 
		
		button1 = new JButton("1");
		button1.addActionListener(calcEngine);
		gb.setConstraints(button1, constr);
		windowContent.add(button1);
		
		constr.gridx = 2;
		constr.gridy = 4;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.fill = constr.BOTH;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.anchor = constr.CENTER;
		
		button2 = new JButton("2");
		button2.addActionListener(calcEngine);
		gb.setConstraints(button2, constr);
		windowContent.add(button2);
		
		constr.gridx = 3;
		constr.gridy = 4;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.fill = constr.BOTH;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.anchor = constr.CENTER;
		
		button3 = new JButton("3");
		button3.addActionListener(calcEngine);
		gb.setConstraints(button3, constr);
		windowContent.add(button3);
		
		constr.gridx = 4;
		constr.gridy = 4;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.fill = constr.BOTH;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.anchor = constr.CENTER;
		
		buttonSubtract = new JButton("-");
		buttonSubtract.addActionListener(calcEngine);
		gb.setConstraints(buttonSubtract, constr);
		windowContent.add(buttonSubtract);
		
		constr.gridx = 5;
		constr.gridy = 4;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.fill = constr.BOTH;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.anchor = constr.CENTER;
		
		buttonDX = new JButton("1/x");
		buttonDX.addActionListener(calcEngine);
		gb.setConstraints(buttonDX, constr);
		windowContent.add(buttonDX);
		
		//fourth Row
		constr.gridx = 0;
		constr.gridy = 5;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.fill = constr.BOTH;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.anchor = constr.CENTER;
		constr.insets = new Insets(0,10,10,20); 
		
		mplusButton = new JButton("M+");
		mplusButton.addActionListener(calcEngine);
		gb.setConstraints(mplusButton, constr);
		windowContent.add(mplusButton);
		
		constr.gridx = 1;
		constr.gridy = 5;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.fill = constr.BOTH;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.anchor = constr.CENTER;
		constr.insets = new Insets(0,0,10,10); 
		
		button0 = new JButton("0");
		button0.addActionListener(calcEngine);
		gb.setConstraints(button0, constr);
		windowContent.add(button0);
		
		constr.gridx = 2;
		constr.gridy = 5;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.fill = constr.BOTH;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.anchor = constr.CENTER;
		
		buttonSign = new JButton("+/-");
		buttonSign.addActionListener(calcEngine);
		gb.setConstraints(buttonSign, constr);
		windowContent.add(buttonSign);
		
		constr.gridx = 3;
		constr.gridy = 5;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.fill = constr.BOTH;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.anchor = constr.CENTER;
		
		buttonPoint = new JButton(".");
		buttonPoint.addActionListener(calcEngine);
		gb.setConstraints(buttonPoint, constr);
		windowContent.add(buttonPoint);
		
		constr.gridx = 4;
		constr.gridy = 5;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.fill = constr.BOTH;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.anchor = constr.CENTER;
		
		buttonAdd = new JButton("+");
		buttonAdd.addActionListener(calcEngine);
		gb.setConstraints(buttonAdd, constr);
		windowContent.add(buttonAdd);
		
		constr.gridx = 5;
		constr.gridy = 5;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.fill = constr.BOTH;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.anchor = constr.CENTER;
		
		buttonEqual = new JButton("=");
		buttonEqual.addActionListener(calcEngine);
		gb.setConstraints(buttonEqual, constr);
		windowContent.add(buttonEqual);
		
		JFrame frame = new JFrame("Calculator");
		frame.setContentPane(windowContent);
		frame.pack();
		frame.setVisible(true);
	}
	
	public void setDisplayValue(String val){
		displayField.setText(val);
	}
	
	public String getDisplayValue(){
		return displayField.getText();
	}
	  
	public static void main(String[] args) {
		new CalculatorGBL();
	}

}
