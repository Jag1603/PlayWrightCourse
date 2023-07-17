package Advanced;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ModalDialogsDemo 
{

	public static void main(String[] args) 
	{
	
		Playwright play=Playwright.create();
	    Browser browser = play.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
        Page page= browser.newPage();
        
        page.navigate("https://demoqa.com/modal-dialogs");
        
        page.locator("//button[contains(text(),'Small modal')]").click();
        
        
        
        page.waitForSelector("//div[@class='modal-body']");
        
        
       String SmallModaltext= page.locator("//div[@class='modal-body']").innerText();
       
       System.out.println(SmallModaltext);
		
		
        page.locator("//button[text()='Close']").click();
        
        
        
        page.locator("//button[contains(text(),'Large modal')]").click();
        
        
      
        
        page.waitForSelector("//div[@class=\"modal-body\"]/p");
        
     String LargeModalText=   page.locator("//div[@class='modal-body']/p").innerText();
     
     System.out.println(LargeModalText);
     
     page.locator("//button[text()='Close']").click();
        
        
        
      
      
	}

}
