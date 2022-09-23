package Week_12th;

import java.util.ArrayList;
import java.util.List;

interface Animal {
	void sound();
}

class Dog implements Animal {
	public void sound() {
		System.out.println("¸Û¸Û~~");
	}
}

class Cuckoo implements Animal {
	public void sound() {
		System.out.println("»µ²Ú»µ²Ú~~");
	}
}

public class AnimalSoundTest {
	public static void printSound(List<? extends Animal> lists) {
		for (Animal a : lists)
			a.sound();
	}

	public static void main(String[] args) {
		List<Animal> lists = new ArrayList<>();
		lists.add(new Dog());
		lists.add(new Cuckoo());
		printSound(lists);
	}
}