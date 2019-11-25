package csce247.assignments.state;

public class InTransitState implements State {
private Package pkg;
	
	public InTransitState(Package pkg) {
		this.pkg = pkg;
	}
	
	//@Override
	public State InTransitState() {
		System.out.println(pkg + "is in transit.");
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
