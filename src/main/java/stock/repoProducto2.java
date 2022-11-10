package stock;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class repoProducto2 {

	
	private static List<producto2> productos2 = new ArrayList<producto2>();
	static {
		
		productos2.add(new producto2("teclado1", 20));
		productos2.add(new producto2("teclado2", 35));
		productos2.add(new producto2("teclado3", 65));
		
	}
	
	public List<producto2> listarTodos(){
		
		return productos2;
		
	}
	
	public void insertar(producto2 producto2) {
		
		productos2.add(producto2);
	}
}
