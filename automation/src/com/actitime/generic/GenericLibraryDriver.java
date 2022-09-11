package com.actitime.generic;

import java.io.IOException;

public class GenericLibraryDriver {

	public static void main(String[] args) throws IOException {
		GenericLibraryEx gl=new GenericLibraryEx();
		//To read a data from property file;
		String url = gl.getPropertyData("url");
		System.out.println(url);
		//To write the data from excel file.
		gl.SetExcelData("Sheet1", 2, 4, "fail");
		//To read a data from excel file;
		System.out.println(gl.getExcelData("Sheet1", 2, 4));
	}}
