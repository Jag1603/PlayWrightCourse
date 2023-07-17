package Input;



import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;


public class FormDemo 
{

	public static void main(String[] args) throws InterruptedException 
	{

		Playwright play=Playwright.create();
	    Browser browser = play.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
        Page page= browser.newPage();
        
        page.navigate("https://demoqa.com/text-box");
        Thread.sleep(5000);
        page.getByPlaceholder("Full Name").type("jagadeesh");
        page.getByPlaceholder("name@example.com").type("jagadeesh@jmail.com");
        page.getByPlaceholder("Current Address").type("18-0-112-/8, Hyderabad");
        page.locator("//*[@id='permanentAddress']").type("Hyderabad");
        page.getByText("Submit").click();
        
        
	}

	
}
