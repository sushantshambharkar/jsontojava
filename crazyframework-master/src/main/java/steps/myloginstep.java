package steps;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getPages;

import java.util.List;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import pages.myloginpage;




public class myloginstep {

	private myloginpage loginpage;
	private String baseurl;
	private String webtabledata;
	private String webtableList;
	
	
	
	
	public void  openloginpage() 
	{
		//System.setProperty("webdriver.gecko.driver" , "C:\\selenium\\WebDrivers\\geckodriver.exe");
		//loginpage.openUrl("https://www.google.com/");
		loginpage.openloginpage();
	};
	
	public void searchforthetext(String arg1) 
	{
		System.out.println("search text comes here");
		loginpage.searchproduct(arg1);
		
	}
	
	
	public void getwebtabledata()
	{
		webtabledata= loginpage.getwebtableproductdesc();
		System.out.println(webtabledata);

		webtableList= loginpage.getwebtableallproductdesc();
		System.out.println(webtableList);
		
	}
	
	
	public String getBaseurl() 
	{
		return baseurl;
	}
	public void setBaseurl(String baseurl) {
		this.baseurl = baseurl;
	}


}
