package Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webforms {

	public static  void main(String[] args) throws InterruptedException {
		//Launch Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		
	    //Maximize Browser
		driver.manage().window().maximize();
		//Open URL	
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		Thread.sleep(4000);
		//Find Webform Text Element 		
		WebElement we =driver.findElement(By.xpath("//h1[@class='display-6']"));
		String first_name = we.getText();
		System.out.println(first_name);
				
		 if(first_name.equals("Web form"))
		  {
			System.out.println("Test case pass");	
		  }
		  else 
		 {
			 System.out.println("Test Case Failed");
		 }
		//Find Text Input Element & Enter Name	
		driver.findElement(By.id("my-text-id")).sendKeys("Apurva");
		//Find Password Element & Enter Password		
		driver.findElement(By.name("my-password")).sendKeys("Apurva12");
		//Find Test area Element & Enter Text 		
		driver.findElement(By.tagName("textarea")).sendKeys("Hello Good morning");
		Thread.sleep(3000); // Sleep for 3sec
		//Find Index Element & Click		
		driver.findElement(By.linkText("Return to index")).click();
		Thread.sleep(3000);
		//Find Blank Element & click 		
		driver.findElement(By.linkText("blank.html")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
				
		//Find My select dropdown element & Select data 		
		Select sel = new Select(driver.findElement(By.name("my-select")));
		sel.selectByVisibleText("Two");
        //Find My datalist element       
		driver.findElement(By.name("my-datalist")).sendKeys(" new york");
        //Find File Input Element & Select File
		driver.findElement(By.name("my-file")).sendKeys("C:\\Users\\APURVA\\OneDrive\\Desktop\\blackpink.jpg");
		//Find CHECKBOX Element & Click 		
		driver.findElement(By.id("my-check-1")).click();
		//Find Radio button element & click		
		driver.findElement(By.id("my-radio-2")).click();
		//Find Datepicker Element & Enter Date 		
		driver.findElement(By.xpath("//input[@name='my-date']")).sendKeys("2024-08-04");
		Thread.sleep(5000);
	    //Find Submit Button Element & Click
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		Thread.sleep(5000);
		//Close Browser		
		driver.close();
				
				

		}


	}

