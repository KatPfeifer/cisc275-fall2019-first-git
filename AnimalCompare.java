package classwork;
import java.util.*;
public class AnimalCompare implements Comparator<Animal>{
	public int compare(Animal a, Animal b) {
		if (a.name.compareTo(b.name)>0) {
			return 1;
		}
		if (a.name.compareTo(b.name)<0) {
			return -1;
		}
		else {
			if (a.legs>b.legs) {
				return 1;
			}
			return -1;
		}
	}
}
