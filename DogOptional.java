package sort;

import java.util.NoSuchElementException;
import java.util.Optional;


import dao.Dog;

public class DogOptional {
		
	public static void main (String[] args) {
		dogB();
	}
	//3a, 3b, 3e
	//this is a method definition - method is named dogA
	public static Dog dogA (Optional<Dog> optionalDog) { 
		return optionalDog.orElseThrow(() -> new NoSuchElementException("There is no dog."));//this unwraps
	}
	// this is a method definition - method is named dogB
	//3c, 3d
	public static void dogB() {
		Optional<Dog> optionalDogB = Optional.of(new Dog("Bandit"));//variable dec is data type, then variable name, then initialize =
		System.out.println(optionalDogB);// this shows as an optional
		//calling dogA with optionalDogB
		System.out.println(dogA (optionalDogB));
		Optional<Dog> findDogOptional = Optional.empty();
		try {
			dogA (findDogOptional);
		}
			catch(NoSuchElementException e) {
				System.out.println(e.getMessage());
			}
		}
}

	
	
	
