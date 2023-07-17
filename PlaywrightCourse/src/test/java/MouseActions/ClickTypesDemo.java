package MouseActions;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.MouseButton;

public class ClickTypesDemo 
{

	public static void main(String[] args) 
	{
		
		Playwright play=Playwright.create();
	    Browser browser = play.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
        Page page= browser.newPage();
        
        page.navigate("https://demoqa.com/buttons");
        
        //Double click 
        page.locator("//*[@id='doubleClickBtn']").dblclick();
        
        //Right click 
        page.locator("//*[@id='rightClickBtn']").click(new Locator.ClickOptions().setButton(MouseButton.RIGHT));

        //Dynamic click 
        
        page.locator("//div[@class='mt-4']/button[text()='Click Me']").click();
        
      
		

	}

}
