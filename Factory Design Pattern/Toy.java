package csce247.assignments.factory;

public class Toy {
	protected String name;
	public String getName() {
		return name;
	}
	public void assemble () {
		System.out.println("Assembling " + name);
	}
	public void boxToy() {
		System.out.println("Boxing " + name);
	}
	public void priceToy() {
		System.out.println("Pricing " + name);
	}
}
