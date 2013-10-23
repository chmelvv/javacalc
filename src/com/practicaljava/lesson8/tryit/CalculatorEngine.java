package com.practicaljava.lesson8.tryit;

import java.awt.event.*;
import javax.swing.*;

public class CalculatorEngine implements ActionListener {
	
	CalculatorGBL parent;
	private Double dOperand1, dOperand2;
	private String text="";
	private char sign='+'; //Operand sign
	private Boolean isText1Entered=false;
	private Boolean isPoint=false; //is "." exist in operand
	private Boolean isDivide=false, isMultiply=false, isAdd=false, isSubstract=false, isPercent=false;
    private Double memory=0.0;

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
	
	void divide(){
		dOperand2 = Double.parseDouble(sign+text);
		dOperand1 = dOperand1 / dOperand2;
		text = Double.toString(dOperand1);
		show(text);
	
		dOperand2 = null;
		isText1Entered = false;
		isDivide=false;
		isPoint=false;
		sign='+';
		text="";
	}
	
	void multiply(){
		dOperand2 = Double.parseDouble(sign+text);
		dOperand1 = dOperand1 * dOperand2;
		text = Double.toString(dOperand1);
		show(text);
	
		dOperand2 = null;
		isText1Entered = false;
		isMultiply=false;
		isPoint=false;
		sign='+';
		text="";
	}
	
	void add(){
		dOperand2 = Double.parseDouble(sign+text);
		dOperand1 = dOperand1 + dOperand2;
		text = Double.toString(dOperand1);
		show(text);
	
		dOperand2 = null;
		isAdd=false;
		isText1Entered = false;
		isPoint=false;
		sign='+';
		text="";
	}

	void substract(){
		dOperand2 = Double.parseDouble(sign+text);
		dOperand1 = dOperand1 - dOperand2;
		if (dOperand1 < 0) {
			dOperand1 = dOperand1*(-1);
			sign='-';
		}
		text = Double.toString(dOperand1);
		show(text);
	
		dOperand2 = null;
		isSubstract=false;
		isText1Entered = false;
		isPoint=false;
		sign='+';
		text="";
	}
	
	void percent(){
		dOperand2 = Double.parseDouble(sign+text);
		dOperand1 = dOperand1*dOperand2/100;
		text = Double.toString(dOperand1);
		show(text);
	
		dOperand2 = null;
		isPercent=false;
		isText1Entered = false;
		isPoint=false;
		sign='+';
		text="";
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
				sign = (sign == '+') ? '-' : '+';
				show(text);
				break;
				
			case "Backspace": // delete last symbol
				if ( !text.isEmpty() ) {
					 text = text.substring(0, text.length()-1); // delete last symbol
				} else if (sign == '-') {sign='+';} //in empty text - set sign to default
				show(text);
				break;
				
			case "C": // delete last operand, remain operation
				// (+-N.N op +-M.M) OR (+-N.N op) OR (+-N.N) 
				text="";
				isPoint=false;
				sign='+';			
				show(text);
				break;
			
			case "CE": //Total calc clearing
				dOperand2 = dOperand1 = null;
				isText1Entered = false;
						
				isDivide = false;
				isMultiply = false;
				isAdd = false;
				isSubstract = false;
				isPercent = false;

				text="";
				isPoint=false;
				sign='+';			
				show(text);
				
				break;
				
			case "/":
				if (!isText1Entered) {
					dOperand1 = Double.parseDouble(sign+text);
					isText1Entered=true;

					isDivide = true;
					isPoint=false;
					sign='+';
					text="";
				} else { // "/" <=> "="
					show("Error");  	}
				break;

			case "*":
				if (!isText1Entered) {
					dOperand1 = Double.parseDouble(sign+text);
					isText1Entered=true;

					isMultiply = true;
					isPoint=false;
					sign='+';
					text="";
				} else { // "/" <=> "="
					show("Error");		}
				break;

			case "-":
				if (!isText1Entered) {
					dOperand1 = Double.parseDouble(sign+text);
					isText1Entered=true;

					isSubstract = true;
					isPoint=false;
					sign='+';
					text="";
				} else { // "/" <=> "="
					show("Error");		}
				break;
				
			case "+":
				if (!isText1Entered) {
					dOperand1 = Double.parseDouble(sign+text);
					isText1Entered=true;

					isAdd = true;
					isPoint=false;
					sign='+';
					text="";
				} else { // "/" <=> "="
					show("Error");			}
				break;

			case "%":
				if (!isText1Entered) {
					dOperand1 = Double.parseDouble(sign+text);
					isText1Entered=true;

					isPercent = true;
					isPoint=false;
					sign='+';
					text="";
				} else { // "/" <=> "="
					show("Error");			}
				break;

			case "=":
				if (isText1Entered) {// Case "N op M ="
					dOperand2 = Double.parseDouble(sign+text);
					if (isDivide) divide(); 
					if (isMultiply) multiply();
					if (isSubstract) substract();
					if (isAdd) add();
					if (isPercent) percent();
					isText1Entered = false;
					
				} else { // Case "N ="
					show("Error");
				}
				break;
				
			case "sqrt":
					dOperand1 = Math.sqrt(Double.parseDouble(sign+text));
					text = Double.toString(dOperand1);
					show(text);

					isPoint=false;
					sign='+';
					text="";
					break;
			
			case "1/x":
				dOperand1 = 1/Double.parseDouble(sign+text);
				text = Double.toString(dOperand1);
				show(text);

				isPoint=false;
				sign='+';
				text="";
				break;
				
			case "MC":
				memory = 0.0;
				parent.setMemoryValue(memory);
				break;
			case "MR":
				text = memory.toString();
				show(text);
				break;
			case "MS":
				memory = Double.parseDouble(text);
				parent.setMemoryValue(memory);
				break;
			case "M+":
				memory += Double.parseDouble(text);
				parent.setMemoryValue(memory);
				break;
		}
		}
}
