package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
 

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class BuscarTiquetesPpal {

	WebDriver driver;

	// CONSTRUCTOR
	public BuscarTiquetesPpal(WebDriver driver) {
		this.driver = driver;
	}

	public void esperar(WebDriver driver, int segundos) {
		synchronized (driver) {
			try {
				driver.wait(segundos * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void cerrarEmergente() {
		driver.findElement(By.xpath("/html/body/div[16]/div/div[1]/span")).click();
	}

	public void Vuelos() {
		esperar(driver, 5);
		driver.findElement(By.xpath("/html/body/div[8]/div[2]/div/ul/li[2] ")).click();
	}

	public void seleccionarOrigen() {
		esperar(driver, 5);
		driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div[3]/div[2]/div[1]/div[1]/div/div[1]/div/div/div/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div[3]/div[2]/div[1]/div[1]/div/div[1]/div/div/div/input")).sendKeys("Medellín, Antioquia, Colombia");
		esperar(driver, 5);
		driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div[3]/div[2]/div[1]/div[1]/div/div[1]/div/div/div/input")).sendKeys(Keys.ENTER);
	}

	public void ingresarDestino() {
		esperar(driver, 5);
		driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div[3]/div[2]/div[1]/div[1]/div/div[2]/div/div/div/div/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div[3]/div[2]/div[1]/div[1]/div/div[2]/div/div/div/div/input")).sendKeys("Cartagena de Indias, Bolívar, Colombia");
		esperar(driver, 5);
		driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div[3]/div[2]/div[1]/div[1]/div/div[2]/div/div/div/div/input")).sendKeys(Keys.ENTER);
	}

	public void fechaInicio() {
		esperar(driver, 5);
		driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[2]/i")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[2]/i")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[2]/i")).click();
		esperar(driver, 5);
		driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[5]/div[4]/span[1]")).click();
	}

	public void fechaRegreso() {
		esperar(driver, 5);
		driver.findElement(By.xpath("html/body/div[4]/div/div[4]/div[5]/div[4]/span[29]")).click();
	}

	public void numeroViajeros() {
		esperar(driver, 5);
		driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div[3]/div[2]/div[1]/div[2]/div[2]/div[6]/div[2]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/div/div[1]/div/div[1]/div[2]/div/a[2]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/a")).click();
		esperar(driver, 5);
	}

	public void buscar() {
		driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div[3]/div[2]/div[4]/div/a/em")).click();
	}
	
	public void crearArchivo()
	{
		String nombreArchivo="Precios.xlsx";
		String rutaArchivo= "C:\\Ficheros-Excel\\"+nombreArchivo;
		String hoja="Hoja1";
		
		XSSFWorkbook libro= new XSSFWorkbook();
		XSSFSheet hoja1 = libro.createSheet(hoja);
		//cabecera de la hoja de excel
		String [] header= new String[]{"Precio"};
		
		//contenido de la hoja de excel
		String [][] document= new String [][]{
				{driver.findElement(By.xpath("//div[@class=\"cluster results-cluster-container debug-container cluster-ROUNDTRIP cluster-CLUSTER default with-actions\" and @data-index=0]//p[@class=\"item-fare fare-price\"]//span[@class=\"amount price-amount\"]")).getText()},
				//{"RTP150"},
				{driver.findElement(By.xpath("//div[@class=\"cluster results-cluster-container debug-container cluster-ROUNDTRIP cluster-CLUSTER default with-actions\" and @data-index=1]//p[@class=\"item-fare fare-price\"]//span[@class=\"amount price-amount\"]")).getText()},
				{driver.findElement(By.xpath("//div[@class=\"cluster results-cluster-container debug-container cluster-ROUNDTRIP cluster-CLUSTER default with-actions\" and @data-index=2]//p[@class=\"item-fare fare-price\"]//span[@class=\"amount price-amount\"]")).getText()},
				{driver.findElement(By.xpath("//div[@class=\"cluster results-cluster-container debug-container cluster-ROUNDTRIP cluster-CLUSTER default with-actions\" and @data-index=3]//p[@class=\"item-fare fare-price\"]//span[@class=\"amount price-amount\"]")).getText()},
				{driver.findElement(By.xpath("//div[@class=\"cluster results-cluster-container debug-container cluster-ROUNDTRIP cluster-CLUSTER default with-actions\" and @data-index=4]//p[@class=\"item-fare fare-price\"]//span[@class=\"amount price-amount\"]")).getText()},
				{driver.findElement(By.xpath("//div[@class=\"cluster results-cluster-container debug-container cluster-ROUNDTRIP cluster-CLUSTER default with-actions\" and @data-index=5]//p[@class=\"item-fare fare-price\"]//span[@class=\"amount price-amount\"]")).getText()},
				{driver.findElement(By.xpath("//div[@class=\"cluster results-cluster-container debug-container cluster-ROUNDTRIP cluster-CLUSTER default with-actions\" and @data-index=6]//p[@class=\"item-fare fare-price\"]//span[@class=\"amount price-amount\"]")).getText()}
		};
		
		//generar los datos para el documento
				for (int i = 0; i <= document.length; i++) {
					XSSFRow row=hoja1.createRow(i);//se crea las filas
					for (int j = 0; j <header.length; j++) {
						if (i==0) {//para la cabecera
								XSSFCell cell= row.createCell(j);//se crea las celdas para la cabecera, junto con la posición
								//cell.setCellStyle(style); // se añade el style crea anteriormente 
								cell.setCellValue(header[j]);//se añade el contenido					
						}else{//para el contenido
							XSSFCell cell= row.createCell(j);//se crea las celdas para la contenido, junto con la posición
							cell.setCellValue(document[i-1][j]); //se añade el contenido
						}				
					}
				}
				
				File file;
				file = new File(rutaArchivo);
				try (FileOutputStream fileOuS = new FileOutputStream(file)){						
					if (file.exists()) {// si el archivo existe se elimina
						file.delete();
						System.out.println("Archivo eliminado");
					}
					libro.write(fileOuS);
					fileOuS.flush();
					fileOuS.close();
					System.out.println("Archivo Creado");
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}catch (IOException e) {
					e.printStackTrace();
				}

	}
}
