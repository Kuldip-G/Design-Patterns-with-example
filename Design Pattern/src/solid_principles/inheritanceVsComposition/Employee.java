package solid_principles.inheritanceVsComposition;

public class Employee {
 
	private int eid;
	
	private Person p;
	
	public Employee(int _eid, Person _p) {
		this.eid = _eid;
		this.p = _p;
	}

	@Override
	public String toString() {
		System.out.println("Employee [eid=" + eid + ", p=" + p + "]");
		return "Employee [eid=" + eid + ", p=" + p + "]";
	}
	
	
}
