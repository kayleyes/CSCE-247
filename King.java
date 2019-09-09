//Kayley Smith
public class King extends Character {

	public King(String Name) {
		super(Name);
	}

	@Override
	public void display() {
		super.display();
		System.out.println(name + " is a Noble King.");
	}
	
	@Override
	public void attack() {
		weaponBehavior.WeaponSword();
	}
}
