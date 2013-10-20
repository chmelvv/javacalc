package com.practicaljava.lesson8.tryit;

import java.awt.event.*;
import javax.swing.*;

public class CalculatorEngine implements ActionListener {
	
	CalculatorGBL parent;
	private double dFirst, dSecond;
	private String sFirst="";

	CalculatorEngine(CalculatorGBL parent){
		this.parent = parent;
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
			case ".":
				sFirst += label;
				break;
			case "Backspace":
				if ( !sFirst.isEmpty() ) {
					 sFirst = sFirst.substring(0, sFirst.length()-1);
				}
				break;
		}
		parent.setDisplayValue(sFirst);
		
	}

}
