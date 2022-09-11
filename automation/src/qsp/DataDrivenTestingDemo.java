package qsp;
import java.util.ArrayList;
import java.util.HashMap;
public class DataDrivenTestingDemo {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("https://demo.actitime.com/");
		al.add("admin");
		//al.add("admin@actitime.com");
		al.add("manager");
		System.out.println(al.get(2));// we will get email instead of password when we add email.

		//In above,There is an disadvantage of going with arraylist because when user add new data 
		//Then instead old that we want we will get new data as accordingly based on index value.


		//To overcome that disadvantage we will go for HasMap. 
		HashMap<String,String> hs=new HashMap<String, String>();
		hs.put("url" ,"https://demo.actitime.com/");
		hs.put("username","admin");
		hs.put("email", "admin@actitime.com");
		hs.put("password","manager");
		System.out.println(hs.get("password"));	//here we will get password o/p irrespective how may elements we add like we add email here b/w.
	}}
