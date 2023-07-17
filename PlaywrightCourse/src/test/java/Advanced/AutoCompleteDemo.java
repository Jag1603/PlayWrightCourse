package Advanced;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class AutoCompleteDemo 
{

	public static void main(String[] args) 
	{
		
		Playwright play=Playwright.create();
	    Browser browser = play.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
        Page page= browser.newPage();
        
        page.navigate("https://demoqa.com/auto-complete");
        
        page.waitForTimeout(5000);
        
        page.locator("#autoCompleteMultipleInput").type("e");
        
      List<Locator>  text= page.locator("#autoCompleteMultipleContainer").all();
      
     
        for (Locator locator : text) 
        {
        	locator.click();
        	
			
		}
        
        
       



	}

}
