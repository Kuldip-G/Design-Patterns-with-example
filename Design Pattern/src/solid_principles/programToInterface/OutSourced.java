package solid_principles.programToInterface;

public class OutSourced extends Company {
	
	@Override
	public Employee getEmployee() {
		// check employess in house and outsources and ask to do work.
		
		Employee two = new Designer();
		
		return two;
	}

}
