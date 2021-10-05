package service;

import java.util.List;

import dao.Dog;
import dao.DogDao;

public class DogSort {
	
private static DogDao dogDao = new DogDao();

public static void main(String[] args) {
	List<Dog> dogs = dogDao.getDogs();
	
	lambdaSortDogs(dogs);
	List<Dog> dogs4 = dogDao.getDogs();
	methodReferenceSortDogs(dogs4);
}
public static void lambdaSortDogs(List<Dog> dogs) {


	dogs.sort((d1, d2) -> Dog.compareDog(d1, d2));
	System.out.println(dogs);
}
public static void methodReferenceSortDogs(List<Dog> dogs) {


	dogs.sort(Dog::compareDog);
	System.out.println(dogs);
}	
}
