package csce247.assignments.state;

public class DeliveredState implements State {
private Package pkg;
	
	public DeliveredState(Package pkg) {
		this.pkg = pkg;
	}
	
	//@Override
	public State DeliveredState() {
		System.out.println(pkg + "was delivered.");
		Package.setState((State) pkg);
		return null;
	}

	@Override
	public State displayStatus() {
		return null;	
	}

	@Override
	public State displayETA() {
		return null;
		
	}
}
