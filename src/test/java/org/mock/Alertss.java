package org.mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;

public class Alertss {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		WebElement cl = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		cl.click();
		WebElement clc = driver.findElement(By.xpath("(//button[contains(text(),'click the button')][3]"));
		clc.click();
		Alert a = driver.switchTo().alert();
		a.sendKeys("Welcome");
		a.accept();

	}

}
