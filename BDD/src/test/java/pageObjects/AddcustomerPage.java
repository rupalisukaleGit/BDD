package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddcustomerPage {

	public WebDriver ldriver;

	//constructor
	public AddcustomerPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	By lnkCustomers_menu=By.xpath("//a[@href='#']//p[contains(text(),'Customers')]");
	By lnkCustomers_menuitem=By.xpath("//p[text()=' Customers']");

	By btnAddnew=By.xpath("//a[@class='btn btn-primary']"); //Add new

	By txtEmail=By.xpath("//input[@id='Email']");
	By txtPassword=By.xpath("//input[@id='Password']");

	By txtcustomerRoles=By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']");

	//i created
	By txtfromcustomerroles=By.xpath("(//input[@class='select2-search__field'])[2]");

	By lstitemAdministrators=By.xpath("//li[contains(text(),'Administrators')]");
	By lstitemRegistered=By.xpath("//li[contains(text(),'Registered')]");
	By lstitemRegisteredremove=By.xpath("//span[@class='select2-selection__choice__remove']");
	By blanktextbox = By.xpath("//div[@class='input-group-append input-group-required']");
	By lstitemGuests=By.xpath("//li[contains(text(),'Guests')]");
	By lstitemVendors=By.xpath("//li[contains(text(),'Vendors')]");


	By drpmgrOfVendor=By.xpath("//*[@id='VendorId']");
	By rdMaleGender=By.id("Gender_Male");
	By rdFeMaleGender=By.id("Gender_Female");

	By txtFirstName=By.xpath("//input[@id='FirstName']");
	By txtLastName=By.xpath("//input[@id='LastName']");

	By txtDob=By.xpath("//input[@id='DateOfBirth']");

	By txtCompanyName=By.xpath("//input[@id='Company']");

	By txtAdminContent=By.xpath("//textarea[@id='AdminComment']");

	By btnSave=By.xpath("//button[@name='save']");

	//Action methods

	public String getPageTitle() 
	{
		return ldriver.getTitle();
	}

	public void clickOnCustomersMenu() 
	{
		ldriver.findElement(lnkCustomers_menu).click();
	}

	public void clickOnCustomersMenuItem() 
	{
		ldriver.findElement(lnkCustomers_menuitem).click();
	}

	public void clickOnAddnew() 
	{
		ldriver.findElement(btnAddnew).click();
	}

	public void setEmail(String email)
	{
		ldriver.findElement(txtEmail).sendKeys(email);
	}

	public void setPassword(String password)
	{
		ldriver.findElement(txtPassword).sendKeys(password);
	}


	public void setCustomerRoles(String role) throws InterruptedException 
	{
		Thread.sleep(3000);
		ldriver.findElement(lstitemRegisteredremove).click();
		ldriver.findElement(blanktextbox).click();
		ldriver.findElement(blanktextbox).click();
		ldriver.findElement(lstitemGuests).click();
		ldriver.findElement(txtLastName).click();
	}


	//		if(!role.equals("Vendors")) //If role is vendors should not delete Register as per req.
	//		{
	//			ldriver.findElement(By.xpath("//*[@id='SelectedCustomerRoleIds']")).click();
	//		}
	//
	//		ldriver.findElement(txtcustomerRoles).click();
	//
	//		WebElement listitem;
	//
	//		Thread.sleep(3000);
	//
	//		if(role.equals("Administrators"))
	//		{
	//			listitem=ldriver.findElement(lstitemAdministrators); 
	//		}
	//		else if(role.equals("Guests"))
	//		{
	//			listitem=ldriver.findElement(lstitemGuests);
	//		}
	//		else if(role.equals("Registered"))
	//		{
	//			listitem=ldriver.findElement(lstitemRegistered);
	//		}
	//		else if(role.equals("Vendors"))
	//		{
	//			listitem=ldriver.findElement(lstitemVendors);
	//		}
	//		else
	//		{
	//			listitem=ldriver.findElement(lstitemGuests);
	//		}
	//
	//		//listitem.click();
	//		//Thread.sleep(3000);
	//		
	//		//or
	//
	//		JavascriptExecutor js = (JavascriptExecutor)ldriver;
	//		js.executeScript("arguments[0].click();", listitem);
	//
	//	}

	public void setManagerOfVendor(String value)
	{
		Select drp=new Select(ldriver.findElement(drpmgrOfVendor));
		drp.selectByVisibleText(value);
	}

	public void setGender(String gender)
	{
		if(gender.equals("Male"))
		{
			ldriver.findElement(rdMaleGender).click();
		}
		else if(gender.equals("Female"))
		{
			ldriver.findElement(rdFeMaleGender).click();
		}
		else
		{
			ldriver.findElement(rdMaleGender).click();//Default
		}

	}

	public void setFirstName(String fname)
	{
		ldriver.findElement(txtFirstName).sendKeys(fname);
	}

	public void setLastName(String lname)
	{
		ldriver.findElement(txtLastName).sendKeys(lname);
	}

	public void setDob(String dob)
	{
		ldriver.findElement(txtDob).sendKeys(dob);
	}

	public void setCompanyName(String comname)
	{
		ldriver.findElement(txtCompanyName).sendKeys(comname);
	}

	public void setAdminContent(String content)
	{
		ldriver.findElement(txtAdminContent).sendKeys(content);
	}

	public void clickOnSave()
	{
		ldriver.findElement(btnSave).click();
	}

}


