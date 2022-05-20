package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class UserHomePage {

	WebDriver driver;
	
	final String TEXTO_NOME = "/html/body/div[1]/div/nav[1]/div[6]/div[9]/div/div[1]/div/span";
	
	public UserHomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void clicarUsuario() {

		driver.findElement(By.id("navbarDropdown")).click();

	}

	public String retornarUsuarioLogado() {

		return driver.findElement(By.xpath(TEXTO_NOME)).getText();

	}

}
