package csce247.assignments.factory;

public abstract class ToyStore {
	public abstract Toy createToy(String type);
	
	public Toy orderToy(String type) {
		Toy toy = createToy(type);
		
		toy.assemble();
		toy.boxToy();
		toy.priceToy();
		
		return toy;
	}
}
