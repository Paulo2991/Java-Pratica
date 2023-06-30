package singleton;

public class SingletonLasyHolder {
	public static class InstanciaHolder{
		public static SingletonLasyHolder instancia = new SingletonLasyHolder();
	}

	public SingletonLasyHolder() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static SingletonLasyHolder getInstancia() {
		return InstanciaHolder.instancia;
	}
}
