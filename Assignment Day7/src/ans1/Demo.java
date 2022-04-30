package ans1;

public class Demo {
	public Animal[] getAnimals(){
		Animal[] a= {new Dog(),new Cat(),new Tiger()};
		return a;
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		for (Animal animal : d.getAnimals()) {
			animal.makeNoise();
		}
	}
}
