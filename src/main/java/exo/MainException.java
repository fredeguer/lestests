package exo;

import java.lang.reflect.Method;

public class MainException {

	public static void main(String[] args) {
		
		Method[] method = Exception.class.getMethods();

		for (Method m : method) {
			System.out.println(m.getName());
			
		}
		

	}

}
