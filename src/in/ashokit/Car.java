package in.ashokit;

public class Car extends Engine{
	public void drive() {
		Engine eng = new Engine(); // It is example for Composition
		int status = eng.start();
		if(status >=1) {
			
			System.out.println("Journey Started...");
			
		}else {
			System.out.println("Engine Having Some Problem...");
		}
		
	}
}
