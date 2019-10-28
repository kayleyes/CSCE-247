package csce247.assignments.command;

public class FireCommand implements Command {
	private Player fire;
	
	//implements command to have player fire weapn
	public FireCommand(Player fire) {
		this.fire = fire;
	}
	
	@Override
	public void execute() {
		fire.fire();
	}
}
