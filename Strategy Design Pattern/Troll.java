//Kayley Smith
public class Troll extends Character {
	public Troll (String name) {
		super(name);
		this.name = name;		
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println(name + " is a funny troll!");
	}
	
	@Override
	public void attack() {
		weaponBehavior.WeaponAxe();
	}
}
