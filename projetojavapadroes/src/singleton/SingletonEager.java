package singleton;

public class SingletonEager {

	private static SingletonEager singletonEager = new SingletonEager();
	
	private SingletonEager() {
		
	}
	
	public static SingletonEager getInstancia() {
		if(singletonEager == null) {
			singletonEager = new SingletonEager();
		}
		return singletonEager;
	}
}
