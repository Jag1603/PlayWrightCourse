package Browsers;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class FirefoxDemo 
{

	public static void main(String[] args) 
	{
		Playwright play=Playwright.create();
	    Browser browser = play.firefox().launch(new BrowserType.LaunchOptions().setChannel("firefox").setHeadless(false));
        Page page= browser.newPage();
        
        page.navigate("https://www.google.com/");
        
        page.close();
        browser.close();
        play.close();

	}

}
