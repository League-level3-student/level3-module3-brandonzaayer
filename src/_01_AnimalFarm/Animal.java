package _01_AnimalFarm;

abstract class Animal {
	abstract void makeNoise();
	public int numOfLegs() {
		return -1;
	}
	public class cow extends Animal {

		@Override
		void makeNoise() {
			// TODO Auto-generated method stub
			
		}
		public int numOfLegs() {
			return 4;
		}
		
		
	}
	public class pig extends Animal{

		@Override
		void makeNoise() {
			// TODO Auto-generated method stub
			
		}
		public int numOfLegs() {
			return 4;
		}
		
	}
	public class horse extends Animal{

		@Override
		void makeNoise() {
			// TODO Auto-generated method stub
			
		}
		public int numOfLegs() {
			return 4;
		}
		
	}
	public class chicken extends Animal{

		@Override
		void makeNoise() {
			// TODO Auto-generated method stub
			
		}
		public int numOfLegs() {
			return 2;
		}
		
	}
}
