import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class PersonasRegistradas {

	HashMap<String, ArrayList<String>> mapDatosPersonas;
	ArrayList<String> listaPersonas;
	
	//Variables:
	String edad;
	int mayorEdad =0, menorEdad=0;
	String opcion;
	
	public PersonasRegistradas() {
		mapDatosPersonas = new HashMap<String, ArrayList<String>>();
	}
	
	public void iniciar() {
		menu();
	}
	
	public void menu() {
	  do {
		  opcion =JOptionPane.showInputDialog("Que deseas hacer? \n"+
		  			"1. Ingresar datos. \n"+
		  			"2. Total de personas \n"+
		  			"3. Cantidad de personas ingresadas. \n"+
		  			"4. Cantidad de personas mayores de edad \n"+
		  			"5. Cantidad de personas menores de edad. \n");
		  
		  switch (opcion) {
		  case "1": ingresoDatos(); menu();
		  case "2":  System.out.println("El total de personas es de: "+ mapDatosPersonas); break;
		  case "3":  int totalPersona = getSizeMap();
				   System.out.println("cantiddad de personas ingresadas: "+totalPersona); break;
		  case "4":  System.out.println("cantidad de personas mayores de edad: "+mayorEdad); break;
		  case "5":  System.out.println("cantidad de personas menores de edad: "+menorEdad); break;
		}
	} while (opcion != "6");
		
	  }
  
	public void ingresoDatos() {
			listaPersonas=new ArrayList<String>();
		
			String documento=JOptionPane.showInputDialog("Ingrese el documento");
		    String nombre=JOptionPane.showInputDialog("Ingrese el nombre del estudiante"); 
		    String profesion=JOptionPane.showInputDialog("Ingrese la profesion");
		    edad = JOptionPane.showInputDialog("Ingrese la edad");
		    
		    listaPersonas.add(documento);
		    listaPersonas.add(nombre);
		    listaPersonas.add(profesion);
		    listaPersonas.add(edad);
		    
		    guardarDatos(listaPersonas);
		    validarEdad(edad);
	}
	
	  public int getSizeMap() {
		  return mapDatosPersonas.size(); 
	  }
	  
	  public HashMap<String, ArrayList<String>> getMapaDatosPersonas(){
		    return mapDatosPersonas;
		  }
	
	  public void guardarDatos(ArrayList<String> listaPersonas) {
			mapDatosPersonas.put(listaPersonas.get(0), listaPersonas); 
			JOptionPane.showInternalMessageDialog(null, "Registro Exitoso");
	  }	
	  
	  public void validarEdad(String edad) {
		  
		  double edadConvertida1=0;
		  edadConvertida1=Double.parseDouble(edad); 
		  
		  if (edadConvertida1 >= 18) {
			mayorEdad=+1;
		}else {
			menorEdad=+1;
		}
		  
	  }
	  
	
}
