package Advanced;

import java.util.Iterator;
import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Frame;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

public class FrameHandling 
{

	public static void main(String[] args)
	{
		
		
		Playwright play=Playwright.create();
	    Browser browser = play.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
        Page page= browser.newPage();
        
        page.navigate("https://demo.automationtesting.in/Frames.html");
//        List<Frame> frames=   page.frames();
//        
//        System.out.println(frames.size());
//        
	 	
        
     Frame singleframe=   page.frame("SingleFrame");
     
     singleframe.getByRole(AriaRole.TEXTBOX).fill("jagadeesh");
     
   //  singleframe.locator("//div[@class='row']//following-sibling::input[1]").fill("Jagadeesh");

     page.click("//a[text()='Iframe with in an Iframe']");
     List<Frame> frames=   page.frames();
     
   Frame nestedframe=  page.frameByUrl("https://demo.automationtesting.in/MultipleFrames.html");
   
  // nestedframe.getByRole(AriaRole.TEXTBOX).fill("xxxx");
     
    
   List<Frame> child= nestedframe.childFrames();
   
   child.get(0).type("input", "xxxxx");
  
     
     
	}
	
	
 
}
