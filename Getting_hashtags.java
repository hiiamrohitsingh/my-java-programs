package Java_File_Handing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// file handing 

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Getting_hashtags {

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
					
					//myWriter.write(element.getText());
					
					myWriter.write("<div class='content'>\r\n"
							+ "\r\n"
							+ "      <h1>BEST #"+hashtags_post[i]+" HASHTAGS</h1>\r\n"
							+ "   \r\n"
							+ "      <p class='h5'>\r\n"
							+ "         Feel exhausted from guessing hashtags each time you post on Facebook, Twitter, Youtube, or Instagram? Embrace\r\n"
							+ "         the power of our AI-based searcher — generate hashtags for social media automatically. This hashtag generator\r\n"
							+ "         for Instagram provides you with relevant hashtags by analyzing your photo, keyword, or link.\r\n"
							+ "      </p>\r\n"
							+ "   \r\n"
							+ "      <hr>\r\n"
							+ "   \r\n"
							+ "      <div class='tags-des'>\r\n"
							+ "         <h1>High Hashtags for #"+hashtags_post[i]+"</h1>\r\n"
							+ "      </div>\r\n"
							+ "   \r\n"
							+ "      <div class='tags'>\r\n"
							+ "         <textarea\r\n"
							+ "            readonly='readonly'>"+element.getText()+"</textarea>\r\n"
							+ "         <button class='btn btn-outline-danger'>copy</button>\r\n"
							+ "      </div>\r\n"
							+ "   \r\n"
							+ "   </div>");
					
					myWriter.close();

					System.out.println("file created " + file.getCanonicalPath()); // returns the path string
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
