
public class Compra {

	private String Cantidad;
	private String Precio;
	
	public Compra(String Cantidad, String Precio){
		
		this.Cantidad = Cantidad;
		this.Precio = Precio;
	}

	public String getCantidad() {
		return Cantidad;
	}
	public void setCantidad(String cantidad) {
		Cantidad = cantidad;
	}
	public String getPrecio() {
		return Precio;
	}
	public void setPrecio(String precio) {
		Precio = precio;
	}
	
}
