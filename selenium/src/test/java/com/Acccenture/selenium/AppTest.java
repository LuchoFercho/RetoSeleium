package com.Acccenture.selenium;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("http://www.gmail.com");
		
		WebElement element=driver.findElement(By.xpath("//input[@id='identifierId']"));
		element.sendKeys("luferoas537@gmail.com\n");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		
		WebElement elementpass=driver.findElement(By.xpath("//input[@name='password']"));
		elementpass.sendKeys("feas1206\n");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement redactar = driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		redactar.click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement destinatario= driver.findElement(By.xpath("//textarea[@name='to']"));
		//WebElement destinatario= driver.findElement(By.xpath("//textarea[@id='7i']"));
		
		destinatario.sendKeys("salurobio@hotmail.com");
		
		WebElement subject= driver.findElement(By.xpath("//input[@name='subjectbox']"));
		subject.sendKeys("probando");
		
		WebElement cuerpomensaje = driver.findElement(By.xpath("//div[@itacorner='6,7:1,1,0,0']"));
		cuerpomensaje.sendKeys("Hola");
		
		WebElement enviar = driver.findElement(By.xpath("//*[text()='Send']"));
		enviar.click();
		
		
		
		
		
		
	}
}
