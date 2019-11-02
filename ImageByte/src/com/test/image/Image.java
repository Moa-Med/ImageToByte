package com.test.image;

import java.nio.file.Files;
import java.util.Map;
import java.util.TreeMap;
import java.io.File;
import java.io.IOException;


public class Image {
	
	public static byte thousand(String image) throws IOException {
		//converting the file to byte
		File fi = new File(image);
		byte[] fileContent = Files.readAllBytes(fi.toPath());
		
		//calculating the sum
		byte sum=0;
	    for(int i=0;i<1000;i++) {
		                       sum+=fileContent[i];	 
                             	}	
	    return sum;
	}
	
	public static void main(String[] args) throws IOException {
		
		//the sum in ascending order + the file name 
		Map<Byte,String> map=new TreeMap<>();
		map.put(thousand("look1.jpg"),"Look1");
		map.put(thousand("look2.jpg"),"Look2");
		map.put(thousand("look3.jpg"),"Look3");
		
		map.forEach((sum,name) -> System.out.println("The sum is : " + sum + ", The file name is : " + name));
		
	}
	
}
