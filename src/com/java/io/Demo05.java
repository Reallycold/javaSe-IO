package com.java.io;

import java.io.File;
import java.util.Arrays;

/**
 * 递归输出子孙目录 文件的名称
 * 1.listFiles();
 * 2。递归
 *
 */
public class Demo05 {
	public static void main(String[] args) {
		String path="E:\\ZzUserTools\\pic";
		File src=new File(path);
		File[] roots=File.listRoots();
		System.out.println(Arrays.toString(roots));
		printName(src);
	}

	private static void printName(File src) {
		if(!src.exists()) {
			return;
		}else {
			File[] subNames=src.listFiles();
			System.out.println(src.getAbsolutePath());
			if(src.isDirectory()) {
				for (File file : subNames) {
					printName(file);
				}
			}
		}
		
		
	}
}
