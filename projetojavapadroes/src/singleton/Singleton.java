package singleton;

public class Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonLasy singletonLasy = SingletonLasy.getInstancia();
		System.out.println(singletonLasy);
		singletonLasy = SingletonLasy.getInstancia();
		System.out.println(singletonLasy);
		
		SingletonEager singletonEager = SingletonEager.getInstancia();
		System.out.println(singletonEager);
		singletonEager = SingletonEager.getInstancia();
		System.out.println(singletonEager);
	}

}
