package dao;

import java.util.ArrayList;
import java.util.List;

public class DogDao {

	static List<Dog> dogs = new ArrayList<>(List.of(new Dog("Duke"), new Dog("Duchess"), new Dog("Yoshi"), new Dog("Foxy")));

	public List<Dog> getDogs() {
		return dogs;
	}

}
