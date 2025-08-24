package com.dkte2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Prog01 {

	public static void main1(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text to be written in file.");
		// write into text file
		String path = "C:\\Users\\Admin\\Desktop\\Pranav N\\Day16\\New folder\\sample.txt";
		try(FileOutputStream fout = new FileOutputStream(path)) {
			try(PrintStream pout = new PrintStream(fout)) {
				
				while(true) {
					String line = sc.nextLine();
					if(line.isEmpty())
						break;
					pout.println(line);
				}
				System.out.println("File Saved.");
			} // pout.close();
		} // fout.close();
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main (String[] args) {
		String path = "C:\\Users\\Admin\\Desktop\\Pranav N\\Day16\\New folder\\sample.txt";
		String line = "";
		try(FileInputStream fin = new FileInputStream(path)) {
			try(Scanner sc = new Scanner(fin)) {
				while(sc.hasNextLine()) {
					line = sc.nextLine();
					System.out.println(line);
				}
			} // sc.close();
		} // fin.close();
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
