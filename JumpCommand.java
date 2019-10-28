package csce247.assignments.command;

public class JumpCommand implements Command {
	private Player jump;
	
	//implements command to have player jump
	public JumpCommand(Player jump) {
		this.jump = jump;
	}
	
	@Override
	public void execute() {
		jump.jump();
	}
	
}
