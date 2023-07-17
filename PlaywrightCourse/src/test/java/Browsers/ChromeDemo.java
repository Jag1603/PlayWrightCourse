package Browsers;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ChromeDemo 
{

	public static void main(String[] args) 
	{
		
		Playwright play=Playwright.create();
	    Browser browser = play.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
        Page page= browser.newPage();
        
        page.navigate("https://www.google.com/");
        
        page.close();
        browser.close();
        play.close();
		

	}

}
