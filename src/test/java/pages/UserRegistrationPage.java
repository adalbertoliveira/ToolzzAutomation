package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.github.javafaker.Faker;

public class UserRegistrationPage {

	WebDriver driver;

	Faker faker = new Faker();

	final String OPCAO_1 = "//*[@id=\"tipoAlternativa462\"]/div/label/span";
	final String OPCAO_2 = "//*[@id=\"tipoAlternativa466\"]/div/label/span";
	final String BUTTON_REGISTER = "//*[@id=\"btnConfirmarCadastro\"]";
	final String ACEITE = "/html/body/div[1]/div/main/div/div[3]/form/div/div[1]/div/label";
	final String ENVIAR = "/html/body/div[1]/div/main/div/div[3]/form/div/div[2]/button";

	String emailFaker = faker.internet().emailAddress();

	public UserRegistrationPage(WebDriver driver) {

		this.driver = driver;
	}

	public void userRegistration() {

		driver.findElement(By.linkText("CADASTRE-SE")).click();
		driver.findElement(By.id("email")).sendKeys(emailFaker);
		driver.findElement(By.id("cpf")).sendKeys("246.870.700-19");
		driver.findElement(By.id("name")).sendKeys("Teste Selenium Adalberto");
		driver.findElement(By.id("data_nascimento")).sendKeys("24/04/1990");
		driver.findElement(By.id("password")).sendKeys("mad321654");
		driver.findElement(By.id("password-confirm")).sendKeys("mad321654");
		driver.findElement(By.id("telefone")).sendKeys("88996514587");
		driver.findElement(By.id("btnContinuar")).click();
		driver.findElement(By.id("btnContinuar")).click();
		driver.findElement(By.id("numero")).sendKeys("45");
		driver.findElement(By.id("cep")).sendKeys("58066-123");
		driver.findElement(By.id("nome_mae")).sendKeys("Mae Teste");
		driver.findElement(By.id("btnContinuar")).click();
		driver.findElement(By.id("alternativa44346")).click();
		driver.findElement(By.id("alternativa44346")).sendKeys("Teste");
		driver.findElement(By.id("alternativa44347")).sendKeys(Keys.TAB);
		driver.findElement(By.id("alternativa44347")).sendKeys("Teste teste teste teste teste");
		{
			WebElement element = driver.findElement(By.xpath(OPCAO_1));
			Actions builder = new Actions(driver);
			builder.doubleClick(element).perform();
		}
		driver.findElement(By.xpath(OPCAO_2)).click();
		driver.findElement(By.xpath(BUTTON_REGISTER)).submit();
		driver.findElement(By.xpath(ACEITE)).click();
		driver.findElement(By.xpath(ENVIAR)).click();

	}
}
