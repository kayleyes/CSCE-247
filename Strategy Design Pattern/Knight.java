//Kayley Smith
public class Knight extends Character {
	public Knight(String name) {
		super(name);
		this.name = name;
	}
	
	@Override
	public void display () {
		super.display();
		System.out.println(name + " is a valiant knight!");
	}
	
	@Override
	public void attack () {
		weaponBehavior.WeaponArrow();
	}
}
