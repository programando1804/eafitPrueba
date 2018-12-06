package co.com.eafit.pageobject;


import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

import java.util.List;

import cucumber.api.DataTable;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.Serenity;


@DefaultUrl("http://www.eafit.edu.co/institucional/contacto/Paginas/contacto-eafit.aspx")
public class contactanosEafitPage extends PageObject{
	@FindBy(id = "Field1")
	public WebElementFacade txtNombre ;
	
	@FindBy(id = "Field3")
	public WebElementFacade txtCorreo ;
	
	@FindBy(id = "Field4")
	public WebElementFacade txTelefono ;
	
	@FindBy(id = "Field5")
	public WebElementFacade txtCiudad ;
	
	@FindBy(id = "Field6")
	public WebElementFacade txtComentario ;
	
	@FindBy(id = "saveForm")
	public WebElementFacade btnEnviar ;
	
	@FindBy(xpath = "//*[@id=\"container\"]/form/h2")
	public WebElementFacade mensaje;
	
	
	
	public void nuevoComentario(DataTable dtDatos) {
		// TODO Auto-generated method stub
		List<List<String>> date = dtDatos.raw();
		getDriver().switchTo().frame(0);
		txtNombre.sendKeys(date.get(1).get(1));
		txtCorreo.sendKeys(date.get(1).get(2));
		txTelefono.sendKeys(date.get(1).get(3));
		txtCiudad.sendKeys(date.get(1).get(4));
		txtComentario.sendKeys(date.get(1).get(5));
		txtNombre.click();
		
	}

	public void mensajeExitoso(String mensajeExitoso) {
		// TODO Auto-generated method stub
		String txtmensaje = mensaje.getText();
		assertThat(txtmensaje, containsString(mensajeExitoso));				
	}


}
