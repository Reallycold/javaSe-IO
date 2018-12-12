package com.java.io;

import java.io.File;
import java.io.IOException;

public class Dem03 {
	
	private static void test1() {
		File src=new File("E:\\ZzUserTools\\pic\\CAT03.jpeg");
		System.out.println(src.getPath());
		System.out.println(src.getAbsolutePath());
		System.out.println(src.getName());
		System.out.println(src.getParent());
		System.out.println(src.getParentFile());
		
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		//test1();
		//test2();
		test3();
	}

	private static void test3() throws IOException, InterruptedException {
		File src=new File("E:\\ZzUserTools\\pic\\1.txt");
		if(!src.exists()) {
			boolean flag=src.createNewFile();
			System.out.println(flag?"success":"false");
			
		}
		boolean f=src.delete();
		System.out.println(f?"success":"false");
		
		File temp=File.createTempFile("tes", ".temp",new File("E:\\ZzUserTools\\pic"));
		Thread.sleep(5000);
		temp.deleteOnExit();
	}

	private static void test2() {
		File src=new File("E:\\ZzUserTools\\pic");
		System.out.println(src.exists());
		System.out.println(src.canRead()+" "+ src.canWrite());
		System.out.println(src.length());
		if(src.isFile()) {
			System.out.println("文件");
		}else if(src.isDirectory()){
			System.out.println("文件夹");
		}else {
			System.out.println("文件不存在");
			
		}
	}

	
}
