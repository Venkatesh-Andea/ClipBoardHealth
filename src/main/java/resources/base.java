package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static com.codeborne.selenide.Selenide.switchTo;

public class base {

	public  WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver() throws IOException
	{
 			prop= new Properties();
		FileInputStream fis=new FileInputStream("src//main//java//resources//data.properties");
			prop.load(fis);
		String browserName=prop.getProperty("browser");
		System.out.println(browserName);

	if(browserName.equals("chrome"))
	{
	  	WebDriverManager.chromedriver().setup();
		//driver= new ChromeDriver();  // WebDriverManager will take care of broswer.exe files
		//execute in chrome driver
	
	}
	else if (browserName.equals("firefox"))
	{
		//firefox code
		WebDriverManager.firefoxdriver().setup();
		//driver= new FirefoxDriver();

	}
	else if (browserName.equals("IE"))
	{
//	IE code
	}


	return driver;


}


public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
{
	TakesScreenshot ts=(TakesScreenshot) driver;
	File source =ts.getScreenshotAs(OutputType.FILE);
	String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
	FileUtils.copyFile(source,new File(destinationFile));
	return destinationFile;
}

	public void switchToChildWindow(){
		String parent= driver.getWindowHandle();
		Set<String> alldwindows = driver.getWindowHandles();
		for(String child:alldwindows){
			if(!parent.equals(child)){
				driver.switchTo().window(child);
			}
		}
	}

	public  String switchToNewWindow(String currentWindow) {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String wh : windowHandles) {
			if (!wh.equalsIgnoreCase(currentWindow)) {
				switchTo().window(wh);
				return wh;
			}
		}
		throw new UnsupportedOperationException("Attempted to switch to window but it was not present");
	}
}
