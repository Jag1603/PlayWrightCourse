package Advanced;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

public class WebTableDemo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		Playwright play=Playwright.create();
	    Browser browser = play.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
        Page page= browser.newPage();
        
        page.navigate("http://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
        Thread.sleep(5000);
        
       //  List<String>  coloumns=   page.getByRole(AriaRole.COLUMNHEADER).allTextContents();

       Locator tabledata = page.locator("#customers");
    
         
       List<Locator>  rows=tabledata.locator("tr").all();
       
       for (int i=0;i<rows.size();i++)
       {
		
    	  List<Locator> cols= rows.get(i).locator("td").all();
    	   
    	  for (int j = 0; j < cols.size(); j++) 
    	  {
    		     
    		        
    		        System.out.println(cols.get(j).innerText());
		   } 
    	   
    	  
    	   
	   }
       
      
      

	}

}
