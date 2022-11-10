package stock;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("gestionA")
public class gestionAlmacen {

	//Inyeccion de dependencias
	@Autowired
	repoProducto1 repo1;
	@Autowired
	repoProducto2 repo2;
	
	public void insertarProducto1(producto1 producto) {
		repo1.insertar(producto);
	}
	
	
	public void insertarProducto2(producto2 producto) {
		repo2.insertar(producto);
	}
	
	public List<producto1> listarTodosProductos1(){
		
		return repo1.listarTodos();	
	}
	
	public List<producto2> listarTodosProductos2(){
		
		return repo2.listarTodos();	
	}
	
}
