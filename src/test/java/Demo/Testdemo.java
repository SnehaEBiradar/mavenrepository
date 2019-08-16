package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testdemo {
static
{
	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
}

@Test
public void Test1()
{   WebDriver driver=new ChromeDriver();
    driver.get("https://www.google.com");
	
	System.out.println(driver.getTitle());
	driver.close();
}
}
