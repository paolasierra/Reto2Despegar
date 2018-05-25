package stepsDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BuscarTiquetesPpal;
import pages.Excel;

public class BuscarTiquetesSteps {
	private WebDriver driver;
	BuscarTiquetesPpal Principal;
	Excel creaExcel;
	@Before
	
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Principal=new BuscarTiquetesPpal(driver);
	}

	@Given ("El usuario esta en la pagina de Despegar")
	public void ingresarPaginaDespegar() {
		driver.get("https://www.despegar.com.co/");
	}
    @When ("el usuario ingrese a buscar vuelos")
    public void ingresarBusquedaVuelos() {
    	Principal.cerrarEmergente();
    	Principal.Vuelos();  	
    }
    @And ("selecciona origen")
    public void seleccionarOrigen() {
    	Principal.seleccionarOrigen();
    }
    @And ("ingresa destino")
    public void ingresarDestino() {
    	Principal.ingresarDestino();
    }
    @And ("escoge fecha inicio")
    public void escogerFechaInicio() {
    	Principal.fechaInicio();
    }
    @And ("selecciona fecha regreso")
    public void seleccionarFechaRegreso() {
    	Principal.fechaRegreso();
    }
    @And ("escoge numero viajeros")
    public void escogerNumeroViajeros() {
    	Principal.numeroViajeros();
    }
    @And ("da click en boton buscar")
    public void clickenBuscar() {
    	Principal.buscar();
    }
    @And ("el usuario almacena los precios mas baratos en un Excel")
    public void almacenarPreciosExcel() {
    	Principal.crearArchivo();  	
    }
    @Then ("el usuario visualiza en excel el tiquete mas barato resaltado en verde")
    public void visualizarMasBaratoExcel() {
    	
    }
}

