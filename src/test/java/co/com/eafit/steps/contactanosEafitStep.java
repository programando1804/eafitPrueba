package co.com.eafit.steps;

import co.com.eafit.pageobject.contactanosEafitPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;

public class contactanosEafitStep {
	
contactanosEafitPage ContactanosEafitPage;

@Step
public void AbrirPagina() {
	// TODO Auto-generated method stub
	ContactanosEafitPage.open();
}

@Step
public void diligenciarComentario(DataTable dtDatos) {
	// TODO Auto-generated method stub
	ContactanosEafitPage.nuevoComentario(dtDatos);
}

public void mensajeComentarioExitoso(String mensajeExitoso) {
	// TODO Auto-generated method stub
	ContactanosEafitPage.mensajeExitoso(mensajeExitoso);
}

}
