//Kayley Smith
public class Queen extends Character {
	public Queen(String name) {
		super(name);
		this.name = name;
	}
	
	@Override
	public void display () {
		super.display();
		System.out.println(name + " is a beautiful Queen!");
	}
	@Override
	public void attack() {
		weaponBehavior.WeaponKnife();
	}

}
