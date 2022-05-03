package learning_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Open_chrome {
	public static void main(String[] arg) {

		String[] post = { "dakho", "finnishgoth" };
		// String[] post = {"dakho"};

		for (int i = 0; i < post.length; i++) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://best-hashtags.com/hashtag/" + post[i] + "/");

			List<WebElement> p = driver.findElements(By.xpath("//*[@class=\"tag-box tag-box-v3 margin-bottom-40\"]"));
			
			for (WebElement ele : p) {
				System.out.println("[" + ele + "]" + "----------------------------------------------");
				System.out.println(ele.getText());
			}

			driver.close();

			System.out.println("[" + i + "]" + "***************************************************************");

		}

	}
}
