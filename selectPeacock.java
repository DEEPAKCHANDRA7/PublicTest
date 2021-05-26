package com.rokuality.test.tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class selectPeacock {

	//public static WebDriver driver;
	public static AppiumDriver driver;
	public static void main(String []args) throws Exception {
		// File classpathRoot = new File(System.getProperty("user.dir"));
		// File appDir = new File(classpathRoot, "/Apps/Amazon/");
		// File app = new File(appDir, "in.amazon.mShop.android.shopping.apk");

		DesiredCapabilities capabilities = new DesiredCapabilities();
		//capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("deviceName", "SHIELD");
		capabilities.setCapability("platformVersion", "9");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("automationName", "UiAutomator2");
		//capabilities.setCapability("startIWDP", "false");
		capabilities.setCapability("app", "C:\\Users\\Deepak\\Desktop\\app-peacockGoogle-US-USProd-AndroidTVRC-debug.apk");
		capabilities.setCapability("newCommandTimeout", 0);
		capabilities.setCapability("noReset","true");
		capabilities.setCapability("fullReset","false");
		//		capabilities.setCapability("apppackage", "");
		//		capabilities.setCapability("appActivity", "");

		//		capabilities.setCapability("app", "");
		//		capabilities.setCapability("apppackage", "com.nbcu.peacocktvdev");
		//		capabilities.setCapability("appActivity", "com.peacock.peacocktv.AmazonMainActivity");

		/*{
			  "platformName": "Android",
			  "platformVersion": "7",
			  "automationName": "UiAutomator2",
			  "deviceName": "fireTv",
			  "startIWDP": false,
			  "app": "",
			  "apppackage": "com.nbcu.peacocktv",
			  "appactivity": "com.peacock.peacocktv.AmazonMainActivity"
			}*/

		//		driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		//driver = new AndroidDriver(new URL("https://127.0.0.1:4723/wd/hub"), capabilities);
		driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

		//atvPressHome();
		//atvPressDown();
		//atvPressDown();
		//atvPressDown();

		//		Thread.sleep(18000);
		//		WebElement signin = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button[1]");
		//		signin.click();
		//		//Wait for page to load
		//		WebDriverWait wait = new WebDriverWait(driver, 30);
		//		Thread.sleep(15000);
		//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button[1]")).click();
		//		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By//.id("immersive-sign-in-button")));
		//		        .xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button[1]")));
		//		
		//		atvPressUp();
		//		Thread.sleep(2000);
		//		atvPressEnter();
		//		Thread.sleep(5000);
		//		//atvADBSendKeys("arunkumaran.p@nbcuni.com");
		//		qwertyKeyboard("ARUNKUMARAN.P@NBCUNI.COM");
		//		atvPressRight();
		//		atvADBSendKeys("xn9gxc7HD8rX");

		//		atvPressDown();
		//		atvPressDown();

		WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("immersive-sign-in-button")));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//android.widget.Image[contains(@resource-id, 'image-')]")));
		//#################Working Method. do not Delete############
	selectAsset("featured films", "A Serious Man");
	
	//searchAsset("Search Movies","LUCY");
	
	
	

//		Thread.sleep(2000);
//
//		//check if Watch Now/Resume button for a movie is displayed
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[contains(@resource-id, 'watchNow') and @focused='true']")));
		atvPressEnter();
		//#################Working Method. do not Delete############
		
		
		//Image Comparison used
		//searchAsset("PARK AND", "Parks and Recreation");
		
	}
	
	protected static void atvADBCommand(String command) throws Exception
	{
		//Runtime.getRuntime().exec("adb -s "+ udid + " shell input keyevent "+command);
		Runtime.getRuntime().exec("cmd.exe /c adb shell input keyevent "+command);
		
		//Runtime.getRuntime().exec("node harmonyHubCLI.js -l 10.0.1.39 -d 'TV' -c "+command);
		
		Thread.sleep(2000);
	}

	protected static void atvADBSendKeys(String text) throws Exception
	{
		//Runtime.getRuntime().exec("adb -s "+ udid + " shell input keyevent "+command);
		Runtime.getRuntime().exec("adb shell input text '"+text+"'");
		Thread.sleep(2000);
	}

	public static void selectAsset(String railName, String itemName) {
		boolean notAtContentItem = true;
		boolean gameFound = false;
		int startTime;
		int timer;
		String railElementXpath =
				"//android.view.View[@focused=\"true\"]/../../../android.view.View[contains(@resource-id, \"rail\")]";

		String currentSelectedItem = "//android.view.View[@focused=\"true\"]/..//android.widget.TextView";
		WebElement railElement;
		atvPressDown();
		//		WebElement currentFrame = driver.findElementByXPath(currentSelectedItem);
		//		System.out.println(currentFrame.getText());
		//		startTime = (int)(System.currentTimeMillis() / 1000);
		//		while (notAtContentItem)
		//		{
		//			timer = (((int)(System.currentTimeMillis() / 1000))-startTime);
		//			if(timer>90)
		//			{
		//				//throw new Exception("selecting content item takes too long, fail");
		//				break;
		//			}
		String currentRail;
		do {
			atvPressDown();

			railElement = driver.findElementByXPath(railElementXpath);
			currentRail = railElement.getAttribute("text");
			System.out.println(currentRail);
		}while(!currentRail.equalsIgnoreCase(railName));

		String currentAsset;
		String previousAsset="none";
		do {
			railElement = driver.findElementByXPath(currentSelectedItem);
			currentAsset = railElement.getAttribute("text");
			if(currentAsset.equalsIgnoreCase(itemName)) {
				atvPressEnter();
			}else {
				if(previousAsset.equals(currentAsset)) {
					System.out.println("Asset not found in rail");
					break;
				}
				previousAsset = currentAsset;
				atvPressRight();
			}
			System.out.println(currentRail);
		}while(!currentAsset.equalsIgnoreCase(itemName));
		//		}
	}

	protected static boolean selectContentItem(String menuItemName, String itemName) throws Exception {

		boolean notAtContentItem = true;
		boolean gameFound = false;
		int startTime;
		int timer;
		WebElement contentItemRoot;
		List<WebElement> contentItems;
		WebElement contentItem;
		String itemText;
		String rootElementXpath =
				"//android.widget.ImageView[@content-desc='Peacock']";
		//android.widget.ImageView[@content-desc="Netflix"]
		//	   "//android.widget.TextView[@resource-id='com.nvidia.tegrazone3:id/row_header' and contains(translate(@text, '";

		startTime = (int)(System.currentTimeMillis() / 1000);
		while (notAtContentItem)
		{
			timer = (((int)(System.currentTimeMillis() / 1000))-startTime);
			if(timer>90)
			{
				//throw new Exception("selecting content item takes too long, fail");
				break;
			}

			contentItemRoot = driver.findElementByXPath(rootElementXpath);
			//driver.findElementByXPath(using)
			//+menuItemName.toUpperCase()+"', '"+menuItemName.toLowerCase()+"'),'"+menuItemName.toLowerCase()+"')]/../../.."));
			//contentItems = contentItemRoot.findElements(By.id(resMenuItemContentElement));
			contentItems = driver.findElementsByXPath(rootElementXpath);
			String x = "//android.widget.TextView[@resource-id='com.nvidia.tegrazone3:id/row_header' and contains(translate(@text, '"
					+menuItemName.toUpperCase()+"', '"+menuItemName.toLowerCase()+"'),'"+menuItemName.toLowerCase()+"')]/../../..";

			System.out.println(x);

			//contentItems = contentItemRoot.findElements(By.id(resMenuItemContentElement));
			//contentItems = contentItemRoot.findElements(By.id(resMenuItemContentElement));

			// select content item (game)
			for (int j = 0; j < contentItems.size(); j++)
			{
				contentItem = contentItems.get(j);
				itemText = contentItem.getText().toLowerCase();
				if (itemText.contains(itemName.toLowerCase()))
				{
					if (contentItem.getAttribute("selected").toLowerCase().equals("true"))
					{
						System.out.println("content item found");
						atvPressEnter();
						notAtContentItem = false;
						gameFound = true;
						break;
					}
				}
			}
			if (notAtContentItem)
			{
				atvPressRight();
			}
			Thread.sleep(60);
		}
		return gameFound;
	}

	private static void atvPressRight() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Press RIGHT");
			atvADBCommand("KEYCODE_DPAD_RIGHT");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void atvPressLeft() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Press LEFT");
			atvADBCommand("KEYCODE_DPAD_LEFT");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void atvPressEnter() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Press ENTER");
			atvADBCommand("KEYCODE_ENTER");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void atvPressDown() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Press DOWN");
			atvADBCommand("KEYCODE_DPAD_DOWN");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void atvPressUp() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Press UP");
			atvADBCommand("KEYCODE_DPAD_UP");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void atvPressHome() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Press HOME");
			atvADBCommand("KEYCODE_HOME");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void qwertyKeyboard(String searchText) {
		String[] line1 = new String[] {"Q","W","E","R","T","Y","U","I","O","P"};
		String[] line2 = new String[] {"A","S","D","F","G","H","J","K","L","back"};
		String[] line3 = new String[] {"Z","X","C","V","B","N","M",".","_","-"};
		String[] line4 = new String[] {"CAPS","NUMBER","=","@",".com","@gmail.com","@yahoo.com","@outlook.com"};

		//String searchText = "FIRE";
		int length = searchText.length();

		atvPressDown();

		for(int i=0;i<length;i++) {


			char ch = searchText.charAt(i);
			if((Arrays.asList(line1).indexOf(""+ch+""))<0) {
				System.out.println("Not available in line 1");
				System.out.println("Remote Press to line 2");

				if((Arrays.asList(line2).indexOf(""+ch+""))<0) {
					System.out.println("Not available in line 2");
					System.out.println("Remote Press to line 3");

					if((Arrays.asList(line3).indexOf(""+ch+""))<0) {
						System.out.println("Not available in line 2");
						System.out.println("Remote Press to line 3");

						if((Arrays.asList(line4).indexOf(""+ch+""))<0) {
							System.out.println("Not available in line 4");

						}else {
							System.out.println("Available in line 4");
							System.out.println(Arrays.asList(line4).indexOf(""+ch+"")); 

							atvPressDown();
							atvPressDown();
							atvPressDown();
							//Thread.sleep(2000);

							for(int row3=0;row3<Arrays.asList(line4).indexOf(""+ch+"");row3++) {
								atvPressRight();
							}

							atvPressEnter();

							for(int row3=0;row3<Arrays.asList(line4).indexOf(""+ch+"");row3++) {
								atvPressLeft();

							}

							atvPressUp();
							atvPressUp();
							atvPressUp();
						}
					}else {
						System.out.println("Available in line 3");
						System.out.println(Arrays.asList(line3).indexOf(""+ch+"")); 

						atvPressDown();
						atvPressDown();
						//Thread.sleep(2000);

						for(int row3=0;row3<Arrays.asList(line3).indexOf(""+ch+"");row3++) {
							atvPressRight();
						}

						atvPressEnter();

						for(int row3=0;row3<Arrays.asList(line3).indexOf(""+ch+"");row3++) {
							atvPressLeft();

						}

						atvPressUp();
						atvPressUp();
					}
				}else {
					System.out.println("Available in line 2");
					System.out.println(Arrays.asList(line2).indexOf(""+ch+"")); 

					atvPressDown();

					for(int row2=0;row2<Arrays.asList(line2).indexOf(""+ch+"");row2++) {
						atvPressRight();
					}

					atvPressEnter();

					for(int row2=0;row2<Arrays.asList(line2).indexOf(""+ch+"");row2++) {
						atvPressLeft();

					}

					atvPressUp();
				}

			}else {
				System.out.println("Available in line 1");
				System.out.println(Arrays.asList(line1).indexOf(""+ch+"")); 

				for(int row1=0;row1<Arrays.asList(line1).indexOf(""+ch+"");row1++) {
					atvPressRight();

				}

				atvPressEnter();

				for(int row1=0;row1<Arrays.asList(line1).indexOf(""+ch+"");row1++) {
					atvPressLeft();

				}
			}
		}

	}
	
	private static void searchQWERTYKeyboard(String searchText) {
		String[] line1 = new String[] {"Q","W","E","R","T","Y","U","I","O","P"};
		String[] line2 = new String[] {"A","S","D","F","G","H","J","K","L","back"};
		String[] line3 = new String[] {"Z","X","C","V","B","N","M",".","1"," "};
		//String[] line4 = new String[] {"CAPS","NUMBER","=","@",".com","@gmail.com","@yahoo.com","@outlook.com"};

		//String searchText = "FIRE";
		int length = searchText.length();

		atvPressDown();

		for(int i=0;i<length;i++) {


			char ch = searchText.charAt(i);
			if((Arrays.asList(line1).indexOf(""+ch+""))<0) {
				System.out.println("Not available in line 1");
				System.out.println("Remote Press to line 2");

				if((Arrays.asList(line2).indexOf(""+ch+""))<0) {
					System.out.println("Not available in line 2");
					System.out.println("Remote Press to line 3");

					if((Arrays.asList(line3).indexOf(""+ch+""))<0) {
						System.out.println("Not available in line 2");
						System.out.println("Remote Press to line 3");

//						if((Arrays.asList(line4).indexOf(""+ch+""))<0) {
//							System.out.println("Not available in line 4");
//
//						}else {
//							System.out.println("Available in line 4");
//							System.out.println(Arrays.asList(line4).indexOf(""+ch+"")); 
//
//							atvPressDown();
//							atvPressDown();
//							atvPressDown();
//							//Thread.sleep(2000);
//
//							for(int row3=0;row3<Arrays.asList(line4).indexOf(""+ch+"");row3++) {
//								atvPressRight();
//							}
//
//							atvPressEnter();
//
//							for(int row3=0;row3<Arrays.asList(line4).indexOf(""+ch+"");row3++) {
//								atvPressLeft();
//
//							}
//
//							atvPressUp();
//							atvPressUp();
//							atvPressUp();
//						}
					}else {
						System.out.println("Available in line 3");
						System.out.println(Arrays.asList(line3).indexOf(""+ch+"")); 

						atvPressDown();
						atvPressDown();
						//Thread.sleep(2000);

						for(int row3=0;row3<Arrays.asList(line3).indexOf(""+ch+"");row3++) {
							atvPressRight();
						}

						atvPressEnter();

						for(int row3=0;row3<Arrays.asList(line3).indexOf(""+ch+"");row3++) {
							atvPressLeft();

						}

						atvPressUp();
						atvPressUp();
					}
				}else {
					System.out.println("Available in line 2");
					System.out.println(Arrays.asList(line2).indexOf(""+ch+"")); 

					atvPressDown();

					for(int row2=0;row2<Arrays.asList(line2).indexOf(""+ch+"");row2++) {
						atvPressRight();
					}

					atvPressEnter();

					for(int row2=0;row2<Arrays.asList(line2).indexOf(""+ch+"");row2++) {
						atvPressLeft();

					}

					atvPressUp();
				}

			}else {
				System.out.println("Available in line 1");
				System.out.println(Arrays.asList(line1).indexOf(""+ch+"")); 

				for(int row1=0;row1<Arrays.asList(line1).indexOf(""+ch+"");row1++) {
					atvPressRight();

				}

				atvPressEnter();

				for(int row1=0;row1<Arrays.asList(line1).indexOf(""+ch+"");row1++) {
					atvPressLeft();

				}
			}
		}

	}
	public static void searchAsset(String searchText, String assetName) throws FindFailed {
		//Pattern matching for Sikuli
		
		
		String filepath = "C:\\Users\\Deepak\\Documents\\Images\\";
		Screen s = new Screen();
		Pattern searchResultsSelected = new Pattern(filepath + "Search_Park_Selected.PNG");
		Pattern homePageBrowseSelected = new Pattern(filepath + "HomePage_BrowseSelected.PNG");
		Pattern homePageSearchSelected = new Pattern(filepath + "HomePage_SearchSelected.PNG");
		
		
		
		
		
		//Press left button when browse is highlighted
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("immersive-sign-in-button")));
		//wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//android.view.View[contains(@text, 'Browse') and @focused='true']")));
		s.wait(homePageBrowseSelected, 40);
		atvPressLeft();
		atvPressLeft();
		atvPressLeft();
		
		//Press Ok button if search button is selected
		//wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//android.view.View[contains(@text, 'Search') and @focused='true']")));
		s.wait(homePageSearchSelected, 20);
		atvPressEnter();
		
		//Type the key
		searchQWERTYKeyboard(searchText);
		
		//Press  Down key 4 times to select the first asset in Results
		atvPressDown();
		atvPressDown();
		atvPressDown();
		atvPressDown();
		
		//Check the searched asset is displayed or not
		s.wait(searchResultsSelected, 20);
		
		//Select Enter
		atvPressEnter();
	}
}