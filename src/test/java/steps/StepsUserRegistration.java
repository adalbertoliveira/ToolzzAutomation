package steps;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.UserHomePage;
import pages.UserRegistrationPage;

public class StepsUserRegistration {
	WebDriver driver;

	@Before
	public void before() {

		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Dado("que estou na pagina inicial")
	public void que_estou_na_pagina_inicial() {
		driver.get("https://rafprod.app.toolzz.com.br/login_app");
		driver.manage().window().setSize(new Dimension(945, 1030));
	}

	@Quando("eu preencher todos os dados do {string} e salvar")
	public void eu_preencher_todos_os_dados_e_salvar(String usuario) {
		UserRegistrationPage userRegistrationPage = new UserRegistrationPage(driver);
		userRegistrationPage.userRegistration();
	}

	@Então("o cadastro e realizado com sucesso")
	public void o_cadastro_e_realizado_com_sucesso() {
		UserHomePage userHomePage = new UserHomePage(driver);
		userHomePage.clicarUsuario();
		Assert.assertEquals("Teste Selenium Adalberto", userHomePage.retornarUsuarioLogado());
	}
}
