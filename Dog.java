package classwork;
import java.util.*;
public class Dog extends Animal implements Comparable<Dog>{
	public Dog(String name, int legs) {
		super(name, legs);
	}
	public String toString() {
		return name;
	}
	
	public int compareTo(Dog a) {
		if (this.legs>a.legs) {
			return 1;
		}
		if (this.legs<a.legs) {
			return -1;
		}
		else 
			if (this.name.compareTo(a.name)>0) {
				return 1;
			}
			else {
				return -1;
			}
	}
	
	public static void main(String[] args) {
		List<Dog> dogs= new ArrayList();
		dogs.add(new Dog("Andie", 3));
		dogs.add(new Dog("Penny", 4));
		dogs.add(new Dog("Andie", 5));
		
		for (Dog d: dogs) {
			System.out.println(d.name + ", "+ d.legs);
		}
		System.out.println();
		Collections.sort(dogs, new AnimalCompare());
		for (Dog d: dogs) {
			System.out.println(d.name + ", "+ d.legs);
		}
		System.out.println();
		Collections.sort(dogs);
		for (Dog d: dogs) {
			System.out.println(d.name + ", "+ d.legs);
		}
	}
}
