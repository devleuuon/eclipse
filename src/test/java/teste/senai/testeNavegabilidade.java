package teste.senai;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class testeNavegabilidade {

	ChromeDriver driver;

	// pré teste
	@Before
	public void preteste() {
		System.setProperty("webdriver.chromedriver", "C:\\Users\\Lennon Fonseca\\OneDrive\\Documentos\\chromedriver");
		this.driver = new ChromeDriver();

		// maximizar navegador
		driver.manage().window().maximize();

		// ir até site do senai
		driver.get("https://informatica.sp.senai.br/");

	}

	// teste
	@Test
	public void teste() {
		driver.findElement(By.id("busca1_txtfiltro")).sendKeys("excel");
		//driver.findElement(By.id("busca1_btnbusca")).click();
		driver.findElement(By.id("busca1_txtfiltro")).sendKeys(Keys.ENTER);
	}

	// pós teste
	@After
	public void posteste() {

	}
}
