package Advanced;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.FileChooser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class UploadDownload_Demo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		
		Playwright play=Playwright.create();
	    Browser browser = play.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
        Page page= browser.newPage();
        
        page.navigate("https://demoqa.com/upload-download");
        
        page.locator("//a[text()='Download']").click();
        
        
        FileChooser fileChooser = page.waitForFileChooser(() -> page.getByText("Select a file").click());
        fileChooser.setFiles(Paths.get("C:\\Users\\jagad\\OneDrive\\Desktop\\jagadeesh.JPG"));
        
      
        

	}

}
