package singleton;

public class SingletonLasy {
	private static SingletonLasy instancia;
	
	private SingletonLasy() {
		
	}
	
	public static SingletonLasy getInstancia() {
		if(instancia == null) {
			instancia = new SingletonLasy();
		}
		return instancia;
	}
}
