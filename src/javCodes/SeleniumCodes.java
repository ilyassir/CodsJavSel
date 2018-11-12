package javCodes;

//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
//import org.testng.asserts.SoftAssert;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.Test;


//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.testng.Assert;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

//public class SeleniumCodes {
//public static void main(String[] args) {
	
	//most important imports;
	/*
	 * 	import org.openqa.selenium.By;  //before adding these imports, build new path.
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;
		import org.openqa.selenium.Keys;
		import org.testng.Assert;
		import org.testng.annotations.AfterMethod;// before adding these imports, import TestNG class.
		import org.testng.annotations.BeforeMethod;
		import org.testng.annotations.Test;
		
	 */
	
	//setting the browser
	
	
	//System.setProperty("webdriver.chrome.driver", 
	
	
	//"C:\\Users\\sir\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
	
	
	//WebDriver driver=new ChromeDriver();
	
	
	//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	//Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(5, TimeUnit.SECONDS) //customize the time-out
	//.pollingEvery(900, TimeUnit.MILLISECONDS) 						//pass how often you want to try
	//.ignoring(NoSuchElementException.class); 							//pass the exception you want to be ignored



	//WebDriverWait wait=new WebDriverWait(driver, 7);					//this method takes only seconds.
																		//WebDriverWait this is a class that let us wait for a certain action.
																		//wait until an element becomes visible
																		//wait until element disappears
																		//wait until element gets a text
																		//wait until element becomes clickable
																		//this methods needs two things to work;
																			//1 Element or locator
																			//2 condition

	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
																		//it will find the element and will wait 5 seconds till it is visible if it is not visible.

																		//1.wait.until(arg0) this starts the wait action
																		//2.ExpectedConditions.visibilityOfElementLocated   this is the condition
																		//3.By.id("finish"))  locator
//WebDriverWait wait=new WebDriverWait(driver, 7);

//Boolean gone=wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[.='Wait for it... ']")));
//wait till the text "wait for'' sentence disappear

//gone=wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[.=\"It's gone!\"]")));
//Now I will go to the other method

	//driver.manage().window().maximize();								this is to maximize the screen.Must come before any other methods
	//driver.get("http://google.com");                          		goes to the website
	//driver.getTitle();                                        		takes the Title of the webpage
	//driver.close();                                           		closes the webpage.
	//driver.navigate().to("http:cybertekschool.com");          		just like get method. goes to the website stated.
	//driver.getCurrentUrl();//                                			this takes the url of current open page
	//driver.findElement(By.linkText("Gmail")).click();         		this is to find an element by name and then click on it.
	//driver.findElement(By.id("email")).sendKeys("alisim@gmail.com")   here I find my target by ID then assign some values
	//driver.navigate().back();                                 		using the "go back" button
	//driver.navigate().forward();                              		using the "go back" button
	//driver.findElement(By.name("userName")).sendKeys("tutorial");		here I find the button by its name from the html inspect, then use "sendKeys" to write smt there.
	//driver.findElement(By.name("password")).sendKeys("tutorial");		here I find the button by its name from the html inspect, then use "sendKeys" to write smt there.
	//driver.findElement(By.name("login")).click();						here I click on an button which I found the name from html inspect.
	//driver.findElement(By.linkText("Sell on")).click();               this method is for full text Link
	//driver.findElement(By.linkText("View all orders")).click();  		another exp for link text
	//driver.findElement(By.partialLinkText("Sell on")).click();        we can use partial text Link too. This can be the beginning or last part of the full text. 
	//driver.findElement(By.name("pass"))                               here I use name, when we use tag names. we shoud be sure that there is only one "input". If there are more than 1, 
	                                                                    //the first input will be assigned to our code. We should be also sure that this input is visible.
	//driver.findElement(By.tagName("pass")).sendKeys("alisim1986");    here I use tagname. There may be several same tagnames so we must be sure that this is unique.
	//driver.findElement(By.className("pass")).sendKeys("alisim1986");  here I use classname. There may be several the same classes so we must be careful. This is not unique.
	//driver.findElement(By.xpath("/html/body/div/div/form/input[2]"));	here I am using xpath which is not always healthy and is hard to use. "[]" is for number 2 box.
	//System.out.println(one.isSelected());is Selected method           to check selections on a checkbox.
	//driver.findElement(By.id("lst-ib")).sendKeys("car"+Keys.ENTER);   here I clicked enter.It is used with in sendKeys method with "+" sign  
	//driver.quit();                                                    quit will close all tabs used by selenium.
	//driver.close();                                                   closes the current tab
	//driver.findElement(By.id("ctl00_MainContent_fmwOrder")).clear();  Here I clear the text button
	//driver.findElement(By.id("huy")).sendKeys("test"+Keys.ENTER);		After entering my username, I press ENter button. No need to go to an other button and click.
	
	//table=driver.findElement(By.xpath("//table[@class='Pr']"));
	//System.out.println("this is "+table.getText());					this will give all the texts in the table, rows, cloums, headers etc.

	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  waits certain time while finding element.this works with findElement and/or findElements methods. 
																		//After creating the driver obj, give this command immediately. Waits certain time while finding element
	
//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS)  this will wait till the page loads
	

//String txt=driver.findElement(By.id("twota")).getAttribute("va"); here I assign the valu attribute to a string.
//



																		//CREATING LISTS

	//List<WebElement> allResults=driver.findElements(By.tagName("h2"))

															//SPECIAL XPATHS	

	//a means link we can use linkText	
	//* means anything
	//a[.='TEXT']	
	//a[.='Help']														will find any attributes that contains "Help" text
	//(//a[.='Help'])[2]												will find the 2nd one with the "Help" text
	//input[@id='a'][@name='b']											will find the input which`s name is "b" under id "a".
	//div[@id='navFooter']//a[.='Help']   								this will find the help under NavFooter ID.
	//*[.='text']-->													any tag with a certain text, must be only exact text. otherwise it will not work
	//*[contains(text(), 'text')] 										this can find more matches because it is just some text not exact the same
	//driver.findElement(By.xpath("//td[.='Mark smith']/../td[11]"));	.. means go parent class and find the following path

//Example 1)
//<div class="profile_cont" itemtype="http://schema.org/Article" itemscope="">
//<img src="http://toolsqa.wpengine.com/wp-content/uploads/2014/02/Profile.jpg?51a507" itemprop="image">
					//xpath for the image is: // img[contains(@src,’Profile’)] we ar elooking for the images in which src`s profile is conatiined
//Example 2)

//<img alt="Visit Us On Linkedin" style="border:0px;" src="http://toolsqa.wpengine.com/wp-content/uploads/2014/04/linkedin.png">
					//xpath is:  //img[starts-with(@alt,’Visit Us On Linkedin’)]

//Example 3)
//*[@class='featured-box']//*[text()='Testing'] here I find the class in the class I am looking for a text that is 'Testing' 

//Example 4)
//<input type="submit" name="btnLogin" value="LOGIN">
					//xpath is:    //*[contains(@type,'sub')]
					//Xpath is 	   //*[contains(@name,'btn')]
					//Xpath is 	   //*[contains(@value,'LOG')]
//Example 5)
//<a href="http://demo.guru99.com/">here</a>
					//Xpath is	   //*[contains(text(),'here')]
					//Xpath is	   //*[contains(@href,'guru99.com')]

//Example 5)
//<input type="reset" name="btnReset" value="RESET">
					//Xpath is	   //*[@type='reset' and @name='btnReset']


//Example 6)
//<label id="message18"></label>
					//Xpath is	   //label[starts-with(@id,'message18')]



//DROPDOWN LIST SELECT METHOD
    //WebElement element=driver.findElement(By.id("dropdown"). //       here I create a method of Web Element by its ID.
	//Select list=new Select(element);									here I pass the above created value to the new selext list	
	//list.getFirstSelectedOption().getText());							this returns the first option selected.
	//list.getAllSelectedOption().getText();							this returns all selected options.Some websites allow multi select dropdown lists.
	//List<WebElement> allOptions=list.getOptions();  					Here I will take and see all the options in the dropdown list.
		//for
		//(WebElement we:allOptions) 
		//System.out.println(we.getText());
	//list.selectByVisibleText("Option 2");								here we see the visible text and we will use it to click on.Visible means selectable not seenable.
	//list.selectByValue("2");											We can also use the select by Value


	
																		//VERIFYING EXISTENCE
//try {																	here I am trying to verify that the login button is not visible after I login.
//WebElement el=driver.findElement(By.id("ctl00_MainContent_login_button")); Here I create a web element "el".
//Assert.assertTrue(el.isDisplayed());									//here I look whether it is there
//}catch(NoSuchElementException nse) {									If I did not use try catch then the test would fail because the login button is not visible right now because I am in a diff web page. 
//Assert.assertTrue(true);												then I say if you catch it, assert it to true because if you catch ot ot means ot os not there.

																		//VERIFYING NON-EXISTENCE
//public static void verifyElementDoesnotExist(WebDriver driver, By by) {//by refers to By.className("koi") we must write like this.
	//try {
		//Assert.assertFalse(driver.findElement(by).isDisplayed());
	//}catch(NoSuchElementException e) {
		//Assert.assertTrue(true);
																		//VERIFYING TITLE CONTAINS

//public static void verifyTitleContains(WebDriver driver, String expected) {
//	String actual = driver.getTitle();
//	if(actual.contains(expected)) {
//		System.out.println("verify Title Contains passed");
//		}else {
//			System.out.println("verify Title contains failed");
//			System.out.println("expected: "+ expected);
//			System.out.println("actual: "+ actual);}}


                                                   						//VERIFYING TITLE EQUALS


//public static void verifyTitleEquals(WebDriver driver, String expected) {
//	String actual = driver.getTitle();
//	if(actual.equalsIgnoreCase(expected)) {
//		System.out.println("verify Title equals passed");
//		}else {
//			System.out.println("verify Title equals failed");
//			System.out.println("expected: "+ expected);
//			System.out.println("actual: "+ actual);}}
													

																		//VERIFYING URL EQUALS

//public static void verifyURLEquals(WebDriver driver, String expected) {
//	String actual = driver.getCurrentUrl();
//	if(actual.equalsIgnoreCase(expected)) {
//		System.out.println("verify URL equals passed");
//		}else {
//			System.out.println("verify URL failed");
//			System.out.println("expected: "+ expected);
//			System.out.println("actual: "+ actual);}}
//}
																		//VERIFYING CHECKED

//public static void verifyCheckBoxChecked(WebElement one) {
//	if (one.isSelected()) {
//		System.out.println("checkbox 1 pass");
//		} else {
//			System.out.println("checkbox 1 fail");}
//	}

																		//CHANGING THE WINDOW METHOD
//public static void changeWindow(WebDriver driver, String targetTitle) {
//	
//	for(String handle:driver.getWindowHandles()) {
//		driver.switchTo().window(handle);
//		driver.switchTo().window(handle);
//		if(driver.getTitle().equals(targetTitle)) {
//			return;}}}}		


	                                                     				//ASSERT CODES//
	
	//import org.testng.Assert;
	//import org.testng.annotations.AfterMethod;
	//import org.testng.annotations.BeforeMethod;
	//import org.testng.annotations.Test;

	//Assert.assertEquals(actual, expected); 							Finds to elements and checks whether they are equal or not.


																		//SOFT ASSERT
	
//SoftAssert soft=new SoftAssert(); 
//soft.assertTrue(false,"line 18");
//Here I can add Strings after a comma. It will print when it fails. If we use line number so we can know which line fails.Even if all tests fail, they will appear as passed without AssertAll() method.
//if I delete the assertAll method here, Still the below assertAll method(line 27) will also work for here too.
//Even if there is fail here, it will seen like pass but it will print the failure message in console

//assert.AssertAll(); this method will catch the all soft assert fails. If I ahave a lot of soft asserts in several tests, Even if I delete them and leave one in the last Test, It will catch all. 


																		//MOUSE OPERATORS (dont forget .perform)

//Actions actions=new Actions(driver);                                      Here we create a actions obj first and then we assign our driver into it.
//WebElement element=driver.findElement(By.xpath("//span[.='Hello. Sign in']")); here I created an element by it`s xpath
//actions.moveToElement(element).perform();                                 here I use moveTo method. We must use perform() to run moveto Action.
//================
//WebElement smCirc=driver.findElement(By.id("draggable"));
//WebElement bgCirc=driver.findElement(By.id("droptarget"));
//Actions actions=new Actions(driver);
//actions.dragAndDrop(smCirc, bgCirc).perform();							here, i drag one obect into another one both of which were determined earlier.
//================
//actions.moveToElement(smCirc).clickAndHold().moveToElement(bgCirc).
//release().//build().perform();											if there are multiple actions we need to call build() before perform().
//================
//WebElement puff=driver.findElement(By.id("puff_header"));
//Actions actions=new Actions(driver);
//actions.doubleClick(puff).perform();																here I double click an element which I had determined earlier
//================
//WebElement box=driver.findElement(By.xpath("//h3[.='Page 1 of jScroll Example - jQuery Infinite Scrolling Plugin']"));
//Actions actions=new Actions(driver);
//actions.moveToElement(box).click().sendKeys(Keys.PAGE_DOWN).build().perform(); 					here I am in a website and in a special scroll down obj.
//================
//actions.moveToElement(element).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_UP).build().perform(); here I click on th epage then go down and go up respectively.
	
																		//FILE UPLOAD AND DOWNLOAD

//selenium ityself cannot verify downloads. It can click on download link

//String file="C:\\Users\\sir\\Desktop\\pdf version.pdf";						this is for windows, I find the path of the fole and assign it to a String.
//driver.findElement(By.id("file-upload")).sendKeys(file);						I I find th eupload button and pass my path to there				
//Thread.sleep(1000);
//driver.findElement(By.id("file-submit")).click();								I click on the upload button.
	
	
																		//IFRAMES

//that are embedded to other websites for exm; google in navigatorss, hotel prorams etc. There are two webpages in one page. two different HTML codes are in one webpage.
//webdriver can control only one html page in one time. so if we want to deal with two webpages, we must be able to switch between these two or more layers.
//"Iframe" tag is a tag tat used  to put one HTML doc inside another. Selenium cannot see this second page which is hidden inside
//driver.switchTo()-> changes the frame one to another.
//driver.switchTo().parentFrame();-> switches to the parent frame.
//driver.switchTo().defaultContent();-> this is used to switch to the 1 st page if there are 3 pages
//If we have NoSuchElementException
	//we must check the locator
	//wait a little bit (Thread)
	//be sure it is not in a frame		
//driver.switchTo().frame(iframe);										now I am switching to the second frame. I could use driver.switchTo().frame(0) or driver.switchTo().frame("mce_0_ifr");
//driver.switchTo().parentFrame();										now I am going back to the original HTML. If I had 3 layers, I could use switchTo().defaultContent();




																		//POPUPS
//there are two types of popups
//1.java scripts alerts=we cannot deal with them. n inspect work
//2.browser popusps=we can inspect them as javascript code

//Alert alert=driver.switchTo().alert();								here I create a alert to cop-up with the pop ups.
//alert.accept()														I accept the alert by clicking on the ok button
	
//Alert alert=driver.switchTo().alert();								here I create a alert to cop-up with the pop ups.
//alert.dismiss();														I dismiss the alert by clicking on the cancel button

//when we try to click on other buttons befpre cancelling or accepting the pop up, it will say unexpected alert open:

																		


																		//IFRAMES
//We can 
//1) pass an element to the switchTo().frame(secondFrame), 
//2)we can pass the id/name of the iframe switchTo().frame(if_er_if)and 
//3)we can also pass the number of them switchTo().frame(0)like 0, 1 or 2... 

//driver.switchTo().frame() --> 										used to change from frame to frame
//when we are inside an iframe, we cannot see whats outside the iframe. we have to switch back to default frame
//driver.switchTo().parentFrame(); --> 									used to jump back to parent frame, not to the original, top level frame
//driver.switchTo().defaultContent() --> 								jumpts to the first frame, top level frame

																		//MULTIPLEWINDOWS
//for seleniium tab=window, selenium will control one tab at a time
//when we open a page it is the default window. Selenium cannot see the other windows. We have to switch
//String handle=driver.getWindowHandle();								will return id of the current page in a string
//driver.findElement(By.linkText("Click Here")).click();				here a new window is opened
//String handle2=driver.getWindowHandle();								will return id of the second page in a string

//Set<String> windowHandles=driver.getWindowHandles();					Now I am getting all open tabs` IDs.
	
//for(String s:windowHandles) {
	//	System.out.println(s);
		//if(s.equals(handle)) {										here I am trying to reach the first page. I can reach the other web page by saying !s.equals.
			//	newWindowHandle=s;
			//	newWindowHandle2=s;



//String targetTitle=("New Window");									I know this before I start testing.

//for(String handle:driver.getWindowHandles()) {
//	//first switch
//	//then check Title
//	driver.switchTo().window(handle);
//	if(driver.getTitle().equals(targetTitle)) {
//		//stop switching
//		break;


																//JavascriptExecutor

//JavascriptExecutor jsExecutor=(JavascriptExecutor) driver;
//jsExecutor.executeScript("alert ('WARNING:this is a useless message');");


//Here I usew javascript to scroll down to an element I want.
		//jsExecutor.executeScript("arguments[0].scrollIntoView(true)",element);
		//first elemet is javascript code
		//second element is element that our our code will be executed


////Here I used javascript to click on.
//jsExecutor.executeScript("arguments[0].click();", element);


													//TEST DEPENDENCIES AND PRIORITY
//@Test (priority = 0)											This declaration in the	method signature will start the test wit that method.
																//We can start from 1 or whatever we want.				

//@Test (dependsOnMethods = "productListing", enabled = true)	here I say this method depends on another method and I give its name in the siganture. 
																//if the depended method fails, this method will not run. 
																//enabled is to declare if you want thos method to be run. if we say enabled=false, it will not run the test





//E=tag
	//A=Attribute
	//t=value
	
	
	
	
	//for Regular elements
	//Allways 
	//1==go for the ID first because they are guaranteed to be unique. even if it is changed, it will be unique
	//2==name
	//3==tagname(if unique)
	//4==classnamwe
	//5==css or xpath
	
	//for Links
	//LinkText if unique
	//partial LinkText if unique

















