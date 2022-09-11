package qsp;
import java.io.IOException;
public class DemoLibraryEx1 {

	public static void main(String[] args) throws IOException {
FileLibEx1 f=new FileLibEx1();
	String url = f.getpropertyData("url");
	String un = f.getpropertyData("username");
	String pw = f.getpropertyData("password");
	System.out.println(url);
	System.out.println(un);
	System.out.println(pw);
	String cn = f.getExcelData("Sheet1", 1, 2);
	System.out.println(cn);
	}}


