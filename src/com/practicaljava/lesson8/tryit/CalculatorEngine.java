package com.practicaljava.lesson8.tryit;

import java.awt.event.*;
import javax.swing.*;

public class CalculatorEngine implements ActionListener {
	
	CalculatorGBL parent;
	private Double dOperand1, dOperand2;
	private String text="";
	char sign='+'; //Operand sign
	Boolean itext1Entered=false;
    Boolean isPoint=false; //is "." exist in operand
    Boolean isDivide, isMultiply, isAdd, isSubstruct, isPercent;
     

	CalculatorEngine(CalculatorGBL parent){
		this.parent = parent;
	}
	
	void show(String str){
		// Output operand
		if (sign == '+') {
			parent.setDisplayValue(str);
		}
		else {
			parent.setDisplayValue(sign + str);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		JButton clickedButton = (JButton) e.getSource();
		String label = clickedButton.getText();
		switch (label) {
			case "0":
			case "1":
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
				text += label;
				show(text);
				break;
			
			case ".":
				if (!isPoint) {
					text += label;
					isPoint=true;
				}
				show(text);
				break;
			
			case "+/-":
				sign = (sign == '+')? '-' : '+';
				show(text);
				break;
				
			case "Backspace":
			case "C":
				if ( !text.isEmpty() ) {
					 text = text.substring(0, text.length()-1);
				} else if (sign == '-') {sign='+';}
				show(text);
				break;
			
			case "CE":
				text="";
				sign='+';
				show(text);
				break;
				
			case "/":
				if (!itext1Entered) {
//					dOperand1 = Double.parseDouble(sign+text);
//					itext1Entered=true;
//					text="";
//					sign='+';
//					isPoint=false;
//					isDivide = true;
//					show(text);
				} else { // "/" <=> "="
//					dOperand1 = dOperand1 / Double.parseDouble(sign+text);
//					text = dOperand1.toString();
//					dOperand2 = null;
//					itext1Entered=true;
//					show(text);
				}
				break;
			case "=":
				if (itext1Entered) {
//					dOperand2 = Double.parseDouble(sign+text);
//					if (isDivide) { 
//						dOperand1 = dOperand1 / Double.parseDouble(sign+text);
//						text = dOperand1.toString();
//						dOperand2 = null;
//						itext1Entered=true;
//						isDivide=false;
//						show(text);
//						}
				} else {
					isDivide = false;
					isMultiply = false;
					isAdd = false;
					isSubstruct = false;
					isPercent = false;
					
					show(text);
					text = "";
					isPoint = false;
					
				}
				break;
				
		}
		}
		
	}
