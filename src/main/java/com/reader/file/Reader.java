package com.reader.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader
{
	public Reader()
	{}

	public List<String> ReadFile(String fileName, String phoneNumber, String opCode){
		// The name of the file to open.
//		String fileName = "temp.txt";
//		String phoneNumber = "+447866272496";
//		String opCode = "A001B";

		// This will reference one line at a time
		String line = null;

		List<String> fileLines = new ArrayList<String>();

		try
		{
			// Create a file object from file name
			File aFile = new File(fileName);
			
			// FileReader reads text files in the default encoding.
			FileReader fileReader = new FileReader(aFile);

			// Always wrap FileReader in BufferedReader.
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null)
			{
				fileLines.add(line);
			}

			// Always close files.
			bufferedReader.close();
		}
		catch (FileNotFoundException ex)
		{
			System.out.println("Unable to open file '" + fileName + "'");
		}
		catch (IOException ex)
		{
			System.out.println("Error reading file '" + fileName + "'");
		}

		fileLines = FilterListForCriteria(phoneNumber, fileLines);
		fileLines = FilterListForCriteria(opCode, fileLines);
		return fileLines;
	}

	private static void printList(List<String> fileLines)
	{
		for (String string : fileLines)
		{
			System.out.println(string);
		}
		
	}

	private static List<String> FilterListForCriteria(String criteria, List<String> fileLines)
	{
		List<String> returnList = new ArrayList<>();
		
		for (String eachLine : fileLines)
		{
			if (eachLine.contains(criteria))
			{
				returnList.add(eachLine);
			}
		}
		
		return returnList;
	}

}