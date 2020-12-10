package _01_AnimalFarm;

abstract class Animal {
	abstract void makeNoise();

	public int numOfLegs() {
		return -1;
	}
}

class Cow extends Animal {

	@Override
	void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("moo");
	}

	public int numOfLegs() {
		System.out.println(4);
		return 4;
	}

}

class Pig extends Animal {

	@Override
	void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("oink");
	}

	public int numOfLegs() {
		System.out.println(4);
		return 4;
	}

}

class Horse extends Animal {

	@Override
	void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("neigh");
	}

	public int numOfLegs() {
		System.out.println(4);
		return 4;
	}

}

class Chicken extends Animal {

	@Override
	void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("cluck");
	}

	public int numOfLegs() {
		System.out.println(2);
		return 2;
	}

}
