package qsp;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class HandlingPropertyFileEx {

	public static void main(String[] args) throws IOException {
		//To get the java reprentative object/resource of physical file.
		FileInputStream fi=new FileInputStream("./data/CommonData.property");
		//FileInputStream fi=new FileInputStream("D:\\Selenium S.W\\New folder\\CommonData.property");
		//To create an object of properties class.
		Properties p=new Properties();
		//To load the properties file.
		p.load(fi);
		
		//To get the data(value) by using the key.
		String url=p.getProperty("url");
		String un=p.getProperty("username");
		String pw=p.getProperty("password");
		//To print
		System.out.println(url);
		System.out.println(un);
		System.out.println(pw);
	}}
