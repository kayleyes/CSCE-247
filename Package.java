package csce247.assignments.state;

public class Package {
	private State orderedState;
	private State inTransitState;
	private State deliveredState;
	public String name;
	
	private State state;
	String conents = null;
	
	public Package(String contents) {
		orderedState = new OrderedState(this);
		inTransitState = new InTransitState(this);
		deliveredState = new DeliveredState(this);
		
		this.name = contents;
		
		if(contents != null ) {
			state = orderedState;
	
		} else {
			state = deliveredState;
		}
	}
	
	public void order() {
		((Package) state).order();
	}
	
	public void mail() {
		((Package) state).mail();
	}
	
	public void received() {
		((Package) state).received();
	}
	
	public static void setState(State state) {
		state = state;
	}
	
	public void getName(String name) {
		name = this.name;
	}

}
