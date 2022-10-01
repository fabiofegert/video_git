package metodos;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	WebDriver driver;

	public void abrirNavegador() {
		String url = "https://react-shopping-cart-67954.firebaseapp.com";
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.err.println("erro ao clicar");
			System.out.println(e.getCause());
			System.out.println(e.getMessage());

		}
	}
	public void pausa(int tempo)
	{try {
		Thread.sleep(tempo);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	
	}
	public void validarAlert(String msgEsperada) {
		try {
		Alert alert = driver.switchTo().alert();
		String msgCheckout = alert.getText();
		assertTrue(msgCheckout.contains(msgEsperada));
		}catch(Exception e) {
			System.err.println("erro ao clicar");
			System.out.println(e.getCause());
			System.out.println(e.getMessage());

		}
		
}public void fecharNavegador() {
 try {
	driver.quit();
} catch (Exception e) {
	System.err.println("erro ao fechar");
}
}
	
}
