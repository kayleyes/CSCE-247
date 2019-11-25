package csce247.assignments.state;

public class OrderedState implements State {
	private Package pkg;
	
	public OrderedState(Package pkg) {
		this.pkg = pkg;
	}
	
	//@Override
	public State OrderedState() {
		System.out.println(pkg + "was ordered");
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
