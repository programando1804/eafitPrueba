package co.com.eafit.pageobject;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;

import org.apache.tools.ant.filters.TokenFilter.ContainsString;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class LoginPage extends PageObject {
	@FindBy(xpath = "//*[@id=\"login\"]/form/input[1]")
	public WebElementFacade txtUsuario;
	
	@FindBy(xpath = "//*[@id=\"login\"]/form/input[2]")
	public WebElementFacade txtPassword;
	
	@FindBy(xpath = "//*[@id=\"login\"]/form/button")
	public WebElementFacade btnButton;
	
	@FindBy(id = "//*[@id=\"container\"]/form/h2")
	public WebElementFacade lbltitulo;

	public void RealizarLogin(String user, String pass) {
		// TODO Auto-generated method stub
	
		txtUsuario.sendKeys(user);
		txtPassword.sendKeys(pass);
		Serenity.takeScreenshot();//tomar foto 
		btnButton.click();
		
	}

	public void AccesoExitoso(String tituloPagina) {
		// TODO Auto-generated method stub
		String strMensaje = lbltitulo.getText();
		assertThat(strMensaje, containsString(tituloPagina));
	}

	
}
