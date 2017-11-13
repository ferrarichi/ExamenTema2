import java.io.Serializable;
import java.util.ArrayList;

public class Accion implements Serializable {

	private String nombre;
	ArrayList<String> operaciones = null;
	ArrayList<String> compras = null;
	ArrayList<Compra> compra = null;
	ArrayList<Venta> venta = null;
	
	
	public Accion(String nom, ArrayList<String> ope, ArrayList<String> comps , ArrayList<Compra> comp, ArrayList<Venta> vent){
		
		nom = nombre;
		ope = operaciones;
		comps = compras;
		comp = compra;
		vent = venta;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<String> getOperaciones() {
		return operaciones;
	}
	public void setOperaciones(ArrayList<String> operaciones) {
		this.operaciones = operaciones;
	}
	public ArrayList<String> getCompras() {
		return compras;
	}
	public void setCompras(ArrayList<String> compras) {
		this.compras = compras;
	}
	public ArrayList<Compra> getCompra() {
		return compra;
	}
	public void setCompra(ArrayList<Compra> compra) {
		this.compra = compra;
	}
	
	public void imprimir() {
		String datos = "";
		datos += ("Nombre: " + this.nombre + "\n");
		for (int i=0; i<operaciones.size(); i++) {
			datos += ("Operacion nº" + (i+1) + "\n");
			
			for (int x=0; i<compras.size(); x++) {
				datos += ("Compra nº" + (x+1) + "\n");
				
				for (int y=0; y<compra.size(); y++) {
					datos += ("Cantidad: " + (y+1) + this.compra.get(y).getCantidad() +  "\n");	
			}
				for (int z=0; z<compra.size(); z++) {
					datos += ("Precio: " + (z+1) + this.compra.get(z).getPrecio() +  "\n");	
			}
		}
			for (int p=0; p<venta.size(); p++) {
				datos += ("Compra nº" + (p+1) + "\n");
				
				for (int q=0; q<venta.size(); q++) {
					datos += ("Cantidad: " + (q+1) + this.venta.get(q).getCantidad() +  "\n");	
			}
				for (int v=0; v<venta.size(); v++) {
					datos += ("Precio: " + (v+1) + this.venta.get(v).getPrecio() +  "\n");	
			}
		}
		datos += ("----------------------------------------");
		
		System.out.println(datos);
	}
	
}
}
