package _01_AnimalFarm;

abstract class Animal {
	abstract void makeNoise();
	public int numOfLegs() {
		return -1;
	}
	class cow extends Animal {

		@Override
		void makeNoise() {
			// TODO Auto-generated method stub
			
		}
		public int numOfLegs() {
			return 4;
		}
		
		
	}
	class pig extends Animal{

		@Override
		void makeNoise() {
			// TODO Auto-generated method stub
			
		}
		public int numOfLegs() {
			return 4;
		}
		
	}
	class horse extends Animal{

		@Override
		void makeNoise() {
			// TODO Auto-generated method stub
			
		}
		public int numOfLegs() {
			return 4;
		}
		
	}
	class chicken extends Animal{

		@Override
		void makeNoise() {
			// TODO Auto-generated method stub
			
		}
		public int numOfLegs() {
			return 2;
		}
		
	}
}
