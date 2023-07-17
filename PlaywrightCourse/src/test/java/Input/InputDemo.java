package Input;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

public class InputDemo 
{

	public static void main(String[] args) throws InterruptedException
	{
		
		Playwright play=Playwright.create();
	    Browser browser = play.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
        Page page= browser.newPage();
        
        page.navigate("https://www.google.com/");
      //  page.getByRole(AriaRole.COMBOBOX).fill("testing");
        
     //   page.getByRole(AriaRole.COMBOBOX).type("testing");
        
        //page.getByPlaceholder("Search Google or type a URL").type("hmt");
        
         // page.locator("#APjFqb").fill("venkatesh");
        
        
       
        Thread.sleep(3000);
        page.close();
        browser.close();
        play.close();
		

	}

}
