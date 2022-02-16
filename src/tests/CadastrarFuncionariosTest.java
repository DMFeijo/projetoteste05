package tests;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class CadastrarFuncionariosTest {

	WebDriver driver;

	@Dado("^Acessar a pagina de cadastro de funcionario$")
	public void acessar_a_pagina_de_cadastro_de_funcionario() {

		// definindo o local onde esta o driver do google chrome
		System.setProperty("webdriver.chrome.driver", "c:\\teste\\chromedriver.exe");

		// Abrindo o google chrome
		driver = new ChromeDriver();

		// Maximizando a janela do navegador
		driver.manage().window().maximize();

		// Acessando a pagina de cadastro de funcionario
		driver.get("http://exercteste01-001-site1.gtempurl.com/Home/Exercicio01");

	}

	@Dado("^informar o nome do funcionario \"([^\"]*)\"$")
	public void informar_o_nome_do_funcionario(String nome) {

		driver.findElement(By.xpath("//*[@id=\"Nome\"]")).sendKeys(nome);

	}

	@Dado("^informar o cpf do funcionario \"([^\"]*)\"$")
	public void informar_o_cpf_do_funcionario(String cpf) {

		driver.findElement(By.xpath("//*[@id=\"CPF\"]")).sendKeys(cpf);

	}

	@Dado("^informar a data de admisão do funcionario \"([^\"]*)\"$")
	public void informar_a_data_de_admisão_do_funcionario(String dataAdmissão) {

		driver.findElement(By.xpath("//*[@id=\"DataAdmissao\"]")).sendKeys(dataAdmissão);

	}

	@Dado("^informar o resumo de atividades do funcionario \"([^\"]*)\"$")
	public void informar_o_resumo_de_atividades_do_funcionario(String ResumoAtividades) {

		driver.findElement(By.xpath("//*[@id=\"ResumoAtividades\"]")).sendKeys(ResumoAtividades);

	}

	@Quando("^Solicitar a realizacão do cadastro do funcionario$")
	public void silicitar_a_realizacão_do_cadastro_do_funcionario() {

		driver.findElement(By.xpath("//*[@id=\"btnCadastro\"]")).click();
	}

	@Então("^sistema exibe mensagem \"([^\"]*)\"$")
	public void sistema_exibe_mensagem(String resultado) {

		// ler a mensagem exibida na tela do sistema
		String mensagem = driver.findElement(By.xpath("//*[@id=\"mensagem\"]")).getText();

		// comparando a mensagem obitida com o resultado esperado na feature
		assertEquals(mensagem, resultado);

		// Gerar a evidencia do teste
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(file, new File("c:\\evidencias\\cadastrarfuncionariocomsucesoo.png"));
		} catch (Exception e) {

		}

		// fechar o navegador
		driver.close();
		driver.quit();

	}

	@Então("^Sistema informa que cada campo e de preenchimento obrigatorio$")
	public void sistema_informa_que_cada_campo_e_de_preenchimento_obrigatorio() {

		// ler a mensagem de erro exibida em cada campo
		String erroNome = driver.findElement(By.xpath("/html/body/div/div[2]/form/div/div[1]/div[1]/span")).getText();
		String erroCpf = driver.findElement(By.xpath("/html/body/div/div[2]/form/div/div[1]/div[2]/span")).getText();
		String erroDataAdmisao = driver.findElement(By.xpath("/html/body/div/div[2]/form/div/div[2]/div[1]/span"))
				.getText();
		String erroResumoAtividades = driver.findElement(By.xpath("/html/body/div/div[2]/form/div/div[2]/div[2]/span"))
				.getText();

		// comparar o conteudo de cada mensagem
		assertEquals(erroNome, "Informe o nome do funcionário.");
		assertEquals(erroCpf, "Informe o cpf do funcionário.");
		assertEquals(erroDataAdmisao, "Informe a data de admissão do funcionário.");
		assertEquals(erroResumoAtividades, "Informe o resumo de atividades do funcionário");

		// Gerar a evidencia do teste
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(file, new File("c:\\evidencias\\cadastrarfuncionariocomsucesoo.png"));
		} catch (Exception e) {

		}

		// fechar o navegador
		driver.close();
		driver.quit();

	}

}
