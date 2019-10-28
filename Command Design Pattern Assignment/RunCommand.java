package csce247.assignments.command;

public class RunCommand implements Command {
	private Player run;
	
	//implements command to have player run forward
	public RunCommand(Player run) {
		this.run = run;
	}
	
	@Override
	public void execute() {
		run.runForward();
	}
}
