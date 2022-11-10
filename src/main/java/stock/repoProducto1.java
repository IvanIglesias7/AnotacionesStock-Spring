package stock;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class repoProducto1 {
 
	private static List<producto1> productos1 = new ArrayList<producto1>();
	static {
		
		productos1.add(new producto1("ordenador1", 200));
		productos1.add(new producto1("ordenador2", 350));
		productos1.add(new producto1("ordenador3", 652));
		
	}
	
	public List<producto1> listarTodos(){
		
		return productos1;
		
	}
	
	public void insertar(producto1 producto1) {
		
		productos1.add(producto1);
	}
	
}
