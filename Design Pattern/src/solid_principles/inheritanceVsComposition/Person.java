package solid_principles.inheritanceVsComposition;

public class Person {

	private String name;
	
	private int age;
	
	public Person(String _name, int _age) {
		this.name = _name;
		this.age = _age;
	}
	
	@Override
	public String toString() {
		System.out.println("Person name:"+ name + "Person age:"+age);
		return "";
	}
}
