import javax.swing.JOptionPane;

public class DescuentosEmpleados {

	String estrato, nombre;
	Double sueldo;
	public void main(String arg[]) {
		ingresarDatos();
		
	
	}
	
	public void ingresarDatos(){
		do {
			nombre = JOptionPane.showInputDialog("Ingrese el nombre");
			sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo"));
			estrato = JOptionPane.showInputDialog("ingrese el estraro");	
			
			proceso(estrato);
			
		} while (estrato !="7");
		
	
	}
	
	public void proceso(String estrato) {
		Double descuentoPorcentaje = null;
		
		switch (estrato) {
		case "1":
		case "2": descuentoPorcentaje = 0.2; break;
		
		case "3":
		case "4": descuentoPorcentaje = 0.4; break;
		case "5": descuentoPorcentaje = 0.8; break;
		case "6": descuentoPorcentaje = 0.1; break;
		}
		
		Double totalDescuento = sueldo * descuentoPorcentaje;
		Double totalPagar = sueldo - totalDescuento;
		System.out.println("El descuento es de: "+totalDescuento);
		System.out.println("El monto final a pagar es de: "+totalPagar);
		
	}
}

