package com.FileHandling;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File objFile=new File ("Name.txt");
		String[] color = {"Red","Yellow","Blue"};
		try {
			FileWriter objFileWriter =new FileWriter (objFile);
			for(String s:color)
			{
				objFileWriter.write(s);
			}
			objFileWriter.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
