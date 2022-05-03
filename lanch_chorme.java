package learning_selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class lanch_chorme {

	public static void main(String[] args) {
	
	WebDriver edgedriver = new EdgeDriver();
	edgedriver.get("https://google.com");
	String edgetitle = edgedriver.getTitle();
	edgedriver.close();	
	System.out.print(edgetitle);

	}

}
