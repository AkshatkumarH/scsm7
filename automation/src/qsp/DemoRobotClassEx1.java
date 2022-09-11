//WAPT type Qsp in the Notepad.
package qsp;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
public class DemoRobotClassEx1 {
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		Runtime.getRuntime().exec("Notepad");
		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_Q);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_P);
		
	}}



//NOTE: Runtime is a java class & it is a Single ton class which means,
//it will allow to create only one Object at instance of Time.