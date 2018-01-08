package abstract_classes.farm;

import java.util.ArrayList;

public class Farm {
	public static void main(String [] args) {
		ArrayList<Animal> farm = new ArrayList<Animal>();
		Horse horse = new Horse();
		Dog dog = new Dog();
		lamb lamb = new lamb();
		Goat goat = new Goat();
		farm.add(goat);
		farm.add(horse);
		farm.add(lamb);
		farm.add(dog);
		farm.add(new lamb());
		farm.add(new Dog());
		for (int i = 0; i < farm.size(); i++) {
			farm.get(i).makeNoise();
			farm.get(i).dumb();
		}
		
	}
}
