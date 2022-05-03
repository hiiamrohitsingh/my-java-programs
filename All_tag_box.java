package Java_File_Handing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

// file handing 

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class All_tag_box {

	public static void main(String[] args) {

		// first i am creating a array of the post

		String hashtags_post[] = { "dakho", "finnishgoth" };

		// a loop to open page

		for (int i = 0; i < hashtags_post.length; i++) {
			WebDriver driver = new ChromeDriver();
			driver.get("https://best-hashtags.com/hashtag/" + hashtags_post[i] + "/"); // Opening the page one by one
			WebElement element = driver.findElement(By.cssSelector(".tag-box")); // getting the first box tags

			File file = new File("D:\\my_hashtags_data\\"+ hashtags_post[i] +".html"); // initialize File object and passing path as argument
			boolean result;
			try {
				result = file.createNewFile(); // creates a new file
				if (result) // test if successfully created a new file
				{
					FileWriter myWriter = new FileWriter(file);
					
					List<WebElement> p = driver.findElements(By.xpath("//*[@class=\"tag-box tag-box-v3 margin-bottom-40\"]"));
					
					for (WebElement ele : p) {
						myWriter.write("box start------------------------------------------------------------\n"+ele.getText()+""
								+ "\nbox end----------------------------------------------------------------\n\n");
					}
					
					// there is no template system
					
					myWriter.close();

					System.out.println("file created " + file.getCanonicalPath()); // returns the path string
					
					System.out.println(p.size());
					
				} else {
					System.out.println("File already exist at location: " + file.getCanonicalPath());
				}
			} catch (IOException e) {
				e.printStackTrace(); // prints exception if any
			}

			driver.close();

		}

	}

}


