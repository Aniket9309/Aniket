package com.array.practice;

import java.io.FileInputStream;
import java.util.Properties;

public class Test {
	public static void main(String[]args) {
		
		try {
			//read the file
			FileInputStream fis=new FileInputStream("C:\\Users\\ANIKET\\OneDrive\\Desktop\\Example.properties");
			//locate the file
			
			Properties p=new Properties();
			p.load(fis);
			//load properties by using load of p class
			
			String username=p.getProperty("username");
			String password=p.getProperty("password");
			
			System.out.println("username is = "+ username);
			System.out.println("password is = "+ password);
			
			
			
		}catch(Exception e) {
			e.getStackTrace();
			
		}
		
		
	}

}
