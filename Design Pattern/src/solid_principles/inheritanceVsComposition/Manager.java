package solid_principles.inheritanceVsComposition;

public class Manager {
	
	private int teamSize;
	
	private Employee e;
	
	public Manager(int _teamSize, Employee _e) {
		this.teamSize = _teamSize;
		this.e = _e;
	}

	@Override
	public String toString() {
		System.out.println("Manager [teamSize=" + teamSize + ", e=" + e + "]");
		return "Manager [teamSize=" + teamSize + ", e=" + e + "]";
	}
}
