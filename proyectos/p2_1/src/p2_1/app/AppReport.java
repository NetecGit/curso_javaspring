package p2_1.app;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AppReport {
	
	// Declare un Map de nombre itemCountMap para mapear de códigos a cantidad
	
	
	// Declare un Map de nombre productNames para mapear de código a la descripción
   
    
    // Lista de códigos
    private static String[] items = new String[]{
    	"DM001", "CD001", "CD001", "CD001", "CD001",
    	"AAA01", "AAA01", "AAA01", "AAA01", "AAA01", 
    	"AAA02", "AAA02", "AAA02", "GKU01", "GKU01", 
    	"AAA02", "AAA01", "AAA01", "GKU01", "GKU01",
        "GKU01", "AAA02", "AAA02", "DM001", "DM001", 
         };
    
    // Inicialice el itemCountMap
    static {
    
    }

    // Agregue un constructor que reciba un Map Genérico como parámetro
   
    
    public static void main(String[] args) {

        // Descripciones - Códigos
        Map<String, String> productNames = new TreeMap<>();
        productNames.put("Nike", "AAA01");
        productNames.put("Crocs", "AAA02");
        productNames.put("Charly", "GKU01");
        productNames.put("Balance", "DM001");
        productNames.put("Merrell", "CD001");

        // Crea un objeto de AppRepor pasando los nombre de los productos
        AppReport appReport;
        
        // Procesa la lista de productos
        appReport.process(items);
        
        // Genera el reporte de ventas
        appReport.report();
    }

    // Método que procesa la lista de productos y genera el mapa con los conteos
    public void process(String[] list) {
       
    }

    // Método para generar el reporte con las descripciones y el conteo
    public void report() {
      
    }
	 
}
