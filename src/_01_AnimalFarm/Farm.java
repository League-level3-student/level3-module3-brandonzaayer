package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
	public static void main(String[] args) {
		ArrayList<Animal> farm = new ArrayList<Animal>();
		Cow cow = new Cow();
		Pig pig1 = new Pig();
		Pig pig2 = new Pig();
		Chicken chicken1 = new Chicken();
		Chicken chicken2 = new Chicken();
		Horse horse = new Horse();
		farm.add(cow);
		farm.add(pig1);
		farm.add(pig2);
		farm.add(chicken1);
		farm.add(chicken2);
		farm.add(horse);
		for(int i = 0; i < farm.size(); i++) {
			farm.get(i).makeNoise();
			farm.get(i).numOfLegs();
		}
	}
}