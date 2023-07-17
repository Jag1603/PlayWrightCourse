package Browsers;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ChromiumDemo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		Playwright play=Playwright.create();
	    Browser browser = play.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page= browser.newPage();
        
        page.navigate("https://www.google.com/");
        Thread.sleep(5000);
        
        page.close();
        browser.close();
        play.close();
		

	}

}
