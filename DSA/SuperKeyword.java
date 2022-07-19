class Parent{
	void value() {
		System.out.println("this is super class method");
	}
}

class Child extends Parent{
	void value() {
		super.value();
		System.out.println("This is a sub class method");
	}
}

public class SuperKeyword {

	public static void main(String[] args) {

		Child ch = new Child();
		ch.value();
		
	}

}
