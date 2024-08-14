package com.FileHandling;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File objFile=new File ("Name.txt");
		
		try {
			java.io.FileWriter objFileWriter=new FileWriter(objFile);
			objFileWriter.write("Java is fun language");
			objFileWriter.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
