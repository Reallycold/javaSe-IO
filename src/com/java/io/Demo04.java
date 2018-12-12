package com.java.io;

import java.io.File;
import java.io.FilenameFilter;

public class Demo04 {
	public static void main(String[] args) {
		String path="E:\\ZzUserTools\\pic";
		File src=new File(path);
//		if(!src.exists()) {
//			boolean f=src.mkdir();//必须父目录存在 才可以创建
//			System.out.println(f?"success":"false");
//		}
		if(src.isDirectory()) {
			File[] p=src.listFiles();//
			for (File s : p) {
				System.out.println(s.getAbsolutePath());
			}
		}
		
		File []subNames=src.listFiles(new FilenameFilter() {
			
			
			public boolean accept(File dir, String name) {
				
				return new File(dir,name).isFile();
			}
		});
		
		for (File file : subNames) {
			System.out.println(file.getAbsolutePath());
		}
	}
}
