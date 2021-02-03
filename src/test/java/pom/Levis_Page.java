package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Levis_Page extends Base{

	public Levis_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
		// Lista de localizadores usados
		By BotonM=By.cssSelector("#cat-sale > a");
		// Categorias
		By Bermudas= By.cssSelector("#cat-1603 > a");
		By Pantalones= By.cssSelector("#cat-1604 > a");
		By RemerasPolo= By.cssSelector("#cat-1605 > a");
		By Camisas= By.cssSelector("#cat-1601 > ol > li:nth-child(5) > a");
		By buscar=By.cssSelector("#search");
		
		//Steps de la prueba
		public void click_on_category () {
			type("pantalon",buscar);
			Visit("https://www.levi.com.ar/e-shop/hombres/categorias.html");
			click(Camisas);
			click(Pantalones);
			

		}

}
