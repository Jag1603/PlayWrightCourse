package Advanced;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class AlertDemo 
{

	public static void main(String[] args) 
	{
		
		Playwright play=Playwright.create();
	    Browser browser = play.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
        Page page= browser.newPage();
        
        page.navigate("https://nxtgenaiacademy.com/alertandpopup/");
        
       
        
        
        page.onDialog(dialog -> 
        {
        	
        	System.out.println(dialog.message());
        	System.out.println(dialog.defaultValue());
        	
        	
        	dialog.accept("Yes");
        	
        	
        	
        	
        	
        	
        }
        );
        
        
         page.locator("//button[text()='Alert Box']").click();
         
         page.locator("//button[text()='Confirm Alert Box']").click();
         
         page.locator("//button[text()='Prompt Alert Box']").click();
         
       
         
         
        
        
        
        
		

	}

}
