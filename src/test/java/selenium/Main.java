package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriverLinux");
		WebDriver driver = new ChromeDriver();
		
		try {
			driver.get("http://localhost:8080/");
			Thread.sleep(1000);
			driver.findElement(By.id("username")).sendKeys("Admin");
			Thread.sleep(1000);
			driver.findElement(By.id("password")).sendKeys("1234");
			Thread.sleep(1000);
			driver.findElement(By.id("btnLogin")).click();
			Thread.sleep(1000);
			driver.findElement(By.className("three")).click();
			Thread.sleep(1000);
			driver.findElement(By.className("continuar")).click();
			Thread.sleep(1000);
			driver.findElement(By.className("two")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("cantidadCamiseta")).click();
			driver.findElement(By.id("cantidadCamiseta")).sendKeys("2");
			Thread.sleep(1000);
			driver.findElement(By.id("cantidadPantalon")).click();
			driver.findElement(By.id("cantidadPantalon")).sendKeys("1");
			Thread.sleep(1000);
			driver.findElement(By.className("boton")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("envio")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("btnResumen")).click();
			Thread.sleep(1000);
			driver.findElement(By.className("continuar")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("salir")).click();
			Thread.sleep(1000);


		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
	}
	
	

}
