package Advanced;

import java.util.List;

import com.microsoft.playwright.Browser;

import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class WindowsHandlingDemo 
{

	public static void main(String[] args) 
	{
		
		
		Playwright play=Playwright.create();
	    Browser browser = play.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
        Page page= browser.newPage();
        page.navigate("https://the-internet.herokuapp.com/windows");
        
        Page popup=  page.waitForPopup(new Page.WaitForPopupOptions().setPredicate(t->t.context().pages().size()==2),()->
        {
        	page.locator("//a[text()='Click Here']").click();
        	
        	
        });
        
        
        
        List<Page> tabs=   page.context().pages();
        
        for (Page tab : tabs) 
        {
        	tab.waitForLoadState();
        	
        	
			
		}
        // Switching into desired window 
        
     Page herokappwindow=   tabs.get(0);
     Page herokappnewwindow=   tabs.get(1);
     
     System.out.println(" First tab Url is "+herokappwindow.url());
     System.out.println(" Second tab tab Url is "+herokappnewwindow.url());
     
        
        
        
        
       
        
        
        
       
        
        
       
        
		

	}

}
