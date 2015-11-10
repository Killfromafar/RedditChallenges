package com.reader.gui;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.reader.file.Reader;

public class MyGUIProgram extends JFrame
{
	private static final long serialVersionUID = 6517124522932117098L;

	JPanel p = new JPanel();
	JButton b = new JButton("button");
	JTextArea output = new JTextArea(5, 20);
	JScrollPane scrollPane = new JScrollPane(output);

	JLabel fileLocationLabel = new JLabel("Enter a file location");
	JTextField fileLocationField = new JTextField();

	JLabel phoneNumberLabel = new JLabel("Enter a phoneNumber to filter on");
	JTextField phoneNumberField = new JTextField();

	JLabel operationLabel = new JLabel("Enter an operation to filter on");
	JTextField operationField = new JTextField();

	Reader reader = new Reader();

	public MyGUIProgram()
	{
		super("Swing app");
		setSize(400, 300);
		setResizable(true);

		fileLocationField.setPreferredSize(new Dimension(150, 20));
		p.add(fileLocationField);
		p.add(fileLocationLabel);

		phoneNumberField.setPreferredSize(new Dimension(150, 20));
		p.add(phoneNumberField);
		p.add(phoneNumberLabel);

		operationField.setPreferredSize(new Dimension(150, 20));
		p.add(operationField);
		p.add(operationLabel);

		b.addActionListener(new MyActionListner(this));
		p.add(b);

		output.setEditable(false);
		p.add(output);

		add(p);

		setVisible(true);
	}
	public JTextField getFileLocationField()
	{
		return fileLocationField;
	}
	public JTextField getPhoneNumberField()
	{
		return phoneNumberField;
	}
	public JTextField getOperationField()
	{
		return operationField;
	}
	public JTextArea getOutput()
	{
		return output;
	}
	public void setOutput(JTextArea output)
	{
		this.output = output;
	}
	public static void main(String[] args)
	{
		new MyGUIProgram();
	}
}
