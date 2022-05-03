import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
// file handing
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class All_Tags_Creating_My_Post {

	public static void main(String[] args) {

		// first i am creating a array of the post

		String hashtags_post[] = {"Legaphy", "Pestakonvouitm", "yggdrasilpendant", "wanderingsoulsontwowheelz", "marieregalpudding", "Croesloveforever", "yalovaozelhastane"};

		for (int i = 0; i < hashtags_post.length; i++) {

			WebDriver driver = new ChromeDriver();

			driver.get("https://best-hashtags.com/hashtag/" + hashtags_post[i] + "/"); // Opening the page one by one

			List<WebElement> p = driver.findElements(By.xpath("//*[@class=\"tag-box tag-box-v3 margin-bottom-40\"]"));

			File file = new File("D:\\my_hashtags_data\\toPost\\" + hashtags_post[i] + ".html"); // initialize File object
			boolean result;

			try {
				result = file.createNewFile(); // creates a new file
				if (result) // test if successfully created a new file
				{

					FileWriter myWriter = new FileWriter(file);

					if (p.size() == 4) {
						myWriter.write("<div class='content'>\r\n"
								+ "\r\n"
								+ "   <h1>BEST #"+ hashtags_post[i] +" HASHTAGS</h1>\r\n"
								+ "\r\n"
								+ "   <p class='h5'>\r\n"
								+ "      With us Speed up your Instagram account just got easier. To be popular and trending in Instagram\r\n"
								+ "   </p>\r\n"
								+ "\r\n"
								+ "   <hr>\r\n"
								+ "\r\n"
								+ "   <div class='tags-des'>\r\n"
								+ "      <h1>High Hashtags for #"+ hashtags_post[i] +"</h1>\r\n"
								+ "   </div>\r\n"
								+ "\r\n"
								+ "   <div class='tags'>\r\n"
								+ "      <textarea\r\n"
								+ "         readonly='readonly'>"+p.get(0).getText()+"</textarea>\r\n"
								+ "      <button class='btn btn-outline-danger'>copy</button>\r\n"
								+ "   </div>\r\n"
								+ "\r\n"
								+ "   <div class='tags-des'>\r\n"
								+ "      <h1>Medium Hashtags for #"+ hashtags_post[i] +"</h1>\r\n"
								+ "   </div>\r\n"
								+ "\r\n"
								+ "   <div class='tags'>\r\n"
								+ "      <textarea\r\n"
								+ "         readonly='readonly'>"+p.get(1).getText()+"</textarea>\r\n"
								+ "      <button class='btn btn-outline-danger'>copy</button>\r\n"
								+ "   </div>\r\n"
								+ "\r\n"
								+ "   <div class='tags-des'>\r\n"
								+ "      <h1>Low Hashtags for #"+ hashtags_post[i] +"</h1>\r\n"
								+ "   </div>\r\n"
								+ "\r\n"
								+ "   <div class='tags'>\r\n"
								+ "      <textarea\r\n"
								+ "         readonly='readonly'>"+p.get(2).getText()+"</textarea>\r\n"
								+ "      <button class='btn btn-outline-danger'>copy</button>\r\n"
								+ "   </div>\r\n"
								+ "\r\n"
								+ "   <div class='tags-des'>\r\n"
								+ "      <h1>Related Hashtags for #"+ hashtags_post[i] +"</h1>\r\n"
								+ "   </div>\r\n"
								+ "\r\n"
								+ "   <div class='tags'>\r\n"
								+ "      <textarea\r\n"
								+ "         readonly='readonly'>"+p.get(3).getText()+"</textarea>\r\n"
								+ "      <button class='btn btn-outline-danger'>copy</button>\r\n"
								+ "   </div>\r\n"
								+ "\r\n"
								+ "</div>");
					}
					else if (p.size() == 5) {
						myWriter.write("<div class='content'>\r\n"
								+ "\r\n"
								+ "   <h1>BEST #"+ hashtags_post[i] +" HASHTAGS</h1>\r\n"
								+ "\r\n"
								+ "   <p class='h5'>\r\n"
								+ "      With us Speed up your Instagram account just got easier. To be popular and trending in Instagram\r\n"
								+ "   </p>\r\n"
								+ "\r\n"
								+ "   <hr>\r\n"
								+ "\r\n"
								+ "   <div class='tags-des'>\r\n"
								+ "      <h1>High Hashtags for #"+ hashtags_post[i] +"</h1>\r\n"
								+ "   </div>\r\n"
								+ "\r\n"
								+ "   <div class='tags'>\r\n"
								+ "      <textarea\r\n"
								+ "         readonly='readonly'>"+p.get(0).getText()+"</textarea>\r\n"
								+ "      <button class='btn btn-outline-danger'>copy</button>\r\n"
								+ "   </div>\r\n"
								+ "\r\n"
								+ "   <div class='tags-des'>\r\n"
								+ "      <h1>Second High Hashtags for #"+ hashtags_post[i] +"</h1>\r\n"
								+ "   </div>\r\n"
								+ "\r\n"
								+ "   <div class='tags'>\r\n"
								+ "      <textarea\r\n"
								+ "         readonly='readonly'>"+p.get(1).getText()+"</textarea>\r\n"
								+ "      <button class='btn btn-outline-danger'>copy</button>\r\n"
								+ "   </div>\r\n"
								+ "\r\n"
								+ "   <div class='tags-des'>\r\n"
								+ "      <h1>Medium Hashtags for #"+ hashtags_post[i] +"</h1>\r\n"
								+ "   </div>\r\n"
								+ "\r\n"
								+ "   <div class='tags'>\r\n"
								+ "      <textarea\r\n"
								+ "         readonly='readonly'>"+p.get(2).getText()+"</textarea>\r\n"
								+ "      <button class='btn btn-outline-danger'>copy</button>\r\n"
								+ "   </div>\r\n"
								+ "\r\n"
								+ "   <div class='tags-des'>\r\n"
								+ "      <h1>Low Hashtags for #"+ hashtags_post[i] +"</h1>\r\n"
								+ "   </div>\r\n"
								+ "\r\n"
								+ "   <div class='tags'>\r\n"
								+ "      <textarea\r\n"
								+ "         readonly='readonly'>"+p.get(3).getText()+"</textarea>\r\n"
								+ "      <button class='btn btn-outline-danger'>copy</button>\r\n"
								+ "   </div>\r\n"
								+ "\r\n"
								+ "   <div class='tags-des'>\r\n"
								+ "      <h1>Related Hashtags for #"+ hashtags_post[i] +"</h1>\r\n"
								+ "   </div>\r\n"
								+ "\r\n"
								+ "   <div class='tags'>\r\n"
								+ "      <textarea\r\n"
								+ "         readonly='readonly'>"+p.get(4).getText()+"</textarea>\r\n"
								+ "      <button class='btn btn-outline-danger'>copy</button>\r\n"
								+ "   </div>\r\n"
								+ "\r\n"
								+ "</div>");
					}

					myWriter.close();

					System.out.println("file created " + file.getCanonicalPath()); // returns the path string // confirm
																					// that file is created

				} else {
					System.out.println("File already exist at location: " + file.getCanonicalPath()); // if file is already exit
				}
			} catch (IOException e) {
				e.printStackTrace(); // prints exception if any
			}

			driver.close();

		}

	}

}
