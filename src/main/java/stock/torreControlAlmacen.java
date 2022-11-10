package stock;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class torreControlAlmacen {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		//Inversion de Control
		gestionAlmacen gestor = (gestionAlmacen) context.getBean("gestionA");
		System.out.println(gestor.listarTodosProductos1().get(0).getNombre());
		System.out.println(gestor.listarTodosProductos2().get(0).getNombre());
	}

}
