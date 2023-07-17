package Advanced;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.GetByRoleOptions;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.options.LoadState;

public class LinkHandlingDemo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		Playwright play=Playwright.create();
	    Browser browser = play.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
        Page page= browser.newPage();
        
        page.navigate("https://demoqa.com/links");
        
        
      
     List<Locator> links=   page.getByRole(AriaRole.LINK).all();
//        
//         Page p=  page.waitForPopup(new Page.WaitForPopupOptions().setPredicate(t->t.context().pages().size()==3),()->
//         {
//         	
//         	links.get(1).click();
//         	links.get(2).click();
//         
//         	
//         });
//         
//         
//         
//        List<Page>  pages=page.context().pages();
//        
//         System.out.println(pages.get(1).url());
//         System.out.println(pages.get(2).url());
//         
//         pages.get(1).close();
//         
//         pages.get(2).close();
//         
         
         for (int i = 3; i <links.size(); i++)
         {
        	links.get(i).click();
        	Thread.sleep(5000);
        	System.out.println(page.locator("#linkResponse").innerText());
        	
        	
        	
		 }
         
      
	}
	
	
	
        
	
}
        
	
	
	




