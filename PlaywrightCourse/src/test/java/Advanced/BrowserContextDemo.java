package Advanced;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserContext.WaitForPageOptions;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.LoadState;

public class BrowserContextDemo 
{

	public static void main(String[] args) 
	{
		Playwright play=Playwright.create();
	    Browser browser = play.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
        Page page= browser.newPage();
        
        page.navigate("https://demoqa.com/browser-windows");
        Page popup=  page.waitForPopup(new Page.WaitForPopupOptions().setPredicate(t->t.context().pages().size()==2),()->
        {
        	page.locator("#tabButton").click();
        	
        	
        	
        });
        
        
        
//        System.out.println(popup.url());
//        List<Page> tabs=   page.context().pages();
//        
//        Page Samplepage = tabs.get(1);
//        
//        Samplepage.waitForSelector("#sampleHeading");
        
        String text=  popup.locator("#sampleHeading").innerText();
      
        System.out.println(text);
        
       popup.close();
        
        
        Page p=  page.waitForPopup(new Page.WaitForPopupOptions().setPredicate(t->t.context().pages().size()==3),()->
        {
        	
        	page.locator("#windowButton").click();
        	page.waitForLoadState(LoadState.DOMCONTENTLOADED);
        	page.locator("#messageWindowButton").click();
        	
        
        	
        });
        
          
         p.waitForLoadState(LoadState.DOMCONTENTLOADED);
       
         System.out.println(p.locator("body").innerText());
       
       
        
        
        
        
	}

}
