package stock;

//Entidad producto 2 
public class producto2 {


	//CONSTRUCTORES
	public producto2(String nombre, int precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public producto2() {}
	
	
	//ATRIBUTOS(SIEMPRE PRIVADO)
		private String nombre;
		private int precio;
		
	//GET AND SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
}
