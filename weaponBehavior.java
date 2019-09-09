//Kayley Smith
public interface weaponBehavior {
	public static void attack(String wb) {
		WeaponSword(wb);
		WeaponKnife(wb);
		WeaponArrow(wb);
		WeaponAxe(wb);
		WeaponNone(wb);
	}
	public static void WeaponKnife(String wb) {
		System.out.println("Slice with knife");
	}
	public static void WeaponArrow(String wb) {
		System.out.println("Draw and loose an arrow");
	}
	public static void WeaponAxe(String wb) {
		System.out.println("Swing an axe");
	}
	public static void WeaponNone(String wb) {
		System.out.println("Oh no! I lost my arrow");
	}
	public static void WeaponSword(String wb) {
		System.out.println("Lunge and strike with sword");
	}


}