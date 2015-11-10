package com.reader.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JTextArea;

import com.reader.file.Reader;

public class MyActionListner implements ActionListener
{
	MyGUIProgram caller;
	private final static String newline = "\n";

	public MyActionListner(MyGUIProgram myGUIProgram)
	{
		this.caller = myGUIProgram;
	}

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		System.out.println(caller.getFileLocationField().getText());
		System.out.println(caller.getOperationField().getText());
		System.out.println(caller.getPhoneNumberField().getText());
		
		String fileLocation = caller.getFileLocationField().getText();
		String phoneNumber = caller.getPhoneNumberField().getText();
		String opCode = caller.getOperationField().getText();
		
//		caller.getFileLocationField().setText("");
		caller.getPhoneNumberField().setText("");
		caller.getOperationField().setText("");
		
		Reader reader = new Reader();
		List<String> fileLines = reader.ReadFile(fileLocation, phoneNumber, opCode);
		JTextArea output = caller.getOutput();
		output.setText("");
		for (String string : fileLines)
		{
			output.append(string + newline);	
		}
			
	}

}
