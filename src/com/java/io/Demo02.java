package com.java.io;

import java.io.File;

public class Demo02 {
	public static void main(String[] args) {
		String parentPath="E:\\ZzUserTools\\pic";
		String name="CAT03.jpeg";
		
		//相对路径
		/**
		 * 
		 */
		File src=new File(parentPath,name);
		System.out.println(src.getAbsolutePath());
		System.out.println(src.getPath());
		System.out.println(src.getName());
		src=new File(new File(parentPath), name);
		System.out.println(src.getAbsolutePath());
		System.out.println(src.getPath());
		System.out.println(src.getName());
		
		//2.绝对路径
		File file=new File("E:\\ZzUserTools\\pic\\CAT03.jpeg");
		System.out.println(src.getAbsolutePath());
		System.out.println(src.getPath());
		System.out.println(src.getName());
		
		//如果没有盘符
		File src1=new File("t.txt");
		System.out.println(src1.getAbsolutePath());
		System.out.println(src1.getPath());
		System.out.println(src1.getName());
	}
}
