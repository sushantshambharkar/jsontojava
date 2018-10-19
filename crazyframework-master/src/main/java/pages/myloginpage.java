package pages;

import net.serenitybdd.core.pages.PageObject;

import java.util.Arrays;
import java.util.List;



import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://www.crazimart.com/")
public class myloginpage extends PageObject {

	
	
public void openloginpage()
	{
		open();
	}
	
	@FindBy(id="search_query")
	private WebElementFacade searchinput;
	
	@FindBy(xpath="//div[@id='SearchForm']/form/input[2]")
	private WebElementFacade searchinputgolink;

	@FindBy(xpath="html[1]/body[1]/div[1]/div[3]/div[3]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/ul[1]/li[3]/div[2]/span[1]/span[1]")
	private WebElementFacade webtableproductdetails;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[3]/div[3]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/ul[1]/li[3]/div[2]/strong[1]/a[1]")
	private WebElementFacade webtableproductdesc;

	@FindBy(xpath="//a[@class='TrackLink']")
	private List <WebElementFacade> webtableproductalldesc;
	
	@FindBy(xpath="//span[@class='ProductPrice']")
	private WebElementFacade webtableproductallprice;




	public String getwebtableproductdesc() {
		return webtableproductdesc.getTextValue();
	}
	
	
	 public String getwebtableallproductdesc() {
		 List<WebElementFacade> webtableproductalldesc = findAll("//a[@class='TrackLink']");
		 return webtableproductalldesc.get(2).getText();
		 }
	
	//public String getwebtableallproductdesc() {
		
		//return webtableproductalldesc.get(2);
		//List <WebElementFacade> allproductdesc = findAll(By.xpath("//a[@class='TrackLink']"));
		//System.out.println(allproductdesc.get(2));
		//return extract(allproductdesc, on(WebElement.class).getText());
		
		//List<WebElementFacade> tabs = findAll("//div[@id='tabs']//a");
	    //return extract(tabs, on(WebElement.class).getText());
	//}

	public void searchproduct(String arg1) {
		// TODO Auto-generated method stub
		searchinput.sendKeys(arg1);
		searchinputgolink.click();	
	}
}
